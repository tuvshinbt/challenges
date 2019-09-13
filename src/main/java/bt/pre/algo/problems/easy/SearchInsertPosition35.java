package bt.pre.algo.problems.easy;

public class SearchInsertPosition35 {
    public int searchInsert(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        return findIndex(nums, 0, nums.length - 1, target);
    }

    private int findIndex(int[] nums, int s, int e, int target) {
        if (s == e) {
            if (nums[s] == target) {
                return s;
            } else if (nums[s] < target) {
                return s + 1;
            } else if (nums[s] > target) {
                return s;
            }
        }
        int m = s + ((e - s) / 2);
        if (nums[m] < target) {
            return findIndex(nums, m + 1, e, target);
        } else {
            return findIndex(nums, 0, m, target);
        }
    }
}
