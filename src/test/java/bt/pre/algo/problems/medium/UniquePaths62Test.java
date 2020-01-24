package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class UniquePaths62Test {

    private final UniquePaths62 uniquePaths62 = new UniquePaths62();

    @Test
    void testExample1() {
        int m = 3, n = 2;
        assertEquals(3, this.uniquePaths62.uniquePaths(m, n));
    }

    @Test
    void testExample2() {
        int m = 7, n = 3;
        assertEquals(28, this.uniquePaths62.uniquePaths(m, n));
    }

    @Test
    void testExample3() {
        int m = 4, n = 3;
        assertEquals(10, this.uniquePaths62.uniquePaths(m, n));
    }

    @Test
    void testExample4() {
        int m = 19, n = 13;
        assertEquals(86493225, this.uniquePaths62.uniquePaths(m, n));
    }

    @Test
    void testExample5() {
        int m = 4, n = 4;
        assertEquals(20, this.uniquePaths62.uniquePaths(m, n));
    }
}
