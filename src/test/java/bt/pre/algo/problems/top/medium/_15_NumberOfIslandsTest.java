package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class _15_NumberOfIslandsTest {

	private final _15_NumberOfIslands solution = new _15_NumberOfIslands();

	@Test
	public void example1() {
		char[][] grid = new char[][] {
				{ '1', '1', '1', '1', '0' },
				{ '1', '1', '0', '1', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '0', '0', '0' }
		};

		int actual = solution.numIslands(grid);
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		char[][] grid = new char[][] {
				{ '1', '1', '0', '0', '0' },
				{ '1', '1', '0', '0', '0' },
				{ '0', '0', '1', '0', '0' },
				{ '0', '0', '0', '1', '1' }
		};

		int actual = solution.numIslands(grid);
		int expected = 3;

		assertEquals(expected, actual);
	}
}
