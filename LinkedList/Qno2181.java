// 2181. Merge Nodes in Between Zeros
public class Qno2181 {
    public ListNode mergeNodes(ListNode head) {
        ListNode p = head;
        ListNode temp = head;
        int newval = 0;
        while (p.next != null) {
            if (p.next.val != 0) {
                newval = newval + p.next.val;
            }
            p = p.next;
            if (p.val == 0) {
                ListNode n = new ListNode();
                n.val = newval;
                n.next = null;
                if (head.val == 0) {
                    head = n;
                } else {
                    temp.next = n;
                }
                temp = n;
                newval = 0;
            }
        }
        return head;
    }
}
