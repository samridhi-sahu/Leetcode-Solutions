// 61. Rotate List

public class Qno61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        int count = 0;
        while (p != null) {
            count++;
            p = p.next;
        }
        for (int i = 0; i < k % count; i++) {
            p = head;
            while (p.next.next != null) {
                p = p.next;
            }
            ListNode n = p.next;
            p.next = null;
            n.next = head;
            head = n;
        }
        return head;
    }
}
