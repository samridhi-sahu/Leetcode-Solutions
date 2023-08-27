<<<<<<< HEAD
// 83. Remove Duplicates from Sorted List
public class Qno83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        while (p != null && p.next != null) {
            ListNode q = p.next;
            if (p.val == q.val) {
                p.next = q.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
=======
// 83. Remove Duplicates from Sorted List
public class Qno83 {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode p = head;
        while (p != null && p.next != null) {
            ListNode q = p.next;
            if (p.val == q.val) {
                p.next = q.next;
            } else {
                p = p.next;
            }
        }
        return head;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
