package bt.pre.algo.problems.medium;

import java.util.*;

public class Subsets78 {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums == null) {
            return null;
        }

        int l = nums.length;
        int p = 1 << l;

        List<List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < p; i++) {
            List<Integer> il = new ArrayList<Integer>();
            for (int j = 0; j < l; j++) {
                // System.out.println("i-" + i + " 1<<" + j + " " + (1 << j));
                if ((i & (1 << j)) > 0) {
                    il.add(nums[j]);
                }
            }
            result.add(il);
        }

        return result;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Integer n = 1 << i;
            System.out.println(n + "<<" + i + " " + Integer.toBinaryString(n));
        }
        for (int i = 0; i < 10; i++) {
            Integer n = i << 1;
            System.out.println(n + "<<" + i + " " + Integer.toBinaryString(n));
        }
    }
}
