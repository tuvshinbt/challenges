package bt.pre.algo.problems.top.easy;

import java.util.HashMap;
import java.util.Map;

public class _043_RomanToInteger {
	@SuppressWarnings("serial")
	Map<Character, Integer> dic = new HashMap<Character, Integer>() {
		{
			put('I', 1);
			put('V', 5);
			put('X', 10);
			put('L', 50);
			put('C', 100);
			put('D', 500);
			put('M', 1000);
		}
	};

	private int getNumber(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		default:
			return 0;
		}
	}

	public int romanToInt(String s) {
		if (s == null || s.isEmpty())
			return 0;

		int result = 0;
		for (int i = 0; i < s.length(); i++) {
			int val = getNumber(s.charAt(i));
			if (i < s.length() - 1 && getNumber(s.charAt(i + 1)) > val) {
				val = getNumber(s.charAt(i + 1)) - val;
				i++;
			}
			result += val;
		}
		return result;
	}
}
