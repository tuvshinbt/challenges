package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _010_ValidSudokuTest {
	public final _010_ValidSudoku solution = new _010_ValidSudoku();

	@Test
	public void example1Test() {
		char[][] board = new char[][] {
				{ '5', '3', '.', '.', '7', '.', '.', '.', '.' },
				{ '6', '.', '.', '1', '9', '5', '.', '.', '.' },
				{ '.', '9', '8', '.', '.', '.', '.', '6', '.' },
				{ '8', '.', '.', '.', '6', '.', '.', '.', '3' },
				{ '4', '.', '.', '8', '.', '3', '.', '.', '1' },
				{ '7', '.', '.', '.', '2', '.', '.', '.', '6' },
				{ '.', '6', '.', '.', '.', '.', '2', '8', '.' },
				{ '.', '.', '.', '4', '1', '9', '.', '.', '5' },
				{ '.', '.', '.', '.', '8', '.', '.', '7', '9' }
		};

		boolean actual = solution.isValidSudoku(board);
		boolean expected = true;

		assertEquals(expected, actual);
	}
}
