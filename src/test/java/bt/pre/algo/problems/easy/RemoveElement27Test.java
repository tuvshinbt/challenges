package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.api.Test;

public class RemoveElement27Test {
    private final RemoveElement27 removeElement27 = new RemoveElement27();

    @Test
    public void example1Test() {
        int[] input = new int[] { 3, 2, 2, 3 };
        int val = 3;
        int actualSize = removeElement27.removeElement(input, val);
        List<Integer> actual = Arrays.stream(Arrays.copyOfRange(input, 0, actualSize))
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> expected = Arrays.asList(2, 2);
        assertEquals(expected.size(), actualSize);
        assertEquals(expected, actual);
    }

    @Test
    public void example2Test() {
        int[] input = new int[] { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int actualSize = removeElement27.removeElement(input, val);
        List<Integer> actual = Arrays.stream(Arrays.copyOfRange(input, 0, actualSize))
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> expected = Arrays.asList(0, 0, 1, 3, 4);
        assertEquals(expected.size(), actualSize);
        assertEquals(expected, actual);
    }

    @Test
    public void example3Test() {
        int[] input = new int[] { 2 };
        int val = 3;
        int actualSize = removeElement27.removeElement(input, val);
        List<Integer> actual = Arrays.stream(Arrays.copyOfRange(input, 0, actualSize))
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> expected = Arrays.asList(2);
        assertEquals(expected.size(), actualSize);
        assertEquals(expected, actual);
    }

    @Test
    public void example4Test() {
        int[] input = new int[] { 1 };
        int val = 1;
        int actualSize = removeElement27.removeElement(input, val);
        List<Integer> actual = Arrays.stream(Arrays.copyOfRange(input, 0, actualSize))
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        List<Integer> expected = Arrays.asList();
        assertEquals(expected.size(), actualSize);
        assertEquals(expected, actual);
    }
}
