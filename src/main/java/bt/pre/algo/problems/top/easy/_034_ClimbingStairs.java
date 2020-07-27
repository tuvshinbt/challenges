package bt.pre.algo.problems.top.easy;

public class _034_ClimbingStairs {

	public int climbStairs(int n) {

		return climbStairsDynamic(n, new int[n + 1]);
	}

	public int climbStairsDynamic(int n, int steps[]) {
		if (n == 0)
			return 1;
		if (n == 1) {
			if (steps[n] == 0) {
				steps[n] = climbStairsDynamic(n - 1, steps);
			}
			return steps[n];
		} else {
			if (steps[n] == 0) {
				steps[n] = climbStairsDynamic(n - 1, steps) + climbStairsDynamic(n - 2, steps);
			}
			return steps[n];
		}
	}

	public int climbStairsSolution(int n) {
		if (n == 1)
			return 1;
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i <= n; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		return dp[n];
	}
}
