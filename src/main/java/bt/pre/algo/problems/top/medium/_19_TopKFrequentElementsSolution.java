package bt.pre.algo.problems.top.medium;

import java.util.*;

public class _19_TopKFrequentElementsSolution {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == 0 || k == 0) {
            return new int[]{};
        }

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int count = 1;
            if (countMap.containsKey(nums[i])) {
                count += countMap.get(nums[i]);
            }
            countMap.put(nums[i], count);
        }

        PriorityQueue<Map.Entry<Integer, Integer>> pq = new PriorityQueue<>(new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue() - o1.getValue();
            }
        });
        pq.addAll(countMap.entrySet());

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = pq.poll().getKey();
        }
        return result;
    }
}
