package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _029_SymmetricTreeTest {

	private final _029_SymmetricTree solution = new _029_SymmetricTree();

	@Test
	public void example1() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2, new TreeNode(3), new TreeNode(4)),
				new TreeNode(2, new TreeNode(4), new TreeNode(3)));
		assertTrue(solution.isSymmetric(root));
	}

	@Test
	public void example2() {
		TreeNode root = new TreeNode(1, new TreeNode(2, null, new TreeNode(3)),
				new TreeNode(2, null, new TreeNode(3)));
		assertFalse(solution.isSymmetric(root));
	}

	@Test
	public void example3() {
		TreeNode root = new TreeNode(1,
				new TreeNode(2, new TreeNode(2), null),
				new TreeNode(2, new TreeNode(2), null));
		assertFalse(solution.isSymmetric(root));
	}
}
