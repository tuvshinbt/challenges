package bt.pre.algo.problems.top.easy;

public class _031_ConvertSortedArrayToBST {

	public TreeNode sortedArrayToBST(int[] nums) {
		if (nums == null || nums.length == 0)
			return null;

		int s = 0, e = nums.length - 1;
		TreeNode result = buildTree(nums, s, e);
		return result;
	}

	public TreeNode buildTree(int[] nums, int s, int e) {
		if (s > e) {
			return null;
		}
		int i = s + ((e - s) / 2) + ((e - s) % 2);
		TreeNode node = new TreeNode(nums[i]);
		node.left = buildTree(nums, s, i - 1);
		node.right = buildTree(nums, i + 1, e);
		return node;
	}
}
