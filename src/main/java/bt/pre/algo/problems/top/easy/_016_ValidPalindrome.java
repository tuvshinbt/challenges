package bt.pre.algo.problems.top.easy;

public class _016_ValidPalindrome {
	public boolean isPalindrome(String s) {
		if (s == null || s.isEmpty())
			return true;

		int i = 0, j = s.length() - 1;
		s = s.toLowerCase();
		while (i < j) {
			while (!isValidChar(s.charAt(i)) && i < j) {
				i++;
			}
			while (!isValidChar(s.charAt(j)) && j > i) {
				j--;
			}
			if (s.charAt(i) != s.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}

	private boolean isValidChar(char c) {
		return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
	}
}
