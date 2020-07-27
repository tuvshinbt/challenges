package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class _027_MaximumDepthBinaryTreeTest {

	private final _027_MaximumDepthBinaryTree solution = new _027_MaximumDepthBinaryTree();

	@Test
	public void example1() {
		// [3,9,20,null,null,15,7],
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		int actual = solution.maxDepth(root);
		int expected = 3;
		
		assertEquals(expected, actual);
	}
}
