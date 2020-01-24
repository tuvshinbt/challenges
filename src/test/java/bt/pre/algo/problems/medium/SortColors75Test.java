package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SortColors75Test {

    private final SortColors75 sortColors75 = new SortColors75();

    @Test
    void example1Test() {
        int[] actual = new int[] { 2, 0, 2, 1, 1, 0 };
        this.sortColors75.sortColors(actual);

        int[] expected = new int[] { 0, 0, 1, 1, 2, 2 };
        assertArrayEquals(expected, actual);
    }

    @Test
    void example2Test() {
        int[] actual = new int[] { 2, 0, 1 };
        this.sortColors75.sortColors(actual);

        int[] expected = new int[] { 0, 1, 2 };
        assertArrayEquals(expected, actual);
    }

    @Test
    void example3Test() {
        int[] actual = new int[] { 1, 0, 0 };
        this.sortColors75.sortColors(actual);

        int[] expected = new int[] { 0, 0, 1 };
        assertArrayEquals(expected, actual);
    }
}
