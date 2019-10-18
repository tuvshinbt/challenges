package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.ListListComparator;

public class GroupAnagrams49Test {

    private final GroupAnagrams49 groupAnagrams49 = new GroupAnagrams49();

    @Test
    public void testExample1() {
        String[] input = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };
        List<List<String>> actual = groupAnagrams49.groupAnagrams(input);

        List<List<String>> expected = new ArrayList<List<String>>();
        expected.add(Arrays.asList("ate", "eat", "tea"));
        expected.add(Arrays.asList("nat", "tan"));
        expected.add(Arrays.asList("bat"));
        Collections.sort(expected, new ListListComparator<String>());
        Collections.sort(actual, new ListListComparator<String>());

        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            Collections.sort(expected.get(i));
            Collections.sort(actual.get(i));
            assertEquals(expected.get(i), actual.get(i));
        }

    }
}
