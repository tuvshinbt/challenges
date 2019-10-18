package bt.pre.algo.problems.medium;

/*
 * 
Given an array of non-negative integers, you are initially positioned at the first index of the array.

Each element in the array represents your maximum jump length at that position.

Determine if you are able to reach the last index.

Example 1:

Input: [2,3,1,1,4]
Output: true
Explanation: Jump 1 step from index 0 to 1, then 3 steps to the last index.
Example 2:

Input: [3,2,1,0,4]
Output: false
 */
public class JumpGame55 {

    public boolean canJump(int[] arr) {
        if (arr == null || arr.length == 0) {
            return false;
        }

        int d = arr[0];
        int i = 0;
        int l = arr.length - 1;
        while (d < l && i != d) {
            i++;
            if (d < (arr[i] + i)) {
                d = arr[i] + i;
            }
        }
        if (d >= l) {
            return true;
        }
        else {
            return false;
        }
    }
}
