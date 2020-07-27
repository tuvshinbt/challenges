package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _002_BestTimeToBuyAndSellStockIITest {
	private final _002_BestTimeToBuyAndSellStockII solution = new _002_BestTimeToBuyAndSellStockII();

	@Test
	public void example1Test() {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };
		int actual = solution.maxProfit(prices);

		int expected = 7;
		assertEquals(expected, actual);
	}

	@Test
	public void example2Test() {
		int[] prices = new int[] { 1, 2, 3, 4, 5 };
		int actual = solution.maxProfit(prices);

		int expected = 4;
		assertEquals(expected, actual);
	}

	@Test
	public void example3Test() {
		int[] prices = new int[] { 7, 6, 4, 3, 1 };
		int actual = solution.maxProfit(prices);

		int expected = 0;
		assertEquals(expected, actual);
	}
}
