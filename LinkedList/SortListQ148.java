// 148. Sort List
// https://leetcode.com/problems/sort-list/description/
public class SortListQ148 {
    public ListNode sortList(ListNode head) {
        // bubble sort time complexity O(N2);
        // BubbleSort(head);
        // quick sort time complexity O(n logn) but in worst case O(N2);
        // QuickSort(head, 0, n-1);
        // merge sort time complexity O(n logn) in worst case too;
        head = MergeSort(head);
        return head;
    }

    ListNode MergeSort(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode slow = head;
        ListNode fast = head;
        ListNode temp = null;
        while (fast != null && fast.next != null) {
            temp = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        temp.next = null;
        ListNode list1 = MergeSort(head);
        ListNode list2 = MergeSort(slow);
        head = Merge(list1, list2);
        return head;
    }

    ListNode Merge(ListNode list1, ListNode list2) {
        ListNode p = list1;
        ListNode q = list2;
        ListNode temp = new ListNode(-1);
        ListNode k = temp;
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
        return temp.next;
    }

    void QuickSort(ListNode head, int start, int end) {
        if (start < end) {
            int k = partition(head, start, end);
            QuickSort(head, start, k - 1);
            QuickSort(head, k + 1, end);
        }
    }

    int partition(ListNode head, int start, int end) {
        int high = 0;
        ListNode p = head;
        while (high != end) {
            high++;
            p = p.next;
        }
        ListNode pivot = p;
        int i = -1;
        p = null;
        while (i != start - 1) {
            i++;
            if (p == null)
                p = head;
            else
                p = p.next;
        }
        int j = 0;
        ListNode q = head;
        while (j != start) {
            j++;
            q = q.next;
        }
        while (j < end) {
            if (q.val <= pivot.val) {
                i++;
                if (p == null)
                    p = head;
                else
                    p = p.next;
                int temp = p.val;
                p.val = q.val;
                q.val = temp;
            }
            j++;
            q = q.next;
        }
        if (p == null)
            p = head;
        else
            p = p.next;
        int temp = p.val;
        p.val = pivot.val;
        pivot.val = temp;
        return i + 1;
    }

    void BubbleSort(ListNode head) {
        ListNode p = head;
        while (p.next != null) {
            ListNode q = p.next;
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
    }
}
