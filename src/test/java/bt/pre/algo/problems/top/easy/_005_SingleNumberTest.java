package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _005_SingleNumberTest {

	private final _005_SingleNumber solution = new _005_SingleNumber();

	@Test
	public void example1Test() {
		int[] nums = new int[] { 2, 2, 1 };

		int actual = solution.singleNumber(nums);

		assertEquals(1, actual);
	}

	@Test
	public void example2Test() {
		int[] nums = new int[] { 4, 1, 2, 1, 2 };

		int actual = solution.singleNumber(nums);

		assertEquals(4, actual);
	}

	@Test
	public void example3Test() {
		int[] nums = new int[] { -1 };

		int actual = solution.singleNumber(nums);

		assertEquals(-1, actual);
	}

}
