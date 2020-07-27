package bt.pre.algo.problems.top.easy;

public class _037_HouseRobber {
	public int rob(int[] nums) {
		int[] dp = new int[nums.length];
		if (nums == null || nums.length == 0)
			return 0;

		if (nums.length == 1)
			return nums[0];
		if (nums.length == 2) {
			return Math.max(nums[1], nums[0]);
		}
		dp[0] = nums[0];
		dp[1] = nums[1];

		int money = Math.max(nums[1], nums[0]);

		for (int i = 2; i < nums.length; i++) {
			if (i - 3 >= 0) {
				dp[i] = Math.max(dp[i - 3] + nums[i], dp[i - 2] + nums[i]);
			} else {
				dp[i] = nums[i - 2] + nums[i];
			}
			if (dp[i] > money) {
				money = dp[i];
			}
		}
		return money;
	}

	public int robSolution(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;
		if (nums.length == 1)
			return nums[0];

		int[] dp = new int[nums.length];
		dp[0] = nums[0];
		dp[1] = Math.max(dp[0], nums[1]);
		if (nums.length < 3)
			return dp[nums.length - 1];

		for (int i = 2; i < nums.length; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}

		return dp[nums.length - 1];
	}
}
