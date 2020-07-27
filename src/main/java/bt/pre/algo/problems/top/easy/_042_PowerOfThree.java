package bt.pre.algo.problems.top.easy;

public class _042_PowerOfThree {
	public boolean isPowerOfThree(int n) {
		if (n == 1)
			return true;
		if (n / 3 > 0 && n % 3 == 0) {
			return isPowerOfThree(n / 3);
		} else {
			return false;
		}
	}
}
