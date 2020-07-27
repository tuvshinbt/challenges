package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _06_IncreasingTripletSubsequenceTest {

	private final _06_IncreasingTripletSubsequence solution = new _06_IncreasingTripletSubsequence();

	@Test
	public void example1() {
		int[] nums = { 1, 2, 3, 4, 5 };

		assertTrue(solution.increasingTriplet(nums));
	}

	@Test
	public void example2() {
		int[] nums = { 5, 4, 3, 2, 1 };

		assertFalse(solution.increasingTriplet(nums));
	}

	@Test
	public void example3() {
		int[] nums = { 2, 4, -2, -3 };

		assertFalse(solution.increasingTriplet(nums));
	}

	@Test
	public void example4() {
		int[] nums = { 2, 5, 3, 4, 5 };

		assertTrue(solution.increasingTriplet(nums));
	}

	@Test
	public void example5() {
		int[] nums = { 5, 1, 5, 5, 2, 5, 4 };

		assertTrue(solution.solutiOnIncreasingTriplet(nums));
	}

	@Test
	public void example6() {
		int[] nums = { 2, 1, 5, 0, 3 };

		assertFalse(solution.increasingTriplet(nums));
	}

	@Test
	public void example8() {
		int[] nums = { 1, 2, 1, 2, 1, 2, 1, 2, 1, 2 };

		assertFalse(solution.increasingTriplet(nums));
	}

	@Test
	public void example7() {
		int[] nums = { 1, 0, 0, 10, 0, 0, 100000000 };

		assertTrue(solution.increasingTriplet(nums));
	}

	@Test
	public void example9() {
		int[] nums = { 1, 0, 0, 2, 0, 0, -1, -1, 3 };

		assertTrue(solution.increasingTriplet(nums));
	}

	@Test
	public void example10() {
		int[] nums = { 3, 4, 2, 1, 5 };

		assertTrue(solution.solutiOnIncreasingTriplet(nums));
	}
}
