package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _009_TwoSumTest {

	private final _009_TwoSum solution = new _009_TwoSum();

	@Test
	public void example1Test() {
		int[] input = new int[] { 2, 7, 11, 15 };
		int target = 9;

		int[] expected = this.solution.twoSum(input, target);

		int[] actual = new int[] { 0, 1 };
		assertArrayEquals(expected, actual);
	}
}
