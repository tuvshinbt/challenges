package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class JumpGame55Test {

    private final JumpGame55 jumpGame55 = new JumpGame55();

    @Test
    void testExample1() {
        int[] input = new int[] { 2, 3, 1, 1, 4 };
        boolean actual = this.jumpGame55.canJump(input);
        assertEquals(true, actual);
    }

    @Test
    void testExample2() {
        int[] input = new int[] { 3, 2, 1, 0, 4 };
        boolean actual = this.jumpGame55.canJump(input);
        assertEquals(false, actual);
    }
}
