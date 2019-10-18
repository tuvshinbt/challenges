package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class RotateImage48Test {

    private final RotateImage48 rotateImage48 = new RotateImage48();

    @Test
    public void testExample1() {
        int[][] actual = new int[][] { { 5, 1, 9, 11 }, { 2, 4, 8, 10 }, { 13, 3, 6, 7 }, { 15, 14, 12, 16 } };
        this.rotateImage48.rotate(actual);

        int[][] expected = new int[][] { { 15, 13, 2, 5 }, { 14, 3, 4, 1 }, { 12, 6, 8, 9 }, { 16, 7, 10, 11 } };
        for (int i = 0; i < 4; i++) {
            assertArrayEquals(expected[i], actual[i]);
        }
    }
}
