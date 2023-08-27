<<<<<<< HEAD
// 445. Add Two Numbers II
public class Qno445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode head1 = null;
        while (p != null) {
            ListNode n = new ListNode(p.val, null);
            if (head1 == null)
                head1 = n;
            else {
                n.next = head1;
                head1 = n;
            }
            p = p.next;
        }
        p = l2;
        ListNode head2 = null;
        while (p != null) {
            ListNode n = new ListNode(p.val, null);
            if (head2 == null)
                head2 = n;
            else {
                n.next = head2;
                head2 = n;
            }
            p = p.next;
        }
        ListNode m = head1;
        ListNode n = head2;
        ListNode head = null;
        int c = 0;
        while (m != null && n != null) {
            ListNode newn = new ListNode((m.val + n.val + c) % 10, null);
            if (head == null)
                head = newn;
            else {
                newn.next = head;
                head = newn;
            }
            c = (m.val + n.val + c) / 10;
            m = m.next;
            n = n.next;
        }
        while (m != null && n == null) {
            ListNode newn = new ListNode((m.val + c) % 10, null);
            if (head == null)
                head = newn;
            else {
                newn.next = head;
                head = newn;
            }
            c = (m.val + c) / 10;
            m = m.next;
        }
        while (m == null && n != null) {
            ListNode newn = new ListNode((n.val + c) % 10, null);
            if (head == null)
                head = newn;
            else {
                newn.next = head;
                head = newn;
            }
            c = (n.val + c) / 10;
            n = n.next;
        }
        if (c == 1) {
            ListNode newn = new ListNode(1, null);
            newn.next = head;
            head = newn;
        }
        return head;
    }
}
=======
// 445. Add Two Numbers II
public class Qno445 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1;
        ListNode head1 = null;
        while (p != null) {
            ListNode n = new ListNode(p.val, null);
            if (head1 == null)
                head1 = n;
            else {
                n.next = head1;
                head1 = n;
            }
            p = p.next;
        }
        p = l2;
        ListNode head2 = null;
        while (p != null) {
            ListNode n = new ListNode(p.val, null);
            if (head2 == null)
                head2 = n;
            else {
                n.next = head2;
                head2 = n;
            }
            p = p.next;
        }
        ListNode m = head1;
        ListNode n = head2;
        ListNode head = null;
        int c = 0;
        while (m != null && n != null) {
            ListNode newn = new ListNode((m.val + n.val + c) % 10, null);
            if (head == null)
                head = newn;
            else {
                newn.next = head;
                head = newn;
            }
            c = (m.val + n.val + c) / 10;
            m = m.next;
            n = n.next;
        }
        while (m != null && n == null) {
            ListNode newn = new ListNode((m.val + c) % 10, null);
            if (head == null)
                head = newn;
            else {
                newn.next = head;
                head = newn;
            }
            c = (m.val + c) / 10;
            m = m.next;
        }
        while (m == null && n != null) {
            ListNode newn = new ListNode((n.val + c) % 10, null);
            if (head == null)
                head = newn;
            else {
                newn.next = head;
                head = newn;
            }
            c = (n.val + c) / 10;
            n = n.next;
        }
        if (c == 1) {
            ListNode newn = new ListNode(1, null);
            newn.next = head;
            head = newn;
        }
        return head;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
