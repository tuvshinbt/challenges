package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _033_FirstBadVersionTest {

	private final _033_FirstBadVersion solution = new _033_FirstBadVersion();

	@Test
	public void example1() {
		int n = 5;
		int actual = solution.firstBadVersion(n);
		int expected = 4;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int n = 2126753390;
		int actual = solution.firstBadVersion(n);
		int expected = 1702766719;

		assertEquals(expected, actual);
	}
}
