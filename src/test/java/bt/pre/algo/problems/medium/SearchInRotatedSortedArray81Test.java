package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchInRotatedSortedArray81Test {

    private SearchInRotatedSortedArray81 searchInRotatedSortedArray81 = new SearchInRotatedSortedArray81();

    @Test
    public void example1Test() {
        int[] input = new int[] { 2, 5, 6, 0, 0, 1, 2 };
        int target = 0;
        boolean expected = true;
        assertEquals(expected, searchInRotatedSortedArray81.search(input, target));
    }

    @Test
    public void example2Test() {
        int[] input = new int[] { 2, 5, 6, 0, 0, 1, 2 };
        int target = 3;
        boolean expected = false;
        assertEquals(expected, searchInRotatedSortedArray81.search(input, target));
    }

    @Test
    public void example3Test() {
        int[] input = new int[] { 1 };
        int target = 1;
        boolean expected = true;
        assertEquals(expected, searchInRotatedSortedArray81.search(input, target));
    }

    @Test
    public void example4Test() {
        int[] input = new int[] { 1, 1 };
        int target = 1;
        boolean expected = true;
        assertEquals(expected, searchInRotatedSortedArray81.search(input, target));
    }

    @Test
    public void example5Test() {
        int[] input = new int[] { 3, 1 };
        int target = 1;
        boolean expected = true;
        assertEquals(expected, searchInRotatedSortedArray81.search(input, target));
    }

    @Test
    public void example6Test() {
        int[] input = new int[] { 1, 3 };
        int target = 1;
        boolean expected = true;
        assertEquals(expected, searchInRotatedSortedArray81.search(input, target));
    }
}
