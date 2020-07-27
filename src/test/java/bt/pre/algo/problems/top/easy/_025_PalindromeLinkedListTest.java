package bt.pre.algo.problems.top.easy;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class _025_PalindromeLinkedListTest {

	private final _025_PalindromeLinkedList solution = new _025_PalindromeLinkedList();

	@Test
	public void example1() {
		// 1->2
		ListNode head = new ListNode(1, new ListNode(2));
		assertFalse(solution.isPalindrome(head));
	}

	@Test
	public void example2() {
		// 1->2->2->1
		ListNode head = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
		assertTrue(solution.isPalindrome(head));
	}

	@Test
	public void example3() {
		// [1,0,0]
		ListNode head = new ListNode(1, new ListNode(0, new ListNode(0)));
		assertFalse(solution.isPalindrome(head));
	}
}
