package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.TreeNode;

public class _102BinaryTreeLevelOrderTraversalTest {

    private final _102BinaryTreeLevelOrderTraversal _102BinaryTreeLevelOrderTraversal = new _102BinaryTreeLevelOrderTraversal();

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(9, 20));
        expected.add(Arrays.asList(15, 7));

        List<List<Integer>> actual = this._102BinaryTreeLevelOrderTraversal.levelOrder(root);
        
        assertEquals(expected, actual);

    }
}
