package bt.pre.algo.problems.top.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Optional;

public class _014_FirstUniqueCharacter {
	public int firstUniqChar(String s) {
		if (s == null || "".equals(s)) {
			return -1;
		}

		Map<Character, Integer> charMap = new LinkedHashMap<Character, Integer>();
		s.chars().forEach(c -> {
			charMap.put((char) c, charMap.getOrDefault((char) c, 0) + 1);
		});

		Iterator<Character> keys = charMap.keySet().iterator();
		Character uniqueChar = null;
		while (keys.hasNext()) {
			Character temp = keys.next();
			if (charMap.get(temp) == 1) {
				uniqueChar = temp;
				break;
			}
		}
		if (uniqueChar == null) {
			return -1;
		}
		return s.indexOf(uniqueChar);
	}
}
