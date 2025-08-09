public int evalRPN(String[] tokens) {
	Deque<Integer> stack = new ArrayDeque<Integer>();

	for (String token : tokens) {
		if (isOperator(token)) {
			int tokA = stack.pop();
			int tokB = stack.pop();

			stack.push(evaluate(tokB, tokA, token));
		} else {
			stack.push(Integer.parseInt(token));
		}
	}
	return stack.peek();
}

public Boolean isOperator(String c) {
	return c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/");
}

public int evaluate(int a, int b, String op) {
	switch (op) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		default:
			System.out.println("Not a valid operator!");
	}
	return 0;
}
