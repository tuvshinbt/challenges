package bt.pre.algo.problems.top.easy;

public class _035_BestTimeBuySell {
	public int maxProfit(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}

		int profit = 0;
		int buy = Integer.MAX_VALUE, buyIndx = -1;
		int sell = Integer.MIN_VALUE, sellIndx = -1;

		for (int i = 0; i < prices.length; i++) {
			if (sell == Integer.MIN_VALUE || sell < prices[i]) {
				sell = prices[i];
				sellIndx = i;
			}

			if (buy == Integer.MAX_VALUE || buy > prices[i]) {
				buy = prices[i];
				buyIndx = i;
				sell = Integer.MIN_VALUE;
				sellIndx = i;
			}

			if (sellIndx != buyIndx && profit < prices[sellIndx] - prices[buyIndx]) {
				profit = prices[sellIndx] - prices[buyIndx];
			}
		}

		return profit;
	}

	public int maxProfitSolution(int[] prices) {
		if (prices == null || prices.length == 0) {
			return 0;
		}
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < prices.length; i++) {
			min = Math.min(min, prices[i]);
			max = Math.max(max, prices[i] - min);
		}
		return max;
	}
}
