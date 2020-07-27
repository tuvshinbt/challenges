package bt.pre.algo.problems.top.easy;

public class _029_SymmetricTree {

	public boolean isSymmetric(TreeNode root) {
		if (root == null) {
			return true;
		}
		return traverseTwo(root.left, root.right);
	}

	private boolean traverseTwo(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left != null && right != null) {
			if (!traverseTwo(left.left, right.right))
				return false;
			if (left.val != right.val)
				return false;
			if (!traverseTwo(left.right, right.left))
				return false;
			return true;
		} else {
			return false;
		}

	}

	public boolean isSymmetricSolution(TreeNode root) {
		if (root == null) {
			return true;
		}
		return isSymmetric(root.left, root.right);
	}

	private boolean isSymmetric(TreeNode left, TreeNode right) {
		if (left == null && right == null) {
			return true;
		} else if (left == null || right == null) {
			return false;
		} else if (left.val != right.val) {
			return false;
		}

		return isSymmetric(left.left, right.right) &&
				isSymmetric(left.right, right.left);
	}
}
