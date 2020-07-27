package bt.pre.algo.problems.top.easy;

public class _021_DeleteNodeLinkedList {
	public void deleteNode(ListNode node) {
		if (node == null)
			return;
		while (node.next != null) {
			node.val = node.next.val;
			if (node.next.next == null) {
				node.next = null;
			} else {
				node = node.next;
			}
		}
	}
}

class ListNode {
	public int val;
	public ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}
