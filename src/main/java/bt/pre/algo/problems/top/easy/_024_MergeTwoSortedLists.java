package bt.pre.algo.problems.top.easy;

public class _024_MergeTwoSortedLists {

	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode l3 = new ListNode();
		ListNode head = l3;
		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				l3.val = l1.val;
				l1 = l1.next;
			} else {
				l3.val = l2.val;
				l2 = l2.next;
			}
			l3.next = new ListNode();
			l3 = l3.next;
		}

		while (l1 != null) {
			l3.val = l1.val;
			l1 = l1.next;
			if (l1 != null) {
				l3.next = new ListNode();
				l3 = l3.next;
			}
		}

		while (l2 != null) {
			l3.val = l2.val;
			l2 = l2.next;
			if (l2 != null) {
				l3.next = new ListNode();
				l3 = l3.next;
			}
		}
		return head;
	}
}
