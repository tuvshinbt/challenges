package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class SpiralMatrix54Test {

    private final SpiralMatrix54 spiralMatrix54 = new SpiralMatrix54();

    @Test
    void testExample1() {
        int[][] input = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        List<Integer> actual = this.spiralMatrix54.spiralOrder(input);
        List<Integer> expected = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        assertEquals(expected, actual);
    }

    @Test
    void testExample2() {
        int[][] input = new int[][] { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
        List<Integer> actual = this.spiralMatrix54.spiralOrder(input);
        List<Integer> expected = Arrays.asList(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7);
        assertEquals(expected, actual);
    }

    // [[6,9,7]]
    @Test
    void testExample3() {
        int[][] input = new int[][] { { 6, 9, 7 } };
        List<Integer> actual = this.spiralMatrix54.spiralOrder(input);
        List<Integer> expected = Arrays.asList(6, 9, 7);
        assertEquals(expected, actual);
    }

    // [[7],[9],[6]]
    @Test
    void testExample4() {
        int[][] input = new int[][] { { 7 }, { 9 }, { 6 } };
        List<Integer> actual = this.spiralMatrix54.spiralOrder(input);
        List<Integer> expected = Arrays.asList(7, 9, 6);
        assertEquals(expected, actual);
    }

    // [[2,5,8],[4,0,-1]]
    @Test
    void testExample5() {
        int[][] input = new int[][] { { 2, 5, 8 }, { 4, 0, -1 } };
        List<Integer> actual = this.spiralMatrix54.spiralOrder(input);
        List<Integer> expected = Arrays.asList(2, 5, 8, -1, 0, 4);
        assertEquals(expected, actual);
    }

}
