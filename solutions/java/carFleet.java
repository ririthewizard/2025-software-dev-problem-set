public int carFleet(int target, int[] position, int[] speed) {
	int[][] pair = new int[position.length][2];
	for (int i = 0; i < position.length; i++) {
		pair[i][0] = position[i];
		pair[i][1] = speed[i];
	}

	Arrays.sort(pair, (a, b) -> Integer.compare(b[0], a[0]));
	Stack<Double> stack = new Stack<>();

	for (int[] p : pair) {
		int pos = p[0];
		int spd = p[1];
		double timeToTarget = (double) (target - pos) / spd;

		if (stack.isEmpty() ||
				timeToTarget > stack.peek()) {
			stack.push(timeToTarget);
		}
	}

	return stack.size();
}
