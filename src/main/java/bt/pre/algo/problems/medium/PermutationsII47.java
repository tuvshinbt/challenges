package bt.pre.algo.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

public class PermutationsII47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        if (nums == null || nums.length == 0) {
            return new ArrayList<List<Integer>>();
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        this.generatePermutation(nums, 0, nums.length - 1, result, new HashSet<String>());
        return result;
    }

    private void generatePermutation(int[] nums, int s, int e, List<List<Integer>> result, Set<String> uniqueSet) {

        if (s == e) {
            List<Integer> cl = Arrays.stream(nums).boxed().collect(Collectors.toList());
            if (uniqueSet.add(cl.toString()))
                result.add(cl);
        }
        else {
            for (int i = s; i <= e; i++) {
                if (s == i || (nums[s] != nums[i])) {
                    swap(nums, s, i);
                    generatePermutation(nums, s + 1, e, result, uniqueSet);
                    swap(nums, s, i);
                }
            }
        }

    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
