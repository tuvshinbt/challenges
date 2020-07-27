package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _035_BestTimeBuySellTest {

	private final _035_BestTimeBuySell solution = new _035_BestTimeBuySell();

	@Test
	public void example1() {
		int[] prices = new int[] { 7, 1, 5, 3, 6, 4 };

		int actual = solution.maxProfit(prices);
		int expected = 5;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int[] prices = new int[] { 7, 6, 4, 3, 1 };

		int actual = solution.maxProfit(prices);
		int expected = 0;

		assertEquals(expected, actual);
	}
}
