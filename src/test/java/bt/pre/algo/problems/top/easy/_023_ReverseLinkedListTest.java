package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class _023_ReverseLinkedListTest {

	private final _023_ReverseLinkedList solution = new _023_ReverseLinkedList();

	@Test
	public void exampe1() {
		// 1->2->3->4->5->NULL
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));

		head = solution.reverseList(head);

		assertEquals(5, head.val);
		assertEquals(4, head.next.val);
		assertEquals(3, head.next.next.val);
		assertEquals(2, head.next.next.next.val);
		assertEquals(1, head.next.next.next.next.val);
		assertNull(head.next.next.next.next.next);
	}

	@Test
	public void exampe2() {
		// 1->2->3->4->5->NULL
		ListNode head = new ListNode();

		head = solution.reverseList(head);

		assertEquals(5, head.val);
		assertEquals(4, head.next.val);
		assertEquals(3, head.next.next.val);
		assertEquals(2, head.next.next.next.val);
		assertEquals(1, head.next.next.next.next.val);
		assertNull(head.next.next.next.next.next);
	}
}
