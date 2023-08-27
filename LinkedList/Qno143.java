// 143. Reorder List

public class Qno143 {
    public void reorderList(ListNode head) {
        if (head.next == null)
            return;
        ListNode p = head;
        while (p.next != null && p.next.next != null) {
            ListNode q = head;
            while (q.next.next != null) {
                q = q.next;
            }
            q.next.next = p.next;
            p.next = q.next;
            q.next = null;
            p = p.next.next;
        }
    }
}
