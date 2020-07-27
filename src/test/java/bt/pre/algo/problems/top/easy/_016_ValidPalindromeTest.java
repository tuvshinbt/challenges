package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _016_ValidPalindromeTest {
	private final _016_ValidPalindrome solution = new _016_ValidPalindrome();

	@Test
	public void example1Test() {
		String s = "A man, a plan, a canal: Panama";

		assertTrue(solution.isPalindrome(s));
	}

	@Test
	public void example2Test() {
		String s = "race a car";

		assertFalse(solution.isPalindrome(s));
	}

	@Test
	public void example3Test() {
		String s = ".,";

		assertTrue(solution.isPalindrome(s));
	}

	@Test
	public void example4Test() {
		String s = "0P";

		assertFalse(solution.isPalindrome(s));
	}
}
