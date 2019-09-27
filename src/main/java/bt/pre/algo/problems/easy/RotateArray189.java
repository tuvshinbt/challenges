package bt.pre.algo.problems.easy;

public class RotateArray189 {
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k == 0) {
            return;
        }
        for (int i = 0; i < k; i++) {
            this.rightRotate(nums);
        }
    }
    
    private void rightRotate(int[] nums) {
        int tmp = nums[nums.length - 1];
        for (int i = nums.length - 1; i > 0 ; i--) {
            nums[i] = nums[i - 1];
        }
        nums[0] = tmp;
    }
}
