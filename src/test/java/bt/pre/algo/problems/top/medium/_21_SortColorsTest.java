package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _21_SortColorsTest {

	private final _21_SortColors solution = new _21_SortColors();

	@Test
	public void example1() {
		int[] nums = new int[] { 2, 0, 2, 1, 1, 0 };
		solution.sortColors(nums);
		int[] expected = new int[] { 0, 0, 1, 1, 2, 2 };

		assertArrayEquals(expected, nums);
	}

	@Test
	public void example2() {
		int[] nums = new int[] { 1, 0, 0 };
		solution.sortColors(nums);
		int[] expected = new int[] { 0, 0, 1 };

		assertArrayEquals(expected, nums);
	}

	@Test
	public void example3() {
		int[] nums = new int[] { 0, 0 };
		solution.sortColors(nums);
		int[] expected = new int[] { 0, 0 };

		assertArrayEquals(expected, nums);
	}
}
