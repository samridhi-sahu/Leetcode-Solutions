<<<<<<< HEAD
// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/description/
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

        // time complexity O(n2)
        // while(p.next!=null){
        // p=p.next;
        // }
        // p.next=q;
        // p = list1;
        // while(p.next!=null){
        // q = p.next;
        // while(q!=null){
        // if(p.val<=q.val){
        // q=q.next;
        // } else{
        // int temp = p.val;
        // p.val = q.val;
        // q.val = temp;
        // }
        // }
        // p=p.next;
        // }

        // time complexity O(n)
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
// 21. Merge Two Sorted Lists
// https://leetcode.com/problems/merge-two-sorted-lists/description/
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

        // time complexity O(n2)
        // while(p.next!=null){
        // p=p.next;
        // }
        // p.next=q;
        // p = list1;
        // while(p.next!=null){
        // q = p.next;
        // while(q!=null){
        // if(p.val<=q.val){
        // q=q.next;
        // } else{
        // int temp = p.val;
        // p.val = q.val;
        // q.val = temp;
        // }
        // }
        // p=p.next;
        // }

        // time complexity O(n)
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
