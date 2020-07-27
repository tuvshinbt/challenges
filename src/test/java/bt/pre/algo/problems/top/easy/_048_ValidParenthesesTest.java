package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _048_ValidParenthesesTest {

	public final _048_ValidParentheses solution = new _048_ValidParentheses();

	@Test
	public void example1() {
		String s = "()";
		boolean actual = solution.isValid(s);

		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		String s = "()[]{}";
		boolean actual = solution.isValid(s);

		boolean expected = true;
		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		String s = "(]";
		boolean actual = solution.isValid(s);

		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void example4() {
		String s = "([)]";
		boolean actual = solution.isValid(s);

		boolean expected = false;
		assertEquals(expected, actual);
	}

	@Test
	public void example5() {
		String s = "{[]}";
		boolean actual = solution.isValid(s);

		boolean expected = true;
		assertEquals(expected, actual);
	}
}
