package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SearchInsertPosition35Test {

    SearchInsertPosition35 searchInsertPosition35 = new SearchInsertPosition35();

//
//Input: [1,3,5,6], 5
//Output: 2
    @Test
    void example1Test() {
        assertEquals(2, searchInsertPosition35.searchInsert(new int[] { 1, 3, 5, 6 }, 5));
    }

//
//Input: [1,3,5,6], 2
//Output: 1
    @Test
    void example2Test() {
        assertEquals(1, searchInsertPosition35.searchInsert(new int[] { 1, 3, 5, 6 }, 2));
    }

//
//Input: [1,3,5,6], 7
//Output: 4
    @Test
    void example3Test() {
        assertEquals(4, searchInsertPosition35.searchInsert(new int[] { 1, 3, 5, 6 }, 7));
    }

//
//Input: [1,3,5,6], 0
//Output: 0
    @Test
    void example4Test() {
        assertEquals(0, searchInsertPosition35.searchInsert(new int[] { 1, 3, 5, 6 }, 0));
    }

}
