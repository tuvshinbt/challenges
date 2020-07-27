package bt.pre.algo.problems.top.medium;

import bt.pre.algo.problems.top.ListNode;

public class _08_OddEvenLinkedList {
	public ListNode oddEvenList(ListNode head) {
		if (head == null)
			return null;

		ListNode newHead = new ListNode();
		ListNode newTail = new ListNode();
		ListNode cur = newHead;
		ListNode tail = newTail;

		int i = 1;
		while (head != null) {
			if (i % 2 == 1) {
				cur.next = new ListNode(head.val);
				cur = cur.next;
			} else {
				tail.next = new ListNode(head.val);
				tail = tail.next;
			}
			head = head.next;
			i++;
		}
		cur.next = newTail.next;
		return newHead.next;
	}
}
