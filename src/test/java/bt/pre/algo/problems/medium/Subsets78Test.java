package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.ListListComparator;

public class Subsets78Test {

    private final Subsets78 subsets78 = new Subsets78();

    @Test
    void example1Test() {
        int[] input = new int[] { 1, 2, 3 };
        List<List<Integer>> actual = this.subsets78.subsets(input);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(2), Arrays.asList(3),
                Arrays.asList(1, 2, 3), Arrays.asList(1, 3), Arrays.asList(2, 3), Arrays.asList(1, 2),
                new ArrayList<Integer>());

        Collections.sort(actual, new ListListComparator<Integer>());
        Collections.sort(expected, new ListListComparator<Integer>());

        assertEquals(expected.size(), actual.size());
        assertEquals(expected, actual);
    }
}
