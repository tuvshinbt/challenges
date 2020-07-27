package bt.pre.algo.problems.top.easy;

public class _046_ReverseBits {
	// you need treat n as an unsigned value
	public int reverseBits(int n) {
		int out = 0;
		for (int i = 0; i < 32; i++) {
			out = out << 1;
			if ((n >> i & 1) > 0) {
				out = out + 1;
			}
		}
		return out;
	}

}