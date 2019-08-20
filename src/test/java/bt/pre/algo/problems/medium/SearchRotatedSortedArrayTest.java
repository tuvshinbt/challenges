package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchRotatedSortedArrayTest {

    SearchRotatedSortedArray searchRotatedSortedArray = new SearchRotatedSortedArray();

    @Test
    void exampleTest1() {
        assertEquals(4, searchRotatedSortedArray.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 0));
    }

    @Test
    void exampleTest2() {
        assertEquals(-1, searchRotatedSortedArray.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 3));
    }

    @Test
    void exampleTest3() {
        assertEquals(5, searchRotatedSortedArray.search(new int[] { 4, 5, 6, 7, 0, 1, 2 }, 1));
    }
}
