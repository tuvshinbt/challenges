package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class _022_RemoveNthNodeEndListTest {

	private final _022_RemoveNthNodeEndList solution = new _022_RemoveNthNodeEndList();

	@Test
	public void example1() {
		// linked list: 1->2->3->4->5, and n = 2.
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		head = solution.removeNthFromEnd(head, 2);

		assertEquals(1, head.val);
		assertEquals(2, head.next.val);
		assertEquals(3, head.next.next.val);
		assertEquals(5, head.next.next.next.val);
		assertNull(head.next.next.next.next);
	}

	@Test
	public void example2() {
		// linked list: 1, and n = 1.
		ListNode head = new ListNode(1);

		head = solution.removeNthFromEnd(head, 1);

		assertNull(head);
	}

	@Test
	public void example3() {
		// linked list: [1,2], and n = 2
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);

		head = solution.removeNthFromEnd(head, 2);

		assertEquals(2, head.val);
		assertNull(head.next);
	}

	@Test
	public void example4() {
		// linked list: [1,2], and n = 1
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);

		head = solution.removeNthFromEnd(head, 1);

		assertEquals(1, head.val);
		assertNull(head.next);
	}
}