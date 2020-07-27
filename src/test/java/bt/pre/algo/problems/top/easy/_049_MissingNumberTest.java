package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _049_MissingNumberTest {

	private final _049_MissingNumber solution = new _049_MissingNumber();

	@Test
	public void example1() {
		int[] nums = new int[] { 3, 0, 1 };
		int actual = solution.missingNumber(nums);
		int expected = 2;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int[] nums = new int[] { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int actual = solution.missingNumber(nums);
		int expected = 8;

		assertEquals(expected, actual);
	}
}
