// 328. Odd Even Linked List
public class Qno328 {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode list1 = null;
        ListNode list2 = null;
        ListNode p = head;
        ListNode temp1 = null;
        ListNode temp2 = null;
        int i = 1;
        while (p != null) {
            if (i % 2 != 0) {
                ListNode n = new ListNode(p.val, null);
                if (list1 == null) {
                    list1 = n;
                } else {
                    temp1.next = n;
                }
                temp1 = n;
            } else {
                ListNode n = new ListNode(p.val, null);
                if (list2 == null) {
                    list2 = n;
                } else {
                    temp2.next = n;
                }
                temp2 = n;
            }
            i++;
            p = p.next;
        }
        temp1.next = list2;
        return list1;
    }
}
