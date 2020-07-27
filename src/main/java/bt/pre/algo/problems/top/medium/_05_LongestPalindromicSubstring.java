package bt.pre.algo.problems.top.medium;

public class _05_LongestPalindromicSubstring {

	public String longestPalindrome(String s) {
		if (s == null || s.isEmpty() || s.length() == 1)
			return s;

		String longestPalim = "" + s.charAt(0);
		int maxLength = 1;
		for (int i = 0; i < s.length(); i++) {
			String t = isPalimdrom(s, i, i);
			if (t.length() > maxLength) {
				maxLength = t.length();
				longestPalim = t;
			}
			if (i + 1 < s.length()) {
				t = isPalimdrom(s, i, i + 1);
				if (t.length() > maxLength) {
					maxLength = t.length();
					longestPalim = t;
				}
			}
		}
		return longestPalim;
	}

	private String isPalimdrom(String s, int st, int e) {

		int stEdge = st, eEdge = st;
		while (st >= 0 && e < s.length() && s.charAt(st) == s.charAt(e)) {
			stEdge = st;
			eEdge = e;
			st--;
			e++;
		}
		return s.substring(stEdge, eEdge + 1);
	}

	public int expandFromMiddle(String s, int left, int right) {
		if (s == null || left > right)
			return 0;

		while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
			left--;
			right++;
		}

		return right - left - 1;
	}

	public String solutionLongestPalindrome(String s) {
		if (s == null || s.length() == 0)
			return "";

		// Define start and end are the boundary of final string
		int start = 0, end = 0;
		for (int i = 0; i < s.length(); i++) {
			// Handle for case there is the center character like: racecar
			int len1 = expandFromMiddle(s, i, i);

			// Handle for case there is no center character like: aabbaa
			int len2 = expandFromMiddle(s, i, i + 1);

			// Find the longer substring Palindrome
			int len = Math.max(len1, len2);

			if (len > end - start) {
				start = i - (len - 1) / 2;
				end = i + len / 2;
			}
		}

		return s.substring(start, end + 1);
	}
}
