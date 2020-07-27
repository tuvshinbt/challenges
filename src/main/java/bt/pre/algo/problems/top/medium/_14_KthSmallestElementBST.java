package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.List;

import bt.pre.algo.problems.top.TreeNode;

public class _14_KthSmallestElementBST {

	public int kthSmallest(TreeNode root, int k) {
		if (root == null)
			return Integer.MIN_VALUE;

		List<Integer> nodes = new ArrayList<Integer>();

		inorder(root, nodes, k);

		if (nodes.size() < k) {
			return Integer.MIN_VALUE;
		}
		return nodes.get(k - 1);
	}

	private void inorder(TreeNode root, List<Integer> nodes, int k) {
		if (root == null) {
			return;
		}

		if (nodes.size() == k) {
			return;
		}
		inorder(root.left, nodes, k);
		nodes.add(root.val);
		inorder(root.right, nodes, k);
	}

	public int solutionKthSmallest(TreeNode root, int k) {
		int res[] = new int[2];
		kthSmallestUtil(root, k, res);
		return res[1];
	}

	public void kthSmallestUtil(TreeNode root, int k, int res[]) {
		if (root == null) {
			return;
		}
		kthSmallestUtil(root.left, k, res);
		if (++res[0] == k) {
			res[1] = root.val;
		}
		kthSmallestUtil(root.right, k, res);
	}
}
