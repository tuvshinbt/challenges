package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _05_LongestPalindromicSubstringTest {

	private final _05_LongestPalindromicSubstring solution = new _05_LongestPalindromicSubstring();

	@Test
	public void example1() {
		String s = "babad";

		String actual = solution.longestPalindrome(s);
		String expected = "bab";

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		String s = "cbbd";

		String actual = solution.longestPalindrome(s);
		String expected = "bb";

		assertEquals(expected, actual);
	}
}
