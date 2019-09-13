package bt.pre.algo.problems.medium;

public class NextPermutation31 {

    public void nextPermutation(int[] nums) {

        if (nums == null) {
            return;
        }

        boolean found = false;
        for (int i = nums.length - 1; i > 0; i--) {
            if (nums[i] > nums[i - 1]) {
                int g = i;
                while (nums[g] > nums[i - 1] && g < nums.length - 1) {
                    g++;
                }
                if (nums[g] < nums[i - 1]) {
                    g--;
                }

                int tmp = nums[g];
                nums[g] = nums[i - 1];
                nums[i - 1] = tmp;
                this.sortTheElem(i, nums.length - 1, nums);
                found = true;
                break;
            }
        }
        if (!found) {
            this.sortTheElem(0, nums.length - 1, nums);
        }
    }

    private void sortTheElem(int s, int e, int[] nums) {

        while (s < e) {
            int tmp = nums[e];
            nums[e] = nums[s];
            nums[s] = tmp;
            s++;
            e--;
        }
    }
}
