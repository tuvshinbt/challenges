package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _015_ValidAnagramTest {
	private final _015_ValidAnagram solution = new _015_ValidAnagram();

	@Test
	public void testExample1() {
		String s = "anagram", t = "nagaram";

		boolean actual = solution.isAnagram(s, t);

		assertTrue(actual);
	}

	@Test
	public void testExample2() {
		String s = "rat", t = "car";

		boolean actual = solution.isAnagram(s, t);

		assertFalse(actual);
	}
	@Test
	public void testExample3() {
		String s = "aa", t = "bb";

		boolean actual = solution.isAnagram(s, t);

		assertFalse(actual);
	}
}
