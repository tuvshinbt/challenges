package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SetMatrixZeroes73Test {

    private final SetMatrixZeroes73 setMatrixZeroes73 = new SetMatrixZeroes73();

    @Test
    void example1Test() {
        int[][] actual = new int[][] { { 1, 1, 1 }, { 1, 0, 1 }, { 1, 1, 1 } };
        int[][] expected = new int[][] { { 1, 0, 1 }, { 0, 0, 0 }, { 1, 0, 1 } };
        this.setMatrixZeroes73.setZeroes(actual);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }

    @Test
    void example2Test() {
        int[][] actual = new int[][] { { 0, 1, 2, 0 }, { 3, 4, 5, 2 }, { 1, 3, 1, 5 } };
        int[][] expected = new int[][] { { 0, 0, 0, 0 }, { 0, 4, 5, 0 }, { 0, 3, 1, 0 } };
        this.setMatrixZeroes73.setZeroes(actual);

        assertEquals(expected.length, actual.length);
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}
