package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _037_HouseRobberTest {

	private final _037_HouseRobber solution = new _037_HouseRobber();

	@Test
	public void example1() {
		int[] nums = new int[] { 1, 2, 3, 1 };

		int actual = solution.rob(nums);
		int expected = 4;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int[] nums = new int[] { 2, 7, 9, 3, 1 };

		int actual = solution.rob(nums);
		int expected = 12;

		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		int[] nums = new int[] { 1, 3, 1 };

		int actual = solution.rob(nums);
		int expected = 3;

		assertEquals(expected, actual);
	}
}
