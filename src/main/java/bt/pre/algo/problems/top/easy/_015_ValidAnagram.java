package bt.pre.algo.problems.top.easy;

public class _015_ValidAnagram {
	public boolean isAnagram(String s, String t) {

		if (s == null && t == null)
			return true;

		if (s == null || t == null)
			return false;

		if (s.length() != t.length())
			return false;

		int[] chars = new int[26];
		for (int i = 0; i < s.length(); i++) {
			chars[s.charAt(i) - 'a']++;
		}
		for (int i = 0; i < t.length(); i++) {
			chars[t.charAt(i) - 'a']--;
		}
		for (int i : chars) {
			if (i != 0)
				return false;
		}
		return true;
	}
}
