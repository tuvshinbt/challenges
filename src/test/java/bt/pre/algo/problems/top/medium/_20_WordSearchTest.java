package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _20_WordSearchTest {

	private final _20_WordSearch solution = new _20_WordSearch();

	@Test
	public void example1() {
		char[][] board = new char[][] {
				{ 'A', 'B', 'C', 'E' },
				{ 'S', 'F', 'C', 'S' },
				{ 'A', 'D', 'E', 'E' }
		};
		String word = "ABCCED";

		boolean actual = solution.exist(board, word);
		boolean expected = true;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		char[][] board = new char[][] {
				{ 'A', 'B', 'C', 'E' },
				{ 'S', 'F', 'C', 'S' },
				{ 'A', 'D', 'E', 'E' }
		};
		String word = "SEE";

		boolean actual = solution.exist(board, word);
		boolean expected = true;

		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		char[][] board = new char[][] {
				{ 'A', 'B', 'C', 'E' },
				{ 'S', 'F', 'C', 'S' },
				{ 'A', 'D', 'E', 'E' }
		};
		String word = "ABCB";

		boolean actual = solution.exist(board, word);
		boolean expected = false;

		assertEquals(expected, actual);
	}

	@Test
	public void example4() {
		char[][] board = new char[][] {
				{ 'A' }
		};
		String word = "A";

		boolean actual = solution.exist(board, word);
		boolean expected = true;

		assertEquals(expected, actual);
	}

	@Test
	public void example5() {
		char[][] board = new char[][] {
				{ 'A', 'A' }
		};
		String word = "AA";

		boolean actual = solution.exist(board, word);
		boolean expected = true;

		assertEquals(expected, actual);
	}
}
