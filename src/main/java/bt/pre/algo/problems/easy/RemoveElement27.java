package bt.pre.algo.problems.easy;

public class RemoveElement27 {
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int s = 0, e = nums.length - 1;
        while (s <= e) {
            if (nums[s] == val) {
                while (nums[e] == val) {
                    e--;
                    if (s > e) {
                         return s;
                    }
                }
                int tmp = nums[s];
                nums[s] = nums[e];
                nums[e] = tmp;
            }
            else {
                s++;
            }
        }
        return s;
    }
}
