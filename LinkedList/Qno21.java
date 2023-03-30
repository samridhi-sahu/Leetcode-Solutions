// 21. Merge Two Sorted Lists
public class Qno21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null && list2 == null)
            return null;
        if (list1 == null)
            return list2;
        if (list2 == null)
            return list1;
        ListNode p = list1;
        ListNode q = list2;
        while (p.next != null) {
            p = p.next;
        }
        p.next = q;
        p = list1;
        while (p.next != null) {
            q = p.next;
            while (q != null) {
                if (p.val <= q.val) {
                    q = q.next;
                } else {
                    int temp = p.val;
                    p.val = q.val;
                    q.val = temp;
                }
            }
            p = p.next;
        }
        return list1;
    }
}
