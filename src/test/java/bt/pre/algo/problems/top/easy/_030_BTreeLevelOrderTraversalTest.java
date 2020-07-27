package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class _030_BTreeLevelOrderTraversalTest {

	private final _030_BTreeLevelOrderTraversal solution = new _030_BTreeLevelOrderTraversal();

	@Test
	public void example1() {
		TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));

		List<List<Integer>> actual = solution.levelOrder(root);
		List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList(9, 20), Arrays.asList(15, 7));

		assertEquals(expected.size(), actual.size());
		for (int i = 0; i < actual.size(); i++) {
			assertEquals(expected.get(i), actual.get(i));
		}
	}
}
