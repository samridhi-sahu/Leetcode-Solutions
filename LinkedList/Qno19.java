<<<<<<< HEAD
public class Qno19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (n == count) {
            head = head.next;
            return head;
        }
        p = head;
        for (int i = 1; i < count - n; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
=======
public class Qno19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next == null)
            return null;
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (n == count) {
            head = head.next;
            return head;
        }
        p = head;
        for (int i = 1; i < count - n; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
