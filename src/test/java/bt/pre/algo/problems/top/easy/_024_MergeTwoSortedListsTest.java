package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;

public class _024_MergeTwoSortedListsTest {

	private _024_MergeTwoSortedLists solution = new _024_MergeTwoSortedLists();

	@Test
	public void example1() {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(4)));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));

		ListNode actual = solution.mergeTwoLists(l1, l2);
		ListNode expected = new ListNode(1,
				new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(4))))));

		assertEquals(expected.val, actual.val);
		assertEquals(expected.next.val, actual.next.val);
		assertEquals(expected.next.next.val, actual.next.next.val);
		assertEquals(expected.next.next.next.val, actual.next.next.next.val);
		assertEquals(expected.next.next.next.next.val, actual.next.next.next.next.val);
		assertEquals(expected.next.next.next.next.next.val, actual.next.next.next.next.next.val);
		assertNull(actual.next.next.next.next.next.next);
	}

	@Test
	public void example2() {
		ListNode l1 = new ListNode(-9, new ListNode(3));
		ListNode l2 = new ListNode(5, new ListNode(7));

		ListNode actual = solution.mergeTwoLists(l1, l2);
		ListNode expected = new ListNode(-9, new ListNode(3, new ListNode(5, new ListNode(7))));

		assertEquals(expected.val, actual.val);
		assertEquals(expected.next.val, actual.next.val);
		assertEquals(expected.next.next.val, actual.next.next.val);
		assertEquals(expected.next.next.next.val, actual.next.next.next.val);
	}
}
