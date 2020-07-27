package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class _031_ConvertSortedArrayToBSTTest {

	private final _031_ConvertSortedArrayToBST solution = new _031_ConvertSortedArrayToBST();

	@Test
	public void example1() {
		int[] nums = new int[] { -10, -3, 0, 5, 9 };
		TreeNode actual = solution.sortedArrayToBST(nums);
		TreeNode expected = new TreeNode(0,
				new TreeNode(-3, new TreeNode(-10), null),
				new TreeNode(9, new TreeNode(5), null));

		assertEquals(expected.val, actual.val);
		assertEquals(expected.left.val, actual.left.val);
		assertNull(actual.left.right);
		assertEquals(expected.left.left.val, actual.left.left.val);

		assertEquals(expected.right.val, actual.right.val);
		assertNull(actual.right.right);
		assertEquals(expected.right.left.val, actual.right.left.val);
	}
}
