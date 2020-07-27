package bt.pre.algo.problems.top.easy;

import java.util.Stack;

public class _025_PalindromeLinkedList {
	public boolean isPalindrome(ListNode head) {

		if (head == null) {
			return true;
		}

		ListNode sr = head;
		ListNode fr = head;
		int length = 0;
		Stack<Integer> half = new Stack<Integer>();
		while (fr != null) {
			fr = fr.next;
			length++;
			if (length % 2 == 0) {
				half.add(sr.val);
				sr = sr.next;
			}
		}

		if (half.size() == 0) {
			return true;
		}
		if (length % 2 == 1) {
			sr = sr.next;
		}
		while (sr != null) {
			if (sr.val != half.pop()) {
				return false;
			}
			sr = sr.next;
		}
		return true;
	}

	public boolean isPalindrome1(ListNode head) {
		if (head == null || head.next == null)
			return true;

		int length = 0;

		ListNode temp = head;
		while (temp != null) {
			length++;
			temp = temp.next;
		}

		ListNode head2 = head;
		int i = 0;

		while (i < length / 2) {
			head2 = head2.next;
			i++;
		}

		ListNode tmp = head2;
		ListNode tmp2 = head2.next;

		while (tmp2 != null) {
			head2 = tmp2;
			tmp2 = tmp2.next;
			head2.next = tmp;
			tmp = head2;
		}

		i = 0;
		while (i < length / 2) {
			if (head.val != head2.val)
				return false;
			head = head.next;
			head2 = head2.next;
			i++;
		}

		return true;

	}
}
