package bt.pre.algo.problems.top.easy;

public class _023_ReverseLinkedList {
	public ListNode reverseList(ListNode head) {
		if (head == null) {
			return head;
		}
//		return reverseByIterative(head);
		ListNode newHead = new ListNode();
		reverseByRec(head, newHead);
		return newHead;
	}

	private ListNode reverseByIterative(ListNode node) {
		ListNode rvrHead = null;
		while (node != null) {
			ListNode cn = new ListNode(node.val);
			if (rvrHead == null) {
				rvrHead = cn;
			} else {
				cn.next = rvrHead;
				rvrHead = cn;
			}
			node = node.next;
		}
		return rvrHead;
	}

	private ListNode reverseByRecursion(ListNode node, ListNode head) {
		if (node == null) {
			return node;
		}
		if (node.next == null) {
			head.val = node.val;
			return head;
		}
		ListNode cur = reverseByRecursion(node.next, head);
		cur.next = new ListNode(node.val);
		return cur.next;
	}

	private ListNode reverseByRec(ListNode node, ListNode head) {
		if (node.next == null) {
			head.val = node.val;
			return head;
		}
		ListNode cur = reverseByRec(node.next, head);
		cur.next = new ListNode(node.val);
		return cur.next;
	}
}
