package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _043_RomanToIntegerTest {

	private final _043_RomanToInteger solution = new _043_RomanToInteger();

	@Test
	public void example1() {
		String s = "III";

		int actual = solution.romanToInt(s);
		int expected = 3;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		String s = "IV";

		int actual = solution.romanToInt(s);
		int expected = 4;

		assertEquals(expected, actual);
	}

	@Test
	public void example3() {
		String s = "IX";

		int actual = solution.romanToInt(s);
		int expected = 9;

		assertEquals(expected, actual);
	}

	@Test
	public void example4() {
		String s = "LVIII";

		int actual = solution.romanToInt(s);
		int expected = 58;

		assertEquals(expected, actual);
	}

	@Test
	public void example5() {
		String s = "MCMXCIV";

		int actual = solution.romanToInt(s);
		int expected = 1994;

		assertEquals(expected, actual);
	}
}
