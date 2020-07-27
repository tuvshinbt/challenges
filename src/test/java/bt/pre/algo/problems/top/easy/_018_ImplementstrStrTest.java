package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _018_ImplementstrStrTest {

	private final _018_ImplementstrStr solution = new _018_ImplementstrStr();

	@Test
	public void example1() {
		String haystack = "hello", needle = "ll";

		int actual = solution.strStr(haystack, needle);
		int expected = 2;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		String haystack = "aaaaa", needle = "bba";

		int actual = solution.strStr(haystack, needle);
		int expected = -1;

		assertEquals(expected, actual);
	}
}
