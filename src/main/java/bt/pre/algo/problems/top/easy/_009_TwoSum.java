package bt.pre.algo.problems.top.easy;

import java.util.HashMap;
import java.util.Map;

public class _009_TwoSum {
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0)
			return new int[] {};

		Map<Integer, Integer> mapB = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			if (mapB.containsKey(target - nums[i])) {
				return new int[] { mapB.get(target - nums[i]), i };
			}
			mapB.put(nums[i], i);
		}
		return new int[] {};
	}
}
