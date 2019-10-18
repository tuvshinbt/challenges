package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.*;

import org.junit.jupiter.api.Test;

public class PermutationsII47Test {

    private final PermutationsII47 permutationsII47 = new PermutationsII47();

    @Test
    public void exampple0Test() {
        int[] input = new int[] { 1, 2 };
        List<List<Integer>> actual = permutationsII47.permuteUnique(input);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(2, 1));

        assertEquals(expected, actual);
    }

    @Test
    public void exampple1Test() {
        int[] input = new int[] { 1, 1, 2 };
        List<List<Integer>> actual = permutationsII47.permuteUnique(input);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 1, 2));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(2, 1, 1));

        assertEquals(expected, actual);
    }

    @Test
    public void exampple2Test() {
        int[] input = new int[] { 2, 2, 1, 1 };
        List<List<Integer>> actual = permutationsII47.permuteUnique(input);

        // [[1,1,2,2],[1,2,1,2],[1,2,2,1],[2,1,1,2],[2,1,2,1],[2,2,1,1]]
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(1, 1, 2, 2));
        expected.add(Arrays.asList(1, 2, 1, 2));
        expected.add(Arrays.asList(1, 2, 2, 1));
        expected.add(Arrays.asList(2, 1, 1, 2));
        expected.add(Arrays.asList(2, 1, 2, 1));
        expected.add(Arrays.asList(2, 2, 1, 1));

        Collections.sort(expected, (List<Integer> o1, List<Integer> o2) -> {
            return o1.get(1).compareTo(o2.get(1));
        });
        Collections.sort(actual, (List<Integer> o1, List<Integer> o2) -> {
            return o1.get(1).compareTo(o2.get(1));
        });

        assertEquals(expected, actual);
    }
}
