package bt.pre.algo.problems.top.medium;

import bt.pre.algo.problems.top.ListNode;

public class _09_IntersectionTwoLinkedLists {

	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		int lengthA = size(headA);
		int lengthB = size(headB);

		while (lengthA > lengthB) {
			headA = headA.next;
			lengthA--;
		}

		while (lengthB > lengthA) {
			headB = headB.next;
			lengthB--;
		}

		while (lengthA > 0) {
			if (headA == headB) {
				return headA;
			}
			headA = headA.next;
			headB = headB.next;
			lengthA--;
		}
		return null;

	}

	private int size(ListNode node) {
		int i = 0;
		while (node != null) {
			i++;
			node = node.next;
		}
		return i;
	}

	public ListNode solutionGetIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null)
			return null;

		ListNode pointer1 = headA;
		ListNode pointer2 = headB;
		while (pointer1 != pointer2) {
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
			if (pointer1 == pointer2)
				return pointer1;

			if (pointer1 == null) {
				pointer1 = headB;
			}
			if (pointer2 == null) {
				pointer2 = headA;
			}
		}
		return pointer1;
	}
}
