package bt.pre.algo.problems.top.easy;

public class _013_ReverseInteger {

	public int reverse(int x) {
		int negative = 1;
		if (x < 0) {
			negative = -1;
			x *= -1;
		}
		int newX = 0;
		while (x > 0) {
			if (Integer.MAX_VALUE / 10 < newX) {
				return 0;
			}
			newX = newX * 10 + x % 10;
			x /= 10;
		}
		return newX * negative;
	}

}
