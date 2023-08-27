// 1721. Swapping Nodes in a Linked List

public class Qno1721 {
    public ListNode swapNodes(ListNode head, int k) {
        if (head.next == null)
            return head;
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        p = head;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }
        int temp = p.val;
        ListNode q = head;
        for (int i = 1; i < k; i++) {
            q = q.next;
        }
        p.val = q.val;
        q.val = temp;
        return head;
    }
}
