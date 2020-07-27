package bt.pre.algo.problems.top.easy;

public class _036_MaximumSubarray {
	public int maxSubArray(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1) {
			return nums[0];
		}

		int curMax = nums[0], max = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] < (curMax + nums[i])) {
				curMax += nums[i];
			} else {
				curMax = nums[i];
			}
			max = Math.max(max, curMax);
		}
		return max;
	}

	public int maxSubArraySolution(int[] nums) {
		if (nums == null || nums.length <= 0) {
			return 0;
		}

		int max = Integer.MIN_VALUE;
		int sum = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			if (sum > max) {
				max = sum;
			}

			if (sum < 0) {
				sum = 0;
			}
		}

		return max;
	}
}
