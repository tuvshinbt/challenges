package bt.pre.algo.problems.medium;

public class RotateList61 {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int size = this.getSize(temp);

        if (size < k)
            k = k % size;

//        for (int i = 0; i < k; i++) {
//            head = this.rotate(head);
//        }
        head = this.rotateV2(head, size - k);
        return head;
    }

    private int getSize(ListNode head) {
        int size = 0;
        if (head == null) {
            return size;
        }
        while (head != null) {
            size++;
            head = head.next;
        }
        return size;
    }

    private ListNode rotate(ListNode head) {
        ListNode oldHead = head, preNode = null;
        if (head == null || head.next == null) {
            return head;
        }
        while (head.next != null) {
            preNode = head;
            head = head.next;
        }
        head.next = oldHead;
        preNode.next = null;
        return head;
    }

    private ListNode rotateV2(ListNode head, int dis) {
        ListNode oldHead = head, newHead = null, newTail = null;
        int step = 1;
        if (head == null || head.next == null) {
            return head;
        }
        while (head.next != null) {
            if (step == dis) {
                newHead = head.next;
                newTail = head;
            }
            step++;
            head = head.next;
        }
        head.next = oldHead;
        newTail.next = null;
        return newHead;
    }
}
