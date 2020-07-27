package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _026_LinkedListCycleTest {
	private final _026_LinkedListCycle solution = new _026_LinkedListCycle();

	@Test
	public void example1() {
		ListNode head = new ListNode(3);
		ListNode node1 = new ListNode(2);
		head.next = node1;
		node1.next = new ListNode(0);
		node1.next.next = new ListNode(-4);
		node1.next.next.next = node1;

		boolean actual = solution.hasCycle(head);
		assertTrue(actual);
	}

	@Test
	public void example2() {
		ListNode head = new ListNode(3, new ListNode(2, new ListNode(0, new ListNode(-4))));

		boolean actual = solution.hasCycle(head);
		assertFalse(actual);
	}
}
