package bt.pre.algo.problems.medium;

public class SwapNodesPairs24 {
    public ListNode swapPairs(ListNode c) {
        if (c == null || c.next == null) {
            return c;
        }
        ListNode t = c.next;
        c.next = t.next;
        t.next = c;
        c.next = swapPairs(c.next);
        return t;
    }

}