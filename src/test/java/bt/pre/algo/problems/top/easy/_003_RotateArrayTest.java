package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _003_RotateArrayTest {
	private final _003_RotateArray solution = new _003_RotateArray();

	@Test
	public void example1Test() {
		int[] nums = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int k = 3;

		solution.rotate(nums, k);

		int[] expected = new int[] { 5, 6, 7, 1, 2, 3, 4 };
		assertArrayEquals(expected, nums);
	}

	@Test
	public void example2Test() {
		int[] nums = new int[] { -1, -100, 3, 99 };
		int k = 2;

		solution.rotate(nums, k);

		int[] expected = new int[] { 3, 99, -1, -100 };
		assertArrayEquals(expected, nums);
	}

}
