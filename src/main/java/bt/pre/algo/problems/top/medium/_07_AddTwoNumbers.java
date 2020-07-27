package bt.pre.algo.problems.top.medium;

import bt.pre.algo.problems.top.ListNode;

public class _07_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		if (l1 == null)
			return l2;
		if (l2 == null)
			return l1;

		ListNode sum = null;
		ListNode head = null;
		int a = 0;
		while (l1 != null && l2 != null) {
			a = (a + l1.val + l2.val);
			l1 = l1.next;
			l2 = l2.next;
			if (sum == null) {
				sum = new ListNode(a % 10);
				head = sum;
			} else {
				sum.next = new ListNode(a % 10);
				sum = sum.next;
			}
			a = a / 10;
		}

		while (a > 0 && l1 != null) {
			a = a + l1.val;
			l1 = l1.next;

			sum.next = new ListNode(a % 10);
			sum = sum.next;
			a = a / 10;
		}
		if (l1 != null) {
			sum.next = l1;
		}

		while (a > 0 && l2 != null) {
			a = a + l2.val;
			l2 = l2.next;

			sum.next = new ListNode(a % 10);
			sum = sum.next;
			a = a / 10;
		}
		if (l2 != null) {
			sum.next = l2;
		}

		if (a > 0) {
			sum.next = new ListNode(a);
		}

		return head;
	}

	public ListNode solutionAddTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummyNode = new ListNode(0);
		ListNode curr = dummyNode;
		int carry = 0;

		while (l1 != null || l2 != null) {

			int node1 = l1 != null ? l1.val : 0;
			int node2 = l2 != null ? l2.val : 0;
			int sum = node1 + node2 + carry;
			carry = sum / 10;
			ListNode node = new ListNode(sum % 10);
			curr.next = node;
			curr = curr.next;
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}

		if (carry == 1) {
			curr.next = new ListNode(1);
		}
		return dummyNode.next;
	}
}
