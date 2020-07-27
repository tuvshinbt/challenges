package bt.pre.algo.problems.top.easy;

public class _049_MissingNumber {
	public int missingNumber(int[] nums) {

		int sum = 0;
		int sumOfNums = 0;

		for (int i = 0; i < nums.length; i++) {
			sum += i + 1;
			sumOfNums += nums[i];
		}
		return sum - sumOfNums;
	}

	public int solutionMissingNumber(int[] nums) {
		int inputXOR = 0, seriesXOR = 0;
		for (int i = 0; i < nums.length; i++) {
			inputXOR ^= nums[i];
		}
		for (int i = 1; i <= nums.length; i++) {
			seriesXOR ^= i;
		}
		return seriesXOR ^ inputXOR;
	}
}
