package bt.pre.algo.problems.top.easy;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class _030_BTreeLevelOrderTraversal {
	public List<List<Integer>> levelOrder(TreeNode root) {
		if (root == null)
			return new ArrayList<List<Integer>>();

		Queue<TreeNode> leaves = new LinkedList<TreeNode>();
		leaves.add(root);
		Queue<TreeNode> nextLevel = new LinkedList<TreeNode>();
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		result.add(new ArrayList<Integer>());
		int level = 0;
		while (!leaves.isEmpty()) {
			TreeNode node = leaves.poll();
			result.get(level).add(node.val);
			if (node.left != null) {
				nextLevel.add(node.left);
			}
			if (node.right != null) {
				nextLevel.add(node.right);
			}
			if (leaves.isEmpty() && !nextLevel.isEmpty()) {
				leaves = nextLevel;
				nextLevel = new LinkedList<TreeNode>();
				result.add(new ArrayList<Integer>());
				level++;
			}
		}
		return result;
	}

	public List<List<Integer>> levelOrderSolution(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if (root == null) {
			return res;
		}

		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);

		while (!queue.isEmpty()) {
			int levelSize = queue.size();
			List<Integer> levelResult = new ArrayList<>();

			for (int i = 0; i < levelSize; i++) {
				TreeNode node = queue.poll();
				levelResult.add(node.val);
				if (node.left != null) {
					queue.add(node.left);
				}
				if (node.right != null) {
					queue.add(node.right);
				}
			}
			res.add(levelResult);
		}
		return res;
	}
}
