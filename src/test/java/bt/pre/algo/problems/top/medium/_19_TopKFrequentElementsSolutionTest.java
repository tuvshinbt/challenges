package bt.pre.algo.problems.top.medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class _19_TopKFrequentElementsSolutionTest {
    private final _19_TopKFrequentElementsSolution solution = new _19_TopKFrequentElementsSolution();

    @Test
    public void example1() {
        int[] nums = new int[]{1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] actual = solution.topKFrequent(nums, k);
        int[] expected = new int[]{1, 2};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void example2() {
        int[] nums = new int[]{1};
        int k = 1;

        int[] actual = solution.topKFrequent(nums, k);
        int[] expected = new int[]{1};

        Assertions.assertArrayEquals(expected, actual);
    }


    @Test
    public void example3() {
        int[] nums = new int[]{-1, -1};
        int k = 1;

        int[] actual = solution.topKFrequent(nums, k);
        int[] expected = new int[]{-1};

        Assertions.assertArrayEquals(expected, actual);
    }
}
