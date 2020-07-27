package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class _021_DeleteNodeLinkedListTest {

	private final _021_DeleteNodeLinkedList solution = new _021_DeleteNodeLinkedList();

	@Test
	public void exampe1() {
		ListNode head = new ListNode(4);
		head.next = new ListNode(5);
		head.next.next = new ListNode(1);
		head.next.next.next = new ListNode(9);

		solution.deleteNode(head.next);

		assertEquals(4, head.val);
		assertEquals(1, head.next.val);
		assertEquals(9, head.next.next.val);
		assertNull(head.next.next.next);
	}
}
