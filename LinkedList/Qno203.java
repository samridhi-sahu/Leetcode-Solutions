<<<<<<< HEAD
// 203. Remove Linked List Elements

public class Qno203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.next == null) {
            if (head.val == val) {
                return null;
            } else
                return head;
        }
        ListNode p = head;
        ListNode newhead = null;
        ListNode temp = null;
        while (p != null) {
            if (p.val != val) {
                ListNode q = new ListNode(p.val, null);
                if (newhead == null) {
                    newhead = q;
                    temp = newhead;
                } else {
                    temp.next = q;
                    temp = temp.next;
                }
            }
            p = p.next;
        }
        return newhead;
    }
}
=======
// 203. Remove Linked List Elements

public class Qno203 {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        if (head.next == null) {
            if (head.val == val) {
                return null;
            } else
                return head;
        }
        ListNode p = head;
        ListNode newhead = null;
        ListNode temp = null;
        while (p != null) {
            if (p.val != val) {
                ListNode q = new ListNode(p.val, null);
                if (newhead == null) {
                    newhead = q;
                    temp = newhead;
                } else {
                    temp.next = q;
                    temp = temp.next;
                }
            }
            p = p.next;
        }
        return newhead;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
