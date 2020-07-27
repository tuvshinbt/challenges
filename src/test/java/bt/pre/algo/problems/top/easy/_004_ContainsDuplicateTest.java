package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _004_ContainsDuplicateTest {

	private final _004_ContainsDuplicate solution = new _004_ContainsDuplicate();

	@Test
	public void example1Test() {
		int[] nums = new int[] { 1, 2, 3, 1 };

		boolean actual = solution.containsDuplicate(nums);

		assertEquals(true, actual);
	}

	@Test
	public void example2Test() {
		int[] nums = new int[] { 1, 2, 3, 4 };

		boolean actual = solution.containsDuplicate(nums);

		assertEquals(false, actual);
	}

	@Test
	public void example3Test() {
		int[] nums = new int[] { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };

		boolean actual = solution.containsDuplicate(nums);

		assertEquals(true, actual);
	}
}
