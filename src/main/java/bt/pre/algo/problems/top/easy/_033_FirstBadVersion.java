package bt.pre.algo.problems.top.easy;

public class _033_FirstBadVersion {
	public int firstBadVersion(int n) {
		return firstBadVersion(0, n);
	}

	private int firstBadVersion(int s, int e) {
		if (s > e) {
			return -1;
		}
		int m = (int) (((long) s + (long) e) / 2);
		boolean isM1Bad = isBadVersion(m - 1);
		boolean isM2Bad = isBadVersion(m);
		if (isM1Bad == isM2Bad) {
			if (!isM1Bad) {
				return firstBadVersion(m + 1, e);
			} else {
				return firstBadVersion(s, m - 1);
			}
		} else {
			return m;
		}
	}

	private int recurseSolution(int lo, int hi) {
		if (lo == hi) {
			if (isBadVersion(lo))
				return lo;
			else
				return lo + 1;
		}
		int mid = lo + (hi - lo) / 2;
		if (isBadVersion(mid))
			return recurseSolution(lo, mid);
		else
			return recurseSolution(mid + 1, hi);
	}

	boolean isBadVersion(int version) {
		return version > 1702766718;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2126753390;
		int m = Integer.MAX_VALUE;
		System.out.println(i);
		System.out.println(m);
	}
}
