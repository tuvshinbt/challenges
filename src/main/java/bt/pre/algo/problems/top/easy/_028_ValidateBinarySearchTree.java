package bt.pre.algo.problems.top.easy;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class _028_ValidateBinarySearchTree {
	public boolean isValidBST1(TreeNode root) {
		List<Integer> list = new LinkedList<Integer>();
		inOrder(root, list);
		List<Integer> sortedList = new LinkedList<Integer>(list);
		Collections.sort(sortedList);
		list = list.stream().distinct().collect(Collectors.toList());
		return sortedList.equals(list);
	}

	public void inOrder(TreeNode node, List<Integer> list) {
		if (node == null)
			return;

		inOrder(node.left, list);
		list.add(node.val);
		inOrder(node.right, list);
	}

	public boolean isValidBST(TreeNode root) {
		if (root == null)
			return true;
		return helper(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private boolean helper(TreeNode root, long min, long max) {
		if (root == null)
			return true;
		if (root.val >= max || root.val <= min)
			return false;
		return helper(root.left, min, root.val) && helper(root.right, root.val, max);
	}
}
