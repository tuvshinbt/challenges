package bt.pre.algo.problems.top.easy;

public class _045_HammingDistance {
	public int hammingDistance(int x, int y) {

		int xy = x ^ y;
		int d = 0;
		for (int i = 0; i < 32; i++) {
			if ((xy & 1) == 1) {
				d++;
			}
			xy = xy >>> 1;
		}
		return d;
	}

	public int hammingDistanceSolution(int x, int y) {
		int count = 0;
		for (int i = 0; i <= 31; i++) {
			if (((x & 1 << i) ^ (y & 1 << i)) > 0) {
				count++;
			}
		}
		return count;
	}

}
