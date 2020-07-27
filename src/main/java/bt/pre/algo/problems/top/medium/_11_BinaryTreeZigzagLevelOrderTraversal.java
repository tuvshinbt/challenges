package bt.pre.algo.problems.top.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import bt.pre.algo.problems.top.TreeNode;

public class _11_BinaryTreeZigzagLevelOrderTraversal {
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {

		if (root == null)
			return Collections.emptyList();

		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(root);
		boolean fromLeft = true;
		int cntLvl = 1, nxtLvl = 0;

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		List<Integer> curLvl = new ArrayList<Integer>();

		Stack<TreeNode> tmpSt = new Stack<TreeNode>();
		while (!queue.isEmpty()) {
			TreeNode cur = queue.poll();
			curLvl.add(cur.val);
			cntLvl--;
			if (fromLeft) {
				if (cur.left != null) {
					nxtLvl++;
					tmpSt.push(cur.left);
				}
				if (cur.right != null) {
					nxtLvl++;
					tmpSt.push(cur.right);
				}
			} else {
				if (cur.right != null) {
					nxtLvl++;
					tmpSt.push(cur.right);
				}
				if (cur.left != null) {
					nxtLvl++;
					tmpSt.push(cur.left);
				}
			}

			if (cntLvl == 0) {
				result.add(curLvl);
				curLvl = new ArrayList<Integer>();
				while (!tmpSt.isEmpty()) {
					queue.add(tmpSt.pop());
				}
				fromLeft = !fromLeft;
				cntLvl = nxtLvl;
				nxtLvl = 0;
			}
		}

		return result;
	}

	public List<List<Integer>> solutionZigzagLevelOrder(TreeNode root) {

		List<List<Integer>> result = new ArrayList<List<Integer>>();
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		if (root == null)
			return result;

		int level = 0;
		queue.add(root);

		while (!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			while (size-- > 0) {
				TreeNode curr = queue.poll();
				list.add(curr.val);
				if (curr.left != null)
					queue.add(curr.left);
				if (curr.right != null)
					queue.add(curr.right);
			}
			if (level % 2 != 0)
				Collections.reverse(list);
			result.add(list);
			level++;
		}
		return result;
	}

}
