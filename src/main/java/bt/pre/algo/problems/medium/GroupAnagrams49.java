package bt.pre.algo.problems.medium;

import java.util.*;
import java.util.stream.Collectors;

public class GroupAnagrams49 {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<List<String>>();
        if (strs == null || strs.length == 0) {
            return result;
        }

        Map<Object, List<String>> map = Arrays.stream(strs).collect(Collectors.groupingBy((s) -> {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }));
        return result = new ArrayList<List<String>>(map.values());
    }
}
