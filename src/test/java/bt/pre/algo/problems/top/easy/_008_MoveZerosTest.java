package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _008_MoveZerosTest {

	private final _008_MoveZeroes solution = new _008_MoveZeroes();

	@Test
	public void example1Test() {
		int[] nums = new int[] { 0, 1, 0, 3, 12 };

		solution.moveZeroes(nums);
		int[] expected = new int[] { 1, 3, 12, 0, 0 };

		assertArrayEquals(expected, nums);
	}
}
