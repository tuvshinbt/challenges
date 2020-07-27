package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.ListNode;

public class _07_AddTwoNumbersTest {

	private final _07_AddTwoNumbers solution = new _07_AddTwoNumbers();

	@Test
	public void example1() {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

		ListNode actual = solution.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));

		assertEquals(expected.val, actual.val);
		assertEquals(expected.next.val, actual.next.val);
		assertEquals(expected.next.next.val, actual.next.next.val);
	}

	@Test
	public void example2() {
		ListNode l1 = new ListNode(1, new ListNode(8));
		ListNode l2 = new ListNode(0);

		ListNode actual = solution.addTwoNumbers(l1, l2);
		ListNode expected = new ListNode(1, new ListNode(8));

		assertEquals(expected.val, actual.val);
		assertEquals(expected.next.val, actual.next.val);
	}
}
