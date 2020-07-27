package bt.pre.algo.problems.top.easy;

public class _008_MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length == 0)
			return;
		int c = 0, i = 0;
		while (i < nums.length) {
			if (nums[i] != 0) {
				nums[c++] = nums[i];
			}
			i++;
		}
		while (c < nums.length) {
			nums[c++] = 0;
		}
	}
}
