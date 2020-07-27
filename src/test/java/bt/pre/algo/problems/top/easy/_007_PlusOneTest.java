package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _007_PlusOneTest {

	private final _007_PlusOne solution = new _007_PlusOne();

	@Test
	public void example1Test() {
		int[] input = new int[] { 1, 2, 3 };

		int[] actual = solution.plusOne(input);

		int[] expected = new int[] { 1, 2, 4 };
		assertArrayEquals(expected, actual);

	}

	@Test
	public void example2Test() {
		int[] input = new int[] { 4, 3, 2, 1 };

		int[] actual = solution.plusOne(input);

		int[] expected = new int[] { 4, 3, 2, 2 };
		assertArrayEquals(expected, actual);

	}

	@Test
	public void example3Test() {
		int[] input = new int[] { 9 };

		int[] actual = solution.plusOne(input);

		int[] expected = new int[] { 1, 0 };
		assertArrayEquals(expected, actual);

	}
}
