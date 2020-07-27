package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _020_LongestCommonPrefixTest {

	private final _020_LongestCommonPrefix solution = new _020_LongestCommonPrefix();

	@Test
	public void example1Test() {
		String[] strs = new String[] { "flower", "flow", "flight" };

		String actual = solution.longestCommonPrefix(strs);
		String expected = "fl";

		assertEquals(expected, actual);
	}

	@Test
	public void example2Test() {
		String[] strs = new String[] { "dog", "racecar", "car" };

		String actual = solution.longestCommonPrefix(strs);
		String expected = "";

		assertEquals(expected, actual);
	}
}
