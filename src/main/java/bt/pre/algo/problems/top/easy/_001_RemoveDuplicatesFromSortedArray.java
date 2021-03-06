package bt.pre.algo.problems.top.easy;

/**
 * Problem: Given a sorted array nums, remove the duplicates in-place such that
 * each element appear only once and return the new length.
 * 
 * Do not allocate extra space for another array, you must do this by modifying
 * the input array in-place with O(1) extra memory.
 */
public class _001_RemoveDuplicatesFromSortedArray {
	public int removeDuplicates(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		int len = nums.length, nLen = 1, cur = 0;
		for (int i = 1; i < len; i++) {
			if (nums[cur] != nums[i]) {
				nLen++;
				nums[++cur] = nums[i];
			}
		}
		return nLen;
	}
}
