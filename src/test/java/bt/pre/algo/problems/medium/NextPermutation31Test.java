package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class NextPermutation31Test {

    NextPermutation31 nextPermutation31 = new NextPermutation31();

    @Test
    public void example1Test() {
        int[] nums = new int[] { 1, 2, 3 };
        nextPermutation31.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 3, 2 }, nums);
    }

    @Test
    public void example2Test() {
        int[] nums = new int[] { 3, 2, 1 };
        nextPermutation31.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 2, 3 }, nums);
    }

    @Test
    public void example3Test() {
        int[] nums = new int[] { 1, 1, 5 };
        nextPermutation31.nextPermutation(nums);
        assertArrayEquals(new int[] { 1, 5, 1 }, nums);
    }

    @Test
    public void example4Test() {
        int[] nums = new int[] { 1, 3, 2 };
        nextPermutation31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[] { 2, 1, 3 }, nums);
    }

    @Test
    public void example5Test() {
        int[] nums = new int[] { 2, 3, 1 };
        nextPermutation31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(new int[] { 3, 1, 2 }, nums);
    }

}
