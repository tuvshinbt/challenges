package bt.pre.algo.problems.medium;

public class SearchInRotatedSortedArray81 {
    public boolean search(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        int[] input = new int[nums.length];
        System.arraycopy(nums, 0, input, 0, nums.length);
        int pivot = this.findPivot(input, 0, input.length - 1);
        if (input[0] < target) {
            return this.searchNum(nums, 0, pivot, target);
        } else {
            return this.searchNum(nums, pivot, input.length - 1, target);
        }
    }

    private int findPivot(int[] nums, int l, int r) {
        if (l == r) {
            return l;
        }
        int mid = (r - l) / 2 + l;
        if (nums[l] <= nums[mid] && nums[r] <= nums[mid]) {
            return findPivot(nums, mid + 1, r);
        }
        return findPivot(nums, l, mid);
    }

    private boolean searchNum(int[] nums, int l, int r, int target) {
        if (l > r) {
            return false;
        } else if (l == r) {
            if (nums[l] == target) {
                return true;
            } else {
                return false;
            }
        }
        int i = l + (r - l) / 2;
        if (nums[i] == target) {
            return true;
        } else if (nums[i] < target) {
            return this.searchNum(nums, i + 1, r, target);
        } else {
            return this.searchNum(nums, l, i, target);
        }
    }
}
