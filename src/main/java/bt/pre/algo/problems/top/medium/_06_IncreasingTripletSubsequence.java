package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.List;

public class _06_IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {

		if (nums == null || nums.length < 3)
			return false;

		List<Integer> pos = new ArrayList<Integer>();
		for (int i = 0; i < nums.length - 1; i++) {
			int num1 = nums[i];
			int num2 = nums[i + 1];
			if (num1 < num2) {
				pos.add(i);
			}
		}
		if (pos.size() > 1) {
			for (int i = 0; i < pos.size() - 1; i++) {
				System.out.printf("%s %s %s %s",
						nums[pos.get(i)],
						nums[pos.get(i + 1)],
						nums[pos.get(i) + 1],
						nums[pos.get(i + 1) + 1]);
				if (nums[pos.get(i)] < nums[pos.get(i + 1)]
						|| nums[pos.get(i) + 1] < nums[pos.get(i + 1) + 1]) {
//				if (nums[pos.get(i)] < nums[pos.get(i + 1)] ||
//						(nums[pos.get(i)] == nums[pos.get(i + 1)]
//								&& nums[pos.get(i) + 1] < nums[pos.get(i + 1) + 1])) {

					System.out.println(" TRUE");
					return true;
				}
				System.out.println("");
			}
		}
		return false;
	}

	public boolean solutiOnIncreasingTriplet(int[] nums) {
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;

		for (int num : nums) {
			if (num < min1) {
				min1 = num;
			}
			if (num > min1) {
				min2 = Math.min(num, min2);
			}
			if (num > min2) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.printf("%s %s %s %s", 1, 2, 3, 4);
	}
}
