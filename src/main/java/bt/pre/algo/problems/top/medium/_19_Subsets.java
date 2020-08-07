package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.List;

public class _19_Subsets {

	public List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums.length == 0) {
			return result;
		}

		helper(result, new ArrayList<>(), nums, 0);
		return result;
	}

	private void helper(List<List<Integer>> result, List<Integer> cur, int[] nums, int idx) {

		if (idx == nums.length) {
			result.add(new ArrayList<Integer>(cur));
			return;
		}

		helper(result, cur, nums, idx + 1);

		cur.add(nums[idx]);
		helper(result, cur, nums, idx + 1);
		cur.remove(cur.size() - 1);
	}
}
