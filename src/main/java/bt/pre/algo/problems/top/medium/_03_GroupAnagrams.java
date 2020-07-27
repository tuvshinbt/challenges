package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _03_GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		if (strs == null || strs.length == 0)
			return Collections.emptyList();

		final Map<String, List<String>> map = new HashMap<String, List<String>>();
		for (final String str : strs) {
			final char[] chars = str.toCharArray();
			Arrays.sort(chars);
			final String sortedStr = new String(chars);
			if (!map.containsKey(sortedStr)) {
				final List<String> val = new ArrayList<String>();
				val.add(str);
				map.put(sortedStr, val);
			} else {
				map.get(sortedStr).add(str);
			}
		}
		return new ArrayList<List<String>>(map.values());
	}

	public List<List<String>> solutionGroupAnagrams(String[] strs) {
		final HashMap<String, List<String>> anagrams = new HashMap<>();
		for (final String string : strs) {
			// transform string to key by sorting it
			final String key = sortString(string);
			if (!anagrams.containsKey(key)) {
				// create new bucket for anagram group
				final List<String> list = new ArrayList<>();
				list.add(string);
				anagrams.put(key, list);
			} else {
				// put into existing anagram group
				anagrams.get(key).add(string);
			}
		}
		return new ArrayList<List<String>>(anagrams.values());
	}

	// Helper method to sort a string alphabetically
	public String sortString(final String inputString) {
		final char tempArray[] = inputString.toCharArray();
		Arrays.sort(tempArray);
		return new String(tempArray);
	}
}
