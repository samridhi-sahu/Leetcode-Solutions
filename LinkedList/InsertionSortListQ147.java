// 147. Insertion Sort List
// https://leetcode.com/problems/insertion-sort-list/description/
public class InsertionSortListQ147 {
    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode dummy = new ListNode(-1);
        ListNode c = head;
        while (c != null) {
            ListNode p = dummy;
            ListNode n = dummy.next;
            ListNode temp = c.next;
            while (n != null && c.val > n.val) {
                p = n;
                n = n.next;
            }
            c.next = n;
            p.next = c;
            c = temp;
        }
        return dummy.next;
    }
}
