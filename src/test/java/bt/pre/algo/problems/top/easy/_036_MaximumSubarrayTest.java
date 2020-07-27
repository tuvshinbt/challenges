package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _036_MaximumSubarrayTest {

	private _036_MaximumSubarray solution = new _036_MaximumSubarray();

	@Test
	public void example1() {
		int[] nums = new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

		int actual = solution.maxSubArray(nums);
		int expected = 6;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int[] nums = new int[] { -1, -2 };

		int actual = solution.maxSubArray(nums);
		int expected = -1;

		assertEquals(expected, actual);
	}
}
