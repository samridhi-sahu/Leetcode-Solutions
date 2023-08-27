// 86. Partition List
public class Qno86 {
    public ListNode partition(ListNode head, int x) {
        if (head == null || head.next == null)
            return head;
        ListNode list1 = null;
        ListNode temp1 = null;
        ListNode list2 = null;
        ListNode temp2 = null;
        ListNode p = head;
        while (p != null) {
            ListNode n = new ListNode();
            if (p.val < x) {
                n.val = p.val;
                n.next = null;
                if (list1 == null) {
                    list1 = n;
                } else {
                    temp1.next = n;
                }
                temp1 = n;
            } else {
                n.val = p.val;
                n.next = null;
                if (list2 == null) {
                    list2 = n;
                } else {
                    temp2.next = n;
                }
                temp2 = n;
            }
            p = p.next;
        }
        if (temp1 != null) {
            temp1.next = list2;
            return list1;
        }
        return list2;
    }
}
