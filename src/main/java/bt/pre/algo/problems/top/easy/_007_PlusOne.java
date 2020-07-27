package bt.pre.algo.problems.top.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _007_PlusOne {
	public int[] plusOne(int[] digits) {

		if (digits == null || digits.length == 0)
			return digits;

		List<Integer> result = new ArrayList<>();
		int x = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			if (x != 0) {
				int tmp = digits[i] + x;
				if (tmp > 9)
					x = 1;
				else
					x = 0;
				result.add(tmp % 10);
			} else {
				result.add(digits[i]);
			}
		}
		if (x == 1) {
			result.add(1);
		}

		Collections.reverse(result);
		return result.stream().mapToInt(i -> i).toArray();
	}
}
