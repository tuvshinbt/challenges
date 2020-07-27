package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _01_3Sum {

	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) {
			return Collections.emptyList();
		}

		Arrays.parallelSort(nums);
		if (nums[0] == 0 && nums[nums.length - 1] == 0) {
			return Arrays.asList(Arrays.asList(0, 0, 0));
		}
		List<String> uniqueStrResult = new ArrayList<String>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		for (int i = 0; i < nums.length - 2; i++) {
			int a = nums[i];
			int sum = -a;
			Map<Integer, Integer> comb = new HashMap<Integer, Integer>();
			for (int j = i + 1; j < nums.length; j++) {
				if (comb.containsKey(sum - nums[j])) {
					List<Integer> iR = Arrays.asList(a, sum - nums[j], nums[j]);
					if (!uniqueStrResult.contains(iR.toString())) {
						uniqueStrResult.add(iR.toString());
						result.add(iR);
					}
				} else {
					comb.put(nums[j], j);
				}
			}
		}
		return result;
	}

	/**
	 * Solution
	 * 
	 * @param nums
	 * @return
	 */
	public List<List<Integer>> solutionThreeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length == 0) {
			return res;
		}

		Arrays.sort(nums);
		for (int i = 0; i < nums.length - 2; i++) {

			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}

			int j = i + 1;
			int k = nums.length - 1;

			while (j < k) {

				if (nums[i] + nums[j] + nums[k] == 0) {
					List<Integer> temp = new ArrayList<>();
					temp.add(nums[i]);
					temp.add(nums[j]);
					temp.add(nums[k]);
					res.add(temp);
					j++;
					k--;
					while (j < k && nums[j] == nums[j - 1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k + 1]) {
						k--;
					}
				} else if (nums[i] + nums[j] + nums[k] < 0) {
					j++;
				} else {
					k--;
				}
			}
		}

		return res;
	}
}
