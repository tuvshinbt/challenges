package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _017_StringToIntegerTest {

	private final _017_StringToInteger solution = new _017_StringToInteger();

	@Test
	public void example1Test() {
		String str = "42";

		int actual = solution.myAtoi(str);
		int expected = 42;

		assertEquals(expected, actual);
	}

	@Test
	public void example2Test() {
		String str = "   -42";

		int actual = solution.myAtoi(str);
		int expected = -42;

		assertEquals(expected, actual);
	}

	@Test
	public void example3Test() {
		String str = "4193 with words";

		int actual = solution.myAtoi(str);
		int expected = 4193;

		assertEquals(expected, actual);
	}

	@Test
	public void example4Test() {
		String str = "-91283472332";

		int actual = solution.myAtoi(str);
		int expected = -2147483648;

		assertEquals(expected, actual);
	}

	@Test
	public void example5Test() {
		String str = "+-2";

		int actual = solution.myAtoi(str);
		int expected = 0;

		assertEquals(expected, actual);
	}

	@Test
	public void example6Test() {
		String str = "2147483648";

		int actual = solution.myAtoi(str);
		int expected = 2147483647;

		assertEquals(expected, actual);
	}
}
