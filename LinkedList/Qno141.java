<<<<<<< HEAD
// 141. Linked List Cycle
public class Qno141 {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s)
                return true;
        }
        return false;
    }
=======
// 141. Linked List Cycle
public class Qno141 {
    public boolean hasCycle(ListNode head) {
        ListNode f = head;
        ListNode s = head;
        while (f != null && f.next != null) {
            f = f.next.next;
            s = s.next;
            if (f == s)
                return true;
        }
        return false;
    }
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
}