package bt.pre.algo.problems.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Permutations46 {
    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length == 0) {
            return Collections.emptyList();
        }

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        this.generatePermutation(nums, 0, nums.length - 1, result);
        return result;
    }

    private void generatePermutation(int[] input, int s, int e, List<List<Integer>> result) {

        if (s == e) {
            result.add(Arrays.stream(input).boxed().collect(Collectors.toList()));
        } else {
            for (int i = s; i <= e; i++) {
                input = swap(input, s, i);
                generatePermutation(input, s + 1, e, result);
                input = swap(input, s, i);
            }
        }
    }

    private int[] swap(int[] input, int i, int j) {
        int temp = input[i];
        input[i] = input[j];
        input[j] = temp;
        return input;
    }
}
