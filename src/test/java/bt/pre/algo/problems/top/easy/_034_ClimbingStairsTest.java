package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _034_ClimbingStairsTest {

	private final _034_ClimbingStairs solution = new _034_ClimbingStairs();

	@Test
	public void example1() {
		int n = 2;
		int actual = solution.climbStairs(n);
		int expected = 2;
		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		int n = 3;
		int actual = solution.climbStairs(n);
		int expected = 3;
		assertEquals(expected, actual);
	}

}
