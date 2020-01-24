package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.TreeNode;

public class _103BinaryTreeZigzagLevelOrderTraversalTest {

    private final _103BinaryTreeZigzagLevelOrderTraversal _103BinaryTreeZigzagLevelOrderTraversal = new _103BinaryTreeZigzagLevelOrderTraversal();

    @Test
    void testExample1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> expected = new ArrayList<List<Integer>>();
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(20, 9));
        expected.add(Arrays.asList(15, 7));

        List<List<Integer>> actual = this._103BinaryTreeZigzagLevelOrderTraversal.zigzagLevelOrder(root);

        assertEquals(expected, actual);

    }
}
