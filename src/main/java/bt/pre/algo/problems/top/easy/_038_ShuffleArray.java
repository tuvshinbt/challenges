package bt.pre.algo.problems.top.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class _038_ShuffleArray {
	private int[] nums;

	public _038_ShuffleArray(int[] nums) {
		this.nums = nums;
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return nums;
	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		List<Integer> intList = new ArrayList<Integer>(nums.length);
		for (int i : nums) {
			intList.add(i);
		}
		Collections.shuffle(intList);
		int[] random = new int[nums.length];
		for (int i = 0; i < intList.size(); i++) {
			random[i] = intList.get(i);
		}
		return random;
	}
}

class _038_ShuffleArraySolution {

	Random r = new Random();
	int[] nums;

	public _038_ShuffleArraySolution(int[] nums) {
		this.nums = new int[nums.length];
		int i = 0;
		for (int n : nums) {
			this.nums[i++] = n;
		}
	}

	/** Resets the array to its original configuration and return it. */
	public int[] reset() {
		return nums;

	}

	/** Returns a random shuffling of the array. */
	public int[] shuffle() {
		int[] newNums = new int[nums.length];
		for (int i = 0; i < nums.length; i++) {
			newNums[i] = nums[i];
		}
		for (int j = newNums.length - 1; j > 0; j--) {
			int random = r.nextInt(j + 1);
			int temp = newNums[j];
			newNums[j] = newNums[random];
			newNums[random] = temp;
		}
		return newNums;
	}

}