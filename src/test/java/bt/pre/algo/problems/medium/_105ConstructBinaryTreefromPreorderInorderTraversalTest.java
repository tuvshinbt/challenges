package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.TreeNode;

public class _105ConstructBinaryTreefromPreorderInorderTraversalTest {

    private final _105ConstructBinaryTreefromPreorderInorderTraversal _105ConstructBinaryTreefromPreorderInorderTraversal = new _105ConstructBinaryTreefromPreorderInorderTraversal();

    @Test
    void testExample1() {
        int[] preorder = new int[] { 3, 9, 20, 15, 7 };
        int[] inorder = new int[] { 9, 3, 15, 20, 7 };

        TreeNode expected = new TreeNode(3);
        expected.left = new TreeNode(9);
        expected.right = new TreeNode(20);
        expected.right.left = new TreeNode(15);
        expected.right.right = new TreeNode(7);

        TreeNode actual = this._105ConstructBinaryTreefromPreorderInorderTraversal.buildTree(preorder, inorder);
        assertEquals(expected.val, actual.val);
        assertEquals(expected.left.val, actual.left.val);
        assertEquals(expected.right.val, actual.right.val);
        assertEquals(expected.right.left.val, actual.right.left.val);
        assertEquals(expected.right.right.val, actual.right.right.val);
    }
}
