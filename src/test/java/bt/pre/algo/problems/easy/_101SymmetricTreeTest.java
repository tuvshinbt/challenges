package bt.pre.algo.problems.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.TreeNode;

public class _101SymmetricTreeTest {

    private final _101SymmetricTree _101SymmetricTree = new _101SymmetricTree();

    @Test
    void testExample1() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(3);
        node.left.right = new TreeNode(4);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(4);
        node.right.right = new TreeNode(3);

        assertEquals(true, this._101SymmetricTree.isSymmetric(node));
    }

    @Test
    void testExample2() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.right = new TreeNode(3);
        node.right = new TreeNode(2);
        node.right.right = new TreeNode(3);

        assertEquals(false, this._101SymmetricTree.isSymmetric(node));
    }

    @Test
    void testExample3() {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.left.left = new TreeNode(2);
        node.right = new TreeNode(2);
        node.right.left = new TreeNode(2);

        assertEquals(false, this._101SymmetricTree.isSymmetric(node));
    }
}
