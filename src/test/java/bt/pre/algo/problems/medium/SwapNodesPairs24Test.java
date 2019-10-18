package bt.pre.algo.problems.medium;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SwapNodesPairs24Test {

    private final SwapNodesPairs24 swapNodesPairs24 = new SwapNodesPairs24();

    @Test
    public void example1Test() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        input.next.next.next = new ListNode(4);
        ListNode actual = swapNodesPairs24.swapPairs(input);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(4);
        expected.next.next.next = new ListNode(3);
        for (int i = 0; i < 4; i++) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void example2Test() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        input.next.next = new ListNode(3);
        ListNode actual = swapNodesPairs24.swapPairs(input);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        expected.next.next = new ListNode(3);
        for (int i = 0; i < 3; i++) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void example3Test() {
        ListNode input = new ListNode(1);
        input.next = new ListNode(2);
        ListNode actual = swapNodesPairs24.swapPairs(input);
        ListNode expected = new ListNode(2);
        expected.next = new ListNode(1);
        for (int i = 0; i < 2; i++) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }

    @Test
    public void example4Test() {
        ListNode input = new ListNode(1);
        ListNode actual = swapNodesPairs24.swapPairs(input);
        ListNode expected = new ListNode(1);
        for (int i = 0; i < 1; i++) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
    }
}
