package bt.pre.algo.problems.top.easy;

import java.util.Arrays;
import java.util.List;

public class _032_MergeSortedArray {

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		for (int i = 0; i < n; i++) {
			nums1[m + i] = nums2[i];
		}
		Arrays.sort(nums1);
	}

	public void mergeSolution(int[] nums1, int m, int[] nums2, int n) {
		if (nums2 == null || n == 0) {
			return;
		}
		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;
		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			} else {
				nums1[k--] = nums2[j--];
			}
		}
		while (j >= 0) {
			nums1[k--] = nums2[j--];
		}
	}
}
