package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import bt.pre.algo.problems.top.TreeNode;

public class _10_BinaryTreeInorderTraversal {

	public List<Integer> inorderTraversal(TreeNode root) {
		if (root == null)
			return new ArrayList<Integer>();

		List<Integer> result = new ArrayList<Integer>();
		TreeNode curNode = root;
		Stack<TreeNode> st = new Stack<TreeNode>();
		st.add(curNode);
		while (!st.isEmpty()) {
			if (st.peek().left != null) {
				TreeNode left = st.peek().left;
				st.peek().left = null;
				st.push(left);
			} else {
				curNode = st.pop();
				result.add(curNode.val);
				if (curNode.right != null) {
					st.push(curNode.right);
				}
			}
		}
		return result;
	}

	public List<Integer> solutionInorderTraversal(TreeNode root) {
		List<Integer> res = new ArrayList<>();
		if (root == null)
			return res;
		Stack<TreeNode> stack = new Stack<>();
		TreeNode cur = root;
		while (!stack.isEmpty() || cur != null) {
			while (cur != null) {
				stack.push(cur);
				cur = cur.left;
			}
			cur = stack.pop();
			res.add(cur.val);
			cur = cur.right;
		}
		return res;
	}
}
