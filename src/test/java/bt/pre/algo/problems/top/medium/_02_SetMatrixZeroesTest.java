package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _02_SetMatrixZeroesTest {

	private final _02_SetMatrixZeroes solution = new _02_SetMatrixZeroes();

	@Test
	public void example1() {
		int[][] matrix = { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };

		solution.setZeroes(matrix);

		int[][] expected = { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };

		assertArrayEquals(expected[0], matrix[0]);
		assertArrayEquals(expected[1], matrix[1]);
		assertArrayEquals(expected[2], matrix[2]);
	}

	@Test
	public void example2() {
		int[][] matrix = { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };

		solution.setZeroes(matrix);

		int[][] expected = { { 0, 0, 0, 0 }, { 0, 4, 5, 0 }, { 0, 3, 1, 0 } };

		assertArrayEquals(expected[0], matrix[0]);
		assertArrayEquals(expected[1], matrix[1]);
		assertArrayEquals(expected[2], matrix[2]);
	}

	@Test
	public void example3() {
		int[][] matrix = { { 1, 0 } };

		solution.setZeroes(matrix);

		int[][] expected = { { 0, 0 } };

		assertArrayEquals(expected[0], matrix[0]);
	}

	@Test
	public void example4() {
		int[][] matrix = { { 1, 0, 3 } };

		solution.setZeroes(matrix);

		int[][] expected = { { 0, 0, 0 } };

		assertArrayEquals(expected[0], matrix[0]);
	}
}
