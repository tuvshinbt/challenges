package bt.pre.algo.problems.medium;

public class SortColors75 {
    public void sortColors(int[] nums) {
        if (nums == null || nums.length == 0) {
            return;
        }

        int s = 0, e = nums.length - 1, CONDITION = 0;
        while (s < e) {
            while (s < e && nums[s] == CONDITION) {
                s++;
            }
            while (s < e && nums[e] != CONDITION) {
                e--;
            }
            if (nums[s] != CONDITION && nums[e] == CONDITION) {
                swap(nums, s, e);
            }
            if (s >= e && CONDITION == 0) {
                CONDITION = 1;
                e = nums.length - 1;
            }
        }
    }

    private void swap(int[] nums, int s, int e) {
        int t = nums[s];
        nums[s] = nums[e];
        nums[e] = t;
    }
}
