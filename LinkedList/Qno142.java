<<<<<<< HEAD
// 142. Linked List Cycle II
public class Qno142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s)
                break;
        }
        if (s != f)
            return null;
        s = head;
        while (s != f) {
            s = s.next;
            f = f.next;
        }
        return s;
    }
}
=======
// 142. Linked List Cycle II
public class Qno142 {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null)
            return null;
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s)
                break;
        }
        if (s != f)
            return null;
        s = head;
        while (s != f) {
            s = s.next;
            f = f.next;
        }
        return s;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
