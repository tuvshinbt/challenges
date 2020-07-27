package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _028_ValidateBinarySearchTreeTest {

	private final _028_ValidateBinarySearchTree solution = new _028_ValidateBinarySearchTree();

	@Test
	public void example1() {
		TreeNode root = new TreeNode(2, new TreeNode(1), new TreeNode(3));
		boolean actual = solution.isValidBST(root);
		assertTrue(actual);
	}

	@Test
	public void example2() {
		TreeNode root = new TreeNode(0, new TreeNode(-1), null);
		boolean actual = solution.isValidBST(root);
		assertTrue(actual);
	}

	@Test
	public void example3() {
		TreeNode root = new TreeNode(1, new TreeNode(1), null);
		boolean actual = solution.isValidBST(root);
		assertFalse(actual);
	}
}
