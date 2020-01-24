package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MergeIntervals56Test {

    private final MergeIntervals56 mergeIntervals56 = new MergeIntervals56();

    @Test
    void testExample1() {
        int[][] input = new int[][] { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        int[][] actual = this.mergeIntervals56.merge(input);
        int[][] expected = new int[][] { { 1, 6 }, { 8, 10 }, { 15, 18 } };
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testExample2() {
        int[][] input = new int[][] { { 1, 4 }, { 4, 5 } };
        int[][] actual = this.mergeIntervals56.merge(input);
        int[][] expected = new int[][] { { 1, 5 } };
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testExample3() {
        int[][] input = new int[][] { { 1, 4 }, { 4, 5 } };
        int[][] actual = this.mergeIntervals56.merge(input);
        int[][] expected = new int[][] { { 1, 5 } };
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testExample4() {
        int[][] input = new int[][] { { 1, 4 }, { 1, 4 } };
        int[][] actual = this.mergeIntervals56.merge(input);
        int[][] expected = new int[][] { { 1, 4 } };
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void testExample5() {
        int[][] input = new int[][] { { 1, 4 }, { 2, 3 } };
        int[][] actual = this.mergeIntervals56.merge(input);
        int[][] expected = new int[][] { { 1, 4 } };
        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}
