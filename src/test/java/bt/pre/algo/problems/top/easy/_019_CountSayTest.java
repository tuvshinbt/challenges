package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _019_CountSayTest {

	private final _019_CountSay solution = new _019_CountSay();

	@Test
	public void example1Test() {
		int n = 1;

		String actual = solution.countAndSay(n);
		String expected = "1";

		assertEquals(expected, actual);
	}

	@Test
	public void example2Test() {
		int n = 4;

		String actual = solution.countAndSay(n);
		String expected = "1211";

		assertEquals(expected, actual);
	}

	@Test
	public void example3Test() {
		int n = 2;

		String actual = solution.countAndSay(n);
		String expected = "11";

		assertEquals(expected, actual);
	}
}
