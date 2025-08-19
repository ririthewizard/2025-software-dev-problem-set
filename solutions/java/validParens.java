class Solution {
    public boolean isValid(string s) {

    }












	// public boolean isValid(string s) {
	// 	ArrayDeque<String> stack = new ArrayDeque<>();
	// 	java.util.Map<Character, Character> closeToOpen = new java.util.HashMap<>();
	//
	// 	closeToOpen.put(')', '(');
	// 	closeToOpen.put('}', '{');
	// 	closeToOpen.put(']', '[');
	//
	// 	for (char c : s.toCharArray()) {
	// 		if (closeToOpen.containsKey(c)) {
	// 			if (!stack.isEmpty() && stack.peek() == closeToOpen.get(c)) {
	// 				stack.pop();
	// 			} else {
	// 				return false;
	// 			}
	// 		}
	// 		stack.push(c);
	// 	}
	//
	// 	return stack.isEmpty();
	//
	// }
}
