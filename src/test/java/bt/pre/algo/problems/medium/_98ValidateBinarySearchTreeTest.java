package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.TreeNode;

public class _98ValidateBinarySearchTreeTest {

    private final _98ValidateBinarySearchTree _98ValidateBinarySearchTree = new _98ValidateBinarySearchTree();

    @Test
    void testExample1() {
        TreeNode input = new TreeNode(2);
        input.left = new TreeNode(1);
        input.right = new TreeNode(3);

        assertEquals(true, this._98ValidateBinarySearchTree.isValidBST(input));
    }

    @Test
    void testExample2() {
        TreeNode input = new TreeNode(5);
        input.left = new TreeNode(1);
        input.right = new TreeNode(4);
        input.right.left = new TreeNode(3);
        input.right.right = new TreeNode(6);

        assertEquals(false, this._98ValidateBinarySearchTree.isValidBST(input));
    }

    @Test
    void testExample3() {
        TreeNode input = new TreeNode(1);
        input.left = new TreeNode(1);

        assertEquals(false, this._98ValidateBinarySearchTree.isValidBST(input));
    }
}
