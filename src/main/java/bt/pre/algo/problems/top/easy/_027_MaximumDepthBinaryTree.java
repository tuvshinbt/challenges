package bt.pre.algo.problems.top.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.SortedMap;
import java.util.Stack;
import java.util.TreeMap;

public class _027_MaximumDepthBinaryTree {
	public int maxDepth1(TreeNode root) {
		if (root == null)
			return 0;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		Map<Integer, Integer> depthMap = new TreeMap<Integer, Integer>();
		depthMap.put(1, 1);

		int depth = 2;
		int nodes = 0;
		int prevLevelNodes = 1;
		while (!queue.isEmpty()) {
			nodes = depthMap.getOrDefault(depth, 0);
			TreeNode node = queue.poll();
			prevLevelNodes--;
			if (node.left != null) {
				queue.add(node.left);
				nodes++;
			}
			if (node.right != null) {
				queue.add(node.right);
				nodes++;
			}
			if (nodes != 0)
				depthMap.put(depth, nodes);
			if (prevLevelNodes == 0) {
				prevLevelNodes = nodes;
				depth++;
			}
		}
		return depthMap.size();
	}

	public int maxDepth(TreeNode root) {
		if (root == null) {
			return 0;
		}
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);

		return 1 + Math.max(left, right);
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode() {
	}

	TreeNode(int val) {
		this.val = val;
	}

	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}