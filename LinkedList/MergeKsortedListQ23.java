<<<<<<< HEAD
// 23. Merge k Sorted Lists
// https://leetcode.com/problems/merge-k-sorted-lists/description/
public class MergeKsortedListQ23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        ListNode head = null;
        for (int i = 0; i < lists.length; i++) {
            head = merge(head, lists[i]);
        }
        return head;
    }

    ListNode merge(ListNode p, ListNode q) {
        ListNode head = new ListNode(-1);
        ListNode k = head;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                k.next = p;
                k = k.next;
                p = p.next;
            } else {
                k.next = q;
                k = k.next;
                q = q.next;
            }
        }
        if (p != null) {
            k.next = p;
        }
        if (q != null) {
            k.next = q;
        }
        return head.next;
    }
}
=======
// 23. Merge k Sorted Lists
// https://leetcode.com/problems/merge-k-sorted-lists/description/
public class MergeKsortedListQ23 {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0)
            return null;
        if (lists.length == 1)
            return lists[0];
        ListNode head = null;
        for (int i = 0; i < lists.length; i++) {
            head = merge(head, lists[i]);
        }
        return head;
    }

    ListNode merge(ListNode p, ListNode q) {
        ListNode head = new ListNode(-1);
        ListNode k = head;
        while (p != null && q != null) {
            if (p.val <= q.val) {
                k.next = p;
                k = k.next;
                p = p.next;
            } else {
                k.next = q;
                k = k.next;
                q = q.next;
            }
        }
        if (p != null) {
            k.next = p;
        }
        if (q != null) {
            k.next = q;
        }
        return head.next;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
