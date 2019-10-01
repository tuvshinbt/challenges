package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RotateArray189Test {

    RotateArray189 rotateArray189 = new RotateArray189();

    @Test
    public void example1Test() {
        int[] input = new int[] { 1, 2, 3, 4, 5, 6, 7 };
        int k = 3;
        int[] expected = new int[] { 5, 6, 7, 1, 2, 3, 4 };
        rotateArray189.rotate(input, k);
        assertArrayEquals(expected, input);
    }

    @Test
    public void example2Test() {
        int[] input = new int[] { 1, 2 };
        int k = 1;
        int[] expected = new int[] { 2, 1 };
        rotateArray189.rotate(input, k);
        assertArrayEquals(expected, input);
    }
}
