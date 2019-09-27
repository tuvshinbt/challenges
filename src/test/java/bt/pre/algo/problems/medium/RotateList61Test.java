package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RotateList61Test {

    private RotateList61 rotateList61 = new RotateList61();

    /**
     * Input: 1->2->3->4->5->NULL, k = 2 Output: 4->5->1->2->3->NULL
     */
    @Test
    public void example1Test() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        input.next.next.next.next = new ListNode(5);
        int k = 2;

        ListNode expected = new ListNode(4);
        expected.next = new ListNode(5);
        expected.next.next = new ListNode(1);
        expected.next.next.next = new ListNode(2);
        expected.next.next.next.next = new ListNode(3);
        ListNode result = rotateList61.rotateRight(input, k);
        for (int i = 0; i < 5; i++) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
    }

//    Input: 0->1->2->NULL, k = 1
//    Output: 2->0->1->NULL
    @Test
    public void example2Test() {
        ListNode input = new ListNode(0);
        input.next = new ListNode(1);
        input.next.next = new ListNode(2);
        int k = 4;

        ListNode expected = new ListNode(2);
        expected.next = new ListNode(0);
        expected.next.next = new ListNode(1);
        ListNode result = rotateList61.rotateRight(input, k);
        for (int i = 0; i < 3; i++) {
            assertEquals(expected.val, result.val);
            expected = expected.next;
            result = result.next;
        }
    }
}
