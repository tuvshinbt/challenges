package bt.pre.algo.problems.top.medium;

import java.util.LinkedList;
import java.util.Queue;

public class _13_PopulatingNextRightPointersEachNode {
	public Node connect(Node root) {

		if (root == null) {
			return null;
		}

		Queue<Node> queue = new LinkedList<>();
		queue.add(root);

		Node pre = null;
		int curLvlNodes = 1;
		int nextLvlNodes = 0;
		boolean isStartingNewLvl = true;

		while (!queue.isEmpty()) {
			Node cur = queue.poll();
			if (pre != null) {
				if (isStartingNewLvl) {
					pre.next = null;
					isStartingNewLvl = false;
				} else {
					pre.next = cur;
				}
			}
			curLvlNodes--;
			if (cur.left != null) {
				queue.add(cur.left);
				nextLvlNodes++;
			}
			if (cur.right != null) {
				queue.add(cur.right);
				nextLvlNodes++;
			}
			if (curLvlNodes == 0) {
				curLvlNodes = nextLvlNodes;
				nextLvlNodes = 0;
				isStartingNewLvl = true;
			}
			pre = cur;
		}
		return root;
	}

	public Node solutionConnect(Node root) {
		if (root == null)
			return null;

		if (root.left != null)
			root.left.next = root.right;
		if (root.right != null && root.next != null)
			root.right.next = root.next.left;

		connect(root.left);
		connect(root.right);

		return root;
	}
}

class Node {
	public int val;
	public Node left;
	public Node right;
	public Node next;

	public Node() {
	}

	public Node(int _val) {
		val = _val;
	}

	public Node(int _val, Node _left, Node _right, Node _next) {
		val = _val;
		left = _left;
		right = _right;
		next = _next;
	}
};
