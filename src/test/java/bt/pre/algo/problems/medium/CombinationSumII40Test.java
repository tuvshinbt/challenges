package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class CombinationSumII40Test {

    private final CombinationSumII40 combinationSumII40 = new CombinationSumII40();

    @Test
    public void example1Test() {
        int[] inputArr = new int[] { 10, 1, 2, 7, 6, 1, 5 };
        int inputTarget = 8;
        List<List<Integer>> actual = this.combinationSumII40.combinationSum2(inputArr, inputTarget);

        List<List<Integer>> expected = new ArrayList<List<Integer>>() {
            /**
             * 
             */
            private static final long serialVersionUID = -4672045972269742089L;

            {
                add(Arrays.asList(1, 7));
                add(Arrays.asList(1, 2, 5));
                add(Arrays.asList(2, 6));
                add(Arrays.asList(1, 1, 6));
            }
        };
        actual.forEach(i -> Collections.sort(i));
        expected.forEach(i -> Collections.sort(i));
        actual = actual.stream().sorted(new ListIntegerComparator()).collect(Collectors.toList());
        expected = expected.stream().sorted(new ListIntegerComparator()).collect(Collectors.toList());
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test() {
        int[] inputArr = new int[] { 2, 5, 2, 1, 2 };
        int inputTarget = 5;
        List<List<Integer>> actual = this.combinationSumII40.combinationSum2(inputArr, inputTarget);

        List<List<Integer>> expected = new ArrayList<List<Integer>>() {
            /**
             * 
             */
            private static final long serialVersionUID = -4672045972269742089L;

            {
                add(Arrays.asList(1, 2, 2));
                add(Arrays.asList(5));
            }
        };
        actual.forEach(i -> Collections.sort(i));
        expected.forEach(i -> Collections.sort(i));
        actual = actual.stream().sorted(new ListIntegerComparator()).collect(Collectors.toList());
        expected = expected.stream().sorted(new ListIntegerComparator()).collect(Collectors.toList());
        assertEquals(expected.size(), actual.size());
        for (int i = 0; i < expected.size(); i++) {
            assertEquals(expected.get(i), actual.get(i));
        }
        assertEquals(expected, actual);
    }

}

class ListIntegerComparator implements Comparator<List<Integer>> {
    @Override
    public int compare(List<Integer> o1, List<Integer> o2) {
        for (int i = 0; i < Math.min(o1.size(), o2.size()); i++) {
            int c = o1.get(i).compareTo(o2.get(i));
            if (c != 0) {
                return c;
            }
        }
        return Integer.compare(o1.size(), o2.size());
    }

}
