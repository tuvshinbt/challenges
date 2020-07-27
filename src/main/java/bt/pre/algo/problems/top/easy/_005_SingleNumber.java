package bt.pre.algo.problems.top.easy;

/**
 * Given a non-empty array of integers, every element appears twice except for
 * one. Find that single one.
 * 
 * Note:
 * 
 * Your algorithm should have a linear runtime complexity. Could you implement
 * it without using extra memory?
 * 
 * Example 1:
 * 
 * Input: [2,2,1] Output: 1 Example 2:
 * 
 * Input: [4,1,2,1,2] Output: 4
 * 
 */
public class _005_SingleNumber {
	public int singleNumber(int[] nums) {
		int a = 0;
		for (int i : nums) {
			a ^= i;
		}
		return a;
	}

	public static void main(String[] args) {
		int a = 1 << 1;
		a = 3;
		int b = 5;
		System.out.println(Integer.toBinaryString(a));
		System.out.println(Integer.toBinaryString(b));
		System.out.println(Integer.toBinaryString(a ^ b));
	}
}
