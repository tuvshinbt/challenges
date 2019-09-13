package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MaximumSubarray53Test {

    MaximumSubarray53 maximumSubarray53 = new MaximumSubarray53();

    @Test
    public void example1Test() {
        assertEquals(6, maximumSubarray53.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
}
