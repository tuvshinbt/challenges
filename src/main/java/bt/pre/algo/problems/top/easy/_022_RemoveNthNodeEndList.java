package bt.pre.algo.problems.top.easy;

public class _022_RemoveNthNodeEndList {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		if (head == null)
			return head;
		ListNode slow = head, fast = head, prev = null;
		for (int i = 0; i < n; i++) {
			fast = fast.next;
		}
		while (fast != null) {
			prev = slow;
			slow = slow.next;
			fast = fast.next;
		}
		if (prev == null)
			return head.next;
		prev.next = slow.next;
		return head;
	}
}
