package bt.pre.algo.problems.top.easy;

public class _044_NumberOneBits {
	public int hammingWeight(int n) {
		int one = 0;

		for (int i = 0; i < 32; i++) {
			if ((n & 1) == 1) {
				;
				one++;
			}
			n = n >>> 1;
		}
		return one;
	}
}
