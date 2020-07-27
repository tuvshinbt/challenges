package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.TreeNode;

public class _14_KthSmallestElementBSTTest {

	private final _14_KthSmallestElementBST solution = new _14_KthSmallestElementBST();

	@Test
	public void example1() {
		TreeNode root = new TreeNode(3, new TreeNode(1, null, new TreeNode(2)), new TreeNode(4));
		int k = 1;

		int actual = solution.kthSmallest(root, k);
		int expected = 1;

		assertEquals(expected, actual);
	}

	@Test
	public void example2() {
		TreeNode root = new TreeNode(5, new TreeNode(3, new TreeNode(2, new TreeNode(1), null), new TreeNode(4)),
				new TreeNode(6));
		int k = 3;

		int actual = solution.kthSmallest(root, k);
		int expected = 3;

		assertEquals(expected, actual);
	}
}
