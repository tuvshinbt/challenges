package bt.pre.algo.problems.top.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import bt.pre.algo.problems.top.ListNode;

public class _09_IntersectionTwoLinkedListsTest {
	private final _09_IntersectionTwoLinkedLists solution = new _09_IntersectionTwoLinkedLists();

	@Test
	public void example1() {
		ListNode intersection = new ListNode(8, new ListNode(4, new ListNode(5)));
		ListNode headA = new ListNode(4, new ListNode(1));
//		headA.next.next = intersection;

		ListNode headB = new ListNode(5, new ListNode(6, new ListNode(1)));
		headB.next.next.next = intersection;

		ListNode actual = solution.solutionGetIntersectionNode(headA, headB);
		assertEquals(intersection, actual);
		assertEquals(intersection.next, actual.next);
		assertEquals(intersection.next.next, actual.next.next);
	}
}
