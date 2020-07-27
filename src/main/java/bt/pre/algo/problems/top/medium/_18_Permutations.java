package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.List;

public class _18_Permutations {
	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();

		if (nums.length == 0) {
			return result;
		}
		List<Integer> numList = new ArrayList<Integer>(nums.length);
		for (int i : nums) {
			numList.add(i);
		}
		generate(result, new ArrayList<>(), numList);

		return result;

	}

	private void generate(List<List<Integer>> result, List<Integer> curList, List<Integer> nums) {

		if (nums.isEmpty()) {
			result.add(new ArrayList<Integer>(curList));
		}

		int numsSize = nums.size();
		for (int i = 0; i < numsSize; i++) {
			int elem = nums.remove(i);
			curList.add(elem);
			generate(result, curList, nums);
			curList.remove(curList.size() - 1);
			nums.add(i, elem);
		}
	}
}
