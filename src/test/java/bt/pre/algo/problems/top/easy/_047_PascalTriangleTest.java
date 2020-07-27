package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _047_PascalTriangleTest {

	private final _047_PascalTriangle solution = new _047_PascalTriangle();

	@Test
	public void example1() {
		int numRows = 5;

		List<List<Integer>> actual = solution.generate(numRows);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(1, 1), Arrays.asList(1, 2, 1),
				Arrays.asList(1, 3, 3, 1), Arrays.asList(1, 4, 6, 4, 1));
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
