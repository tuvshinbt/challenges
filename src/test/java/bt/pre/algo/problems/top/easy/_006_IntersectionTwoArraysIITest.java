package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class _006_IntersectionTwoArraysIITest {

	private final _006_IntersectionTwoArraysII solution = new _006_IntersectionTwoArraysII();

	@Test
	public void example1Test() {
		int nums1[] = new int[] { 1, 2, 2, 1 }, nums2[] = new int[] { 2, 2 };

		int actual[] = solution.intersect(nums1, nums2);

		int expected[] = new int[] { 2, 2 };
		assertArrayEquals(expected, actual);
	}

	@Test
	public void example2Test() {
		int nums1[] = new int[] { 4, 9, 5 }, nums2[] = new int[] { 9, 4, 9, 8, 4 };

		int actual[] = solution.intersect(nums1, nums2);

		int expected[] = new int[] { 4, 9 };
		assertArrayEquals(expected, actual);
	}

	@Test
	public void example3Test() {
		int nums1[] = new int[] { 1, 2 }, nums2[] = new int[] { 1, 1 };

		int actual[] = solution.intersect(nums1, nums2);

		int expected[] = new int[] { 1 };
		assertArrayEquals(expected, actual);
	}
}
