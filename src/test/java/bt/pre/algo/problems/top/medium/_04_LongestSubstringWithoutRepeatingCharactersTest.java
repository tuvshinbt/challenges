package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _04_LongestSubstringWithoutRepeatingCharactersTest {

	private final _04_LongestSubstringWithoutRepeatingCharacters solution = new _04_LongestSubstringWithoutRepeatingCharacters();

	@Test
	public void example1() {
		String s = "abcabcbb";

		int actual = solution.lengthOfLongestSubstring(s);
		int expected = 3;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		String s = "bbbbb";

		int actual = solution.lengthOfLongestSubstring(s);
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		String s = "pwwkew";

		int actual = solution.lengthOfLongestSubstring(s);
		int expected = 3;

		assertEquals(expected, actual);
	}

	@Test
	public void example4() {
		String s = "wpwkew";

		int actual = solution.lengthOfLongestSubstring(s);
		int expected = 4;

		assertEquals(expected, actual);
	}

	@Test
	public void example4s() {
		String s = "awpwkew";

		int actual = solution.solutionLengthOfLongestSubstring(s);
		int expected = 4;

		assertEquals(expected, actual);
	}

}
