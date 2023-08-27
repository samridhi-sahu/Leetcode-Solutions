<<<<<<< HEAD
// 24. Swap Nodes in Pairs
public class Qno24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        while (p != null) {
            if (p.next != null) {
                int temp = p.val;
                p.val = p.next.val;
                p.next.val = temp;
                p = p.next.next;
            } else
                p = p.next;
        }
        return head;
    }
}
=======
// 24. Swap Nodes in Pairs
public class Qno24 {
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        while (p != null) {
            if (p.next != null) {
                int temp = p.val;
                p.val = p.next.val;
                p.next.val = temp;
                p = p.next.next;
            } else
                p = p.next;
        }
        return head;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
