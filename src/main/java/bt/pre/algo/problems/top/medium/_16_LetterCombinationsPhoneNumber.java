package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class _16_LetterCombinationsPhoneNumber {

	private static Map<Character, List<Character>> numMap = new HashMap<Character, List<Character>>() {
		{
			put('2', Arrays.asList('a', 'b', 'c'));
			put('3', Arrays.asList('d', 'e', 'f'));
			put('4', Arrays.asList('g', 'h', 'i'));

			put('5', Arrays.asList('j', 'k', 'l'));
			put('6', Arrays.asList('m', 'n', 'o'));
			put('7', Arrays.asList('p', 'q', 'r', 's'));

			put('8', Arrays.asList('t', 'u', 'v'));
			put('9', Arrays.asList('w', 'x', 'y', 'z'));

		}
	};

	public List<String> letterCombinations(String digits) {
		if (digits == null || digits.length() == 0) {
			return new ArrayList<>();
		}

		List<List<Character>> comb = new ArrayList<List<Character>>();
		for (char digit : digits.toCharArray()) {
			comb.add(numMap.get(digit));
		}

		List<String> result = new ArrayList<String>();
		char[] cur = new char[digits.length()];
		build(comb, 0, 0, cur, result);
		return result;

	}

	private void build(List<List<Character>> comb, int d, int l, char[] cur, List<String> result) {

		if (d == comb.size()) {
			result.add(new String(cur));
		} else {
			for (int i = 0; i < comb.get(d).size(); i++) {
//				cur.add(comb.get(d).get(i));
				cur[d] = comb.get(d).get(i);
				build(comb, d + 1, i, cur, result);
				// cur.remove(cur.size() - 1);
				cur[d] = '\u0000';
			}
		}
	}

	/*
	 * SOLUTION
	 */
	public List<String> solutionLetterCombinations(String digits) {
		if (digits.length() == 0) {
			return new LinkedList<String>();
		}
		HashMap<Integer, String> map = new HashMap<>();
		map.put(2, "abc");
		map.put(3, "def");
		map.put(4, "ghi");
		map.put(5, "jkl");
		map.put(6, "mno");
		map.put(7, "pqrs");
		map.put(8, "tuv");
		map.put(9, "wxyz");
		StringBuilder aux = new StringBuilder();
		ArrayList<String> arr = new ArrayList<>();
		for (int i = 0; i < digits.length(); i++) {
			arr.add(map.get(Character.getNumericValue(digits.charAt(i))));
		}
		List<String> ans = new LinkedList<String>();
		recur(0, arr, aux, ans);
		return ans;

	}

	public static void recur(int i, ArrayList<String> arr, StringBuilder aux, List<String> ans) {
		if (i == arr.size()) {
			ans.add(aux.toString());
			return;
		}
		String s = arr.get(i);
		for (int j = 0; j < s.length(); j++) {
			aux.append(s.charAt(j));
			recur(i + 1, arr, aux, ans);
			aux.deleteCharAt(aux.length() - 1);
		}

	}

}
