package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.TreeNode;

public class _12_ConstructBinaryTreeFromPreorderAndInorderTraversalTest {

	private final _12_ConstructBinaryTreeFromPreorderAndInorderTraversal solution = new _12_ConstructBinaryTreeFromPreorderAndInorderTraversal();

	@Test
	public void example1() {
		int[] preorder = new int[] { 3, 9, 20, 15, 7 };
		int[] inorder = new int[] { 9, 3, 15, 20, 7 };
		TreeNode expected = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		TreeNode actual = solution.buildTree(preorder, inorder);

		assertEquals(expected.val, actual.val);
		assertEquals(expected.left.val, actual.left.val);
		assertEquals(expected.right.val, actual.right.val);
		assertEquals(expected.right.left.val, actual.right.left.val);
		assertEquals(expected.right.right.val, actual.right.right.val);
	}

	@Test
	public void example2() {
		int[] preorder = new int[] { 1, 2, 3 };
		int[] inorder = new int[] { 1, 2, 3 };
		TreeNode expected = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3)));

		TreeNode actual = solution.buildTree(preorder, inorder);

		assertEquals(expected.val, actual.val);
		assertEquals(expected.right.val, actual.right.val);
		assertEquals(expected.right.right.val, actual.right.right.val);
	}

	@Test
	public void example3() {
		int[] preorder = new int[] { 1, 2, 3 };
		int[] inorder = new int[] { 2, 3, 1 };
		TreeNode expected = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)), null);

		TreeNode actual = solution.buildTree(preorder, inorder);

		assertEquals(expected.val, actual.val);
		assertEquals(expected.left.val, actual.left.val);
		assertEquals(expected.left.right.val, actual.left.right.val);
	}

	@Test
	public void example4() {
		int[] preorder = new int[] { 3, 1, 2, 4 };
		int[] inorder = new int[] { 1, 2, 3, 4 };
		TreeNode expected = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));

		TreeNode actual = solution.buildTree(preorder, inorder);

		assertEquals(expected.val, actual.val);
		assertEquals(expected.left.val, actual.left.val);
		assertEquals(expected.left.right.val, actual.left.right.val);
		assertEquals(expected.right.val, actual.right.val);
	}
}
