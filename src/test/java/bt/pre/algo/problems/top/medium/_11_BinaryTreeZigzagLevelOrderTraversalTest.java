package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.TreeNode;

public class _11_BinaryTreeZigzagLevelOrderTraversalTest {
	private final _11_BinaryTreeZigzagLevelOrderTraversal solution = new _11_BinaryTreeZigzagLevelOrderTraversal();

	@Test
	public void example1() {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		List<List<Integer>> actual = solution.zigzagLevelOrder(root);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(20, 9), Arrays.asList(15, 7));

		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}

	@Test
	public void example2() {
		TreeNode root = new TreeNode(1, new TreeNode(2, new TreeNode(4), null), new TreeNode(3, null, new TreeNode(5)));

		List<List<Integer>> actual = solution.zigzagLevelOrder(root);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(1), Arrays.asList(3, 2), Arrays.asList(4, 5));

		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < expected.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
