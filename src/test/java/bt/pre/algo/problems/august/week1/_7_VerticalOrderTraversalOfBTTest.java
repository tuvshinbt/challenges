package bt.pre.algo.problems.august.week1;

import bt.pre.algo.problems.top.TreeNode;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class _7_VerticalOrderTraversalOfBTTest {
    private final _7_VerticalOrderTraversalOfBT solution = new _7_VerticalOrderTraversalOfBT();

    @Test
    public void example1() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

        List<List<Integer>> actual = solution.verticalTraversal(root);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(9), Arrays.asList(3, 15), Arrays.asList(20), Arrays.asList(7));

        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertEquals(expected.get(0), actual.get(0));
        Assertions.assertEquals(expected.get(1), actual.get(1));
        Assertions.assertEquals(expected.get(2), actual.get(2));
        Assertions.assertEquals(expected.get(3), actual.get(3));
    }

    @Test
    public void example2() {
        TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));

        List<List<Integer>> actual = solution.verticalTraversal(root);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(4), Arrays.asList(2), Arrays.asList(1, 5, 6), Arrays.asList(3), Arrays.asList(7));

        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertEquals(expected.get(0), actual.get(0));
        Assertions.assertEquals(expected.get(1), actual.get(1));
        Assertions.assertEquals(expected.get(2), actual.get(2));
        Assertions.assertEquals(expected.get(3), actual.get(3));
        Assertions.assertEquals(expected.get(4), actual.get(4));
    }

    @Test
    public void example3() {
        //[0,5,1,9,null,2,null,null,null,null,3,4,8,6,null,null,null,7]
        TreeNode root = new TreeNode(0, new TreeNode(5, new TreeNode(9), null), new TreeNode(1, new TreeNode(2, null, new TreeNode(3, new TreeNode(4, new TreeNode(6, new TreeNode(7), null), null), new TreeNode(8))), null));

        List<List<Integer>> actual = solution.verticalTraversal(root);
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(9, 7), Arrays.asList(5, 6), Arrays.asList(0, 2, 4), Arrays.asList(1, 3), Arrays.asList(8));

        Assertions.assertEquals(expected.size(), actual.size());
        Assertions.assertEquals(expected.get(0), actual.get(0));
        Assertions.assertEquals(expected.get(1), actual.get(1));
        Assertions.assertEquals(expected.get(2), actual.get(2));
        Assertions.assertEquals(expected.get(3), actual.get(3));
        Assertions.assertEquals(expected.get(4), actual.get(4));
    }
}
