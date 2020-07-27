package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _04_LongestSubstringWithoutRepeatingCharacters {
	public int lengthOfLongestSubstring(String s) {
		if (s == null || s.isEmpty())
			return 0;

		int max = Integer.MIN_VALUE;

		List<Character> subStrList = new ArrayList<>();
		for (char c : s.toCharArray()) {
			if (!subStrList.contains(c)) {
				subStrList.add(c);
				int cMax = subStrList.size();
				if (max < cMax) {
					max = cMax;
				}
			} else {
				int indexElem = subStrList.indexOf(c);
				if (indexElem < subStrList.size() - 1)
					subStrList = subStrList.subList(indexElem + 1, subStrList.size());
				else
					subStrList = new ArrayList<>();
				subStrList.add(c);
			}
		}
		return max;

	}

	public int solutionLengthOfLongestSubstring(String s) {
		int n = s.length();
		Set<Character> set = new HashSet();
		int ans = 0;
		int i = 0;
		int j = 0;
		while (i < n && j < n) {
			if (!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				ans = Math.max(ans, j - i);
			} else {
				set.remove(s.charAt(i++));
			}
		}
		return ans;
	}
}
