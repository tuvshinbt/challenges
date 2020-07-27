package bt.pre.algo.problems.top.easy;

public class _018_ImplementstrStr {
	public int strStr(String haystack, String needle) {
		if (needle == null || needle.isEmpty())
			return 0;

		for (int i = 0; i < haystack.length(); i++) {
			int j = 0;
			while (j < needle.length() && i + j < haystack.length() && haystack.charAt(i + j) == needle.charAt(j)) {
				j++;
			}
			if (j == needle.length()) {
				return i;
			}
		}

		return -1;
	}
}
