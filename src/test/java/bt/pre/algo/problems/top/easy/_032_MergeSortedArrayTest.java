package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _032_MergeSortedArrayTest {

	private final _032_MergeSortedArray solution = new _032_MergeSortedArray();

	@Test
	public void example1() {
		int[] nums1 = new int[] { 1, 2, 3, 0, 0, 0 };
		int m = 3;
		int[] nums2 = new int[] { 2, 5, 6 };
		int n = 3;

		solution.merge(nums1, m, nums2, n);
		int[] expected = new int[] { 1, 2, 2, 3, 5, 6 };

		assertArrayEquals(expected, nums1);
	}
}
