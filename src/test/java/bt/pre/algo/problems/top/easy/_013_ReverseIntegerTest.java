package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _013_ReverseIntegerTest {

	private final _013_ReverseInteger solution = new _013_ReverseInteger();

	@Test
	public void testExample1() {
		int num = 123;

		int actual = solution.reverse(num);

		int expected = 321;
		assertEquals(expected, actual);
	}

	@Test
	public void testExample2() {
		int num = -123;

		int actual = solution.reverse(num);

		int expected = -321;
		assertEquals(expected, actual);
	}

	@Test
	public void testExample3() {
		int num = 120;

		int actual = solution.reverse(num);

		int expected = 21;
		assertEquals(expected, actual);
	}

	@Test
	public void testExample4() {
		int num = 1534236469;

		int actual = solution.reverse(num);

		int expected = 0;
		assertEquals(expected, actual);
	}
}
