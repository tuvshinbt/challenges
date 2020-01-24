package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.TreeNode;

public class _94BinaryTreeInorderTraversalTest {

    private final _94BinaryTreeInorderTraversal _94BinaryTreeInorderTraversal = new _94BinaryTreeInorderTraversal();

    @Test
    void testExample1() {
        TreeNode input = new TreeNode(1);
        input.right = new TreeNode(2);
        input.right.left = new TreeNode(3);
        List<Integer> actual = this._94BinaryTreeInorderTraversal.inorderTraversal(input);
        
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertEquals(expected, actual);
    }
}
