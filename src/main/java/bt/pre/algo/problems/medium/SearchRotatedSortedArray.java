package bt.pre.algo.problems.medium;

public class SearchRotatedSortedArray {
    public int search(int[] nums, int target) {
        if (nums == null || nums.length == 0)
            return -1;
        int pivot = pivot(nums, 0, nums.length - 1);
        System.out.println(pivot);
        if (target >= nums[pivot] && target <= nums[nums.length - 1]) {
            return search(nums, target, pivot, nums.length - 1);
        }
        return search(nums, target, 0, pivot - 1);
    }

    private int pivot(int[] a, int l, int r) {
        if (l == r)
            return l;
        int mid = l + (r - l) / 2;
        if (a[mid] >= a[l] && a[mid] >= a[r]) {
            return pivot(a, mid + 1, r);
        }
        return pivot(a, l, mid);
    }

    private int search(int[] a, int target, int l, int r) {
        if (l > r)
            return -1;
        if (l == r) {
            if (a[l] == target)
                return l;
            else
                return -1;
        }
        int mid = l + (r - l) / 2;
        if (a[mid] == target)
            return mid;
        if (a[mid] < target) {
            return search(a, target, mid + 1, r);
        }
        return search(a, target, l, mid - 1);

    }
}
