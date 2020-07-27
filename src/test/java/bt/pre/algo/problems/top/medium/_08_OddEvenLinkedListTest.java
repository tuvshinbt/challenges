package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.ListNode;

public class _08_OddEvenLinkedListTest {

	private final _08_OddEvenLinkedList solution = new _08_OddEvenLinkedList();

	@Test
	public void example1() {
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		ListNode actual = solution.oddEvenList(head);
		ListNode expected = new ListNode(1, new ListNode(3, new ListNode(5, new ListNode(2, new ListNode(4)))));
		
		assertEquals(expected.val, actual.val);
		assertEquals(expected.next.val, actual.next.val);
		assertEquals(expected.next.next.val, actual.next.next.val);
		assertEquals(expected.next.next.next.val, actual.next.next.next.val);
	}
}
