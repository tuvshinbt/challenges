package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _011_RotateImageTest {
	private final _011_RotateImage solution = new _011_RotateImage();

	@Test
	public void testExample1() {

		int[][] actual = new int[][] {
				{ 1, 2, 3 },
				{ 4, 5, 6 },
				{ 7, 8, 9 }
		};

		solution.rotate(actual);

		int[][] expected = new int[][] {
				{ 7, 4, 1 },
				{ 8, 5, 2 },
				{ 9, 6, 3 }
		};

		assertArrayEquals(expected[0], actual[0]);
		assertArrayEquals(expected[1], actual[1]);
		assertArrayEquals(expected[2], actual[2]);
	}

	@Test
	public void testExample2() {

		int[][] actual = new int[][] {
				{ 5, 1, 9, 11 },
				{ 2, 4, 8, 10 },
				{ 13, 3, 6, 7 },
				{ 15, 14, 12, 16 }
		};

		solution.rotate(actual);

		int[][] expected = new int[][] {
				{ 15, 13, 2, 5 },
				{ 14, 3, 4, 1 },
				{ 12, 6, 8, 9 },
				{ 16, 7, 10, 11 }
		};

		assertArrayEquals(expected[0], actual[0]);
		assertArrayEquals(expected[1], actual[1]);
		assertArrayEquals(expected[2], actual[2]);
		assertArrayEquals(expected[3], actual[3]);
	}
}
