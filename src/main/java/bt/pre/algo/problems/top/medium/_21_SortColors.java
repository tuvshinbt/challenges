package bt.pre.algo.problems.top.medium;

public class _21_SortColors {

	public void sortColors(int[] nums) {
		if (nums.length < 2) {
			return;
		}
		int s = 0, e = nums.length - 1;
		int i0 = 0, i1 = 0, i2 = nums.length - 1;
		int numOf0 = 0, numOf1 = 0, numOf2 = 0;
		while (s <= e) {
			if (nums[s] == 0) {
				nums[i0] = 0;
				i0++;
			} else if (nums[s] == 2) {
				// 2
				numOf2++;
			} else {
				// 1
				numOf1++;
			}
			s++;
			if (s < e) {
				if (nums[e] == 2) {
					nums[i2] = 2;
					i2--;
				} else if (nums[e] == 0) {
					// 0
					numOf0++;
				} else {
					// 1
					numOf1++;
				}
				e--;
			}
		}

		while (numOf0 > 0) {
			nums[i0] = 0;
			i0++;
			numOf0--;
		}
		while (numOf1 > 0) {
			nums[i0] = 1;
			i0++;
			numOf1--;
		}
		while (numOf2 > 0) {
			nums[i0] = 2;
			i0++;
			numOf2--;
		}
//		while (s < e) {
//			if (nums[s] > 0 && nums[e] == 0) {
//				int tmp = nums[e];
//				nums[e] = nums[s];
//				nums[s] = tmp;
//				e--;
//				s++;
//			} else if (nums[s] == 0) {
//				s++;
//			} else if (nums[e] > 0) {
//				e--;
//			}
//		}
//		if (s != nums.length - 1) {
//			e = nums.length - 1;
//			while (s < e) {
//				if (nums[s] > nums[e]) {
//					int tmp = nums[e];
//					nums[e] = nums[s];
//					nums[s] = tmp;
//					e--;
//					s++;
//				} else if (nums[e] == 2) {
//					e--;
//				} else if (nums[s] == 1) {
//					s++;
//				}
//
//			}
//		}
	}

}
