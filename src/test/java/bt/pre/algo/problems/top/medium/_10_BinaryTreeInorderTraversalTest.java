package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.TreeNode;

public class _10_BinaryTreeInorderTraversalTest {

	private final _10_BinaryTreeInorderTraversal solution = new _10_BinaryTreeInorderTraversal();

	@Test
	public void example1() {
		TreeNode root = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

		List<Integer> actual = solution.inorderTraversal(root);
		List<Integer> expected = Arrays.asList(1, 3, 2);

		assertEquals(expected.size(), actual.size());
		assertEquals(expected.get(0), actual.get(0));
		assertEquals(expected.get(1), actual.get(1));
		assertEquals(expected.get(2), actual.get(2));
	}
}
