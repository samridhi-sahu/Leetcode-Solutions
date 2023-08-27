public class Qno2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode q = l2;
        ListNode temp = null;
        ListNode newhead = null;
        int data = 0;
        while (p != null || q != null) {
            if (p != null && q != null)
                data = p.val + q.val + data / 10;
            if (p == null)
                data = q.val + data / 10;
            if (q == null)
                data = p.val + data / 10;
            ListNode n = new ListNode(data % 10, null);
            if (newhead == null)
                newhead = n;
            if (temp != null)
                temp.next = n;
            temp = n;
            if (p != null)
                p = p.next;
            if (q != null)
                q = q.next;
        }
        if (data > 9) {
            ListNode n = new ListNode(1, null);
            if (temp != null)
                temp.next = n;
        }
        return newhead;
    }
}
