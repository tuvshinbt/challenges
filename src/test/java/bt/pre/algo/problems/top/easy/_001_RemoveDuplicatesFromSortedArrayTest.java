package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _001_RemoveDuplicatesFromSortedArrayTest {
	private final _001_RemoveDuplicatesFromSortedArray solution = new _001_RemoveDuplicatesFromSortedArray();

	@Test
	public void testExample1() {
		int[] nums = new int[] { 1, 1, 2 };
		int actual = solution.removeDuplicates(nums);
		int[] actualArray = new int[actual];
		System.arraycopy(nums, 0, actualArray, 0, actual);

		// expected
		int expected = 2;
		int[] expectedArray = new int[] { 1, 2 };
		assertEquals(expected, actual);
		assertArrayEquals(expectedArray, actualArray);
	}

	@Test
	public void testExample2() {
		int[] nums = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		int actual = solution.removeDuplicates(nums);
		int[] actualArray = new int[actual];
		System.arraycopy(nums, 0, actualArray, 0, actual);

		// expected
		int expected = 5;
		int[] expectedArray = new int[] { 0, 1, 2, 3, 4 };
		assertEquals(expected, actual);
		assertArrayEquals(expectedArray, actualArray);
	}
}
