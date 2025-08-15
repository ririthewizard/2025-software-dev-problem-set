class Solution {
	public void backtrack(int n, int openP, int closeP, List<String> res, String stack) {
		if (openP == n && closeP == n) {
			res.add(stack.toString);
			return;
		}
		if (openP < n) {
			stack.append("(");
			backtrack(n, openP + 1, closeP, res, stack);
			stack.deleteCharAt(stack.length() - 1);
		}
		if (closeP < openP) {
			stack.append(")");
			backtrack(n, openP, closeP + 1, res, stack);
			stack.deleteCharAt(stack.length() - 1);
		}
	}

	public List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<>();
		StringBuilder stack = new StringBuilder();
		backtrack(n, 0, 0, res, stack);
		return res;
	}
}
