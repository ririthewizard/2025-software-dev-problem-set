public int maxProfit(int[] prices) {
	int left = 0, right = 1;
	int maxProfit = 0;

	while (right < prices.length) {
		if (prices[left] < prices[right]) {
			int profit = prices[right] - prices[left];
			Math.max(maxProfit, profit);
		} else {
			left = right;
		}
		right++;
	}
	return maxProfit;
}
