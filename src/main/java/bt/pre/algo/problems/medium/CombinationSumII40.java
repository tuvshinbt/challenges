package bt.pre.algo.problems.medium;

import java.util.*;

/*
 * Given a collection of candidate numbers (candidates) and a target number (target), 
 * find all unique combinations in candidates where the candidate numbers sums to target.

Each number in candidates may only be used once in the combination.

Note:

All numbers (including target) will be positive integers.
The solution set must not contain duplicate combinations.
Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8,
A solution set is:
[
  [1, 7],
  [1, 2, 5],
  [2, 6],
  [1, 1, 6]
]
Example 2:

Input: candidates = [2,5,2,1,2], target = 5,
A solution set is:
[
  [1,2,2],
  [5]
]
 */
public class CombinationSumII40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        if (candidates == null || candidates.length == 0) {
            return null;
        }
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (target == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        Map<String, List<Integer>> all = new HashMap<String, List<Integer>>();
        List<Integer> list = new ArrayList<Integer>();
        this.findCombination(candidates, 0, target, all, list);
        result = new ArrayList<List<Integer>>(all.values());
        return result;
    }

    public void findCombination(int[] arr, int i, int target, Map<String, List<Integer>> all, List<Integer> list) {

        if (target == 0) {
            List<Integer> clist = new ArrayList<>(list);
            addListToAll(all, clist);
            return;
        }

        if (i >= arr.length) {
            return;
        }

        int c = arr[i];
        if (c <= target) {
            list.add(c);
            this.findCombination(arr, i + 1, target - c, all, list);
            list.remove(list.size() - 1);
        }
        this.findCombination(arr, i + 1, target, all, list);
        i++;
        return;
    }

    private void addListToAll(Map<String, List<Integer>> all, List<Integer> list) {
        Collections.sort(list);
        String key = list.toString();
//        System.out.println("key - " + key + " map - " + all.toString());
        if (!all.containsKey(key)) {
            all.put(key, list);
        }
    }
}
