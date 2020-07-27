package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _042_PowerOfThreeTest {

	private final _042_PowerOfThree solution = new _042_PowerOfThree();

	@Test
	public void example1() {
		assertTrue(solution.isPowerOfThree(9));
	}

	@Test
	public void example2() {
		assertFalse(solution.isPowerOfThree(0));
	}

	@Test
	public void example3() {
		assertTrue(solution.isPowerOfThree(27));
	}

	@Test
	public void example4() {
		assertFalse(solution.isPowerOfThree(45));
	}
}
