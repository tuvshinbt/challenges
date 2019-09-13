package bt.pre.algo.problems.medium;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class Permutations46Test {

    private Permutations46 permutations46 = new Permutations46();

    @Test
    public void example1Test() {
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(new Integer[] { 1 }));
        int[] input = new int[] { 1 };
        List<List<Integer>> result = permutations46.permute(input);
        assertEquals(expected, result);
        assertEquals(expected.get(0), result.get(0));
    }

    @Test
    public void example2Test() {
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(new Integer[] { 1, 2 }));
        expected.add(Arrays.asList(new Integer[] { 2, 1 }));
        int[] input = new int[] { 1, 2 };
        List<List<Integer>> result = permutations46.permute(input);
        assertEquals(expected, result);
        assertEquals(expected.get(0), result.get(0));
        assertEquals(expected.get(1), result.get(1));
    }

    @Test
    public void example3Test() {
        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(new Integer[] { 1, 2, 3 }));
        expected.add(Arrays.asList(new Integer[] { 1, 3, 2 }));
        expected.add(Arrays.asList(new Integer[] { 2, 1, 3 }));
        expected.add(Arrays.asList(new Integer[] { 2, 3, 1 }));
        expected.add(Arrays.asList(new Integer[] { 3, 2, 1 }));
        expected.add(Arrays.asList(new Integer[] { 3, 1, 2 }));
        int[] input = new int[] { 1, 2, 3 };
        List<List<Integer>> result = permutations46.permute(input);
        assertEquals(expected, result);
        assertEquals(expected.get(0), result.get(0));
        assertEquals(expected.get(1), result.get(1));
        assertEquals(expected.get(2), result.get(2));
        assertEquals(expected.get(3), result.get(3));
        assertEquals(expected.get(4), result.get(4));
        assertEquals(expected.get(5), result.get(5));
    }
}
