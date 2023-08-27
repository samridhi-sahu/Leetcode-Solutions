// 92. Reverse Linked List II

public class Qno92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (head.next == null)
            return head;
        ListNode p = head;
        for (int i = 1; i < left; i++) {
            p = p.next;
        }
        ListNode temp = p;
        int[] arr = new int[right - left + 1];
        for (int i = 0; i < right - left + 1; i++) {
            arr[i] = p.val;
            p = p.next;
        }
        for (int i = right - left; i >= 0; i--) {
            temp.val = arr[i];
            temp = temp.next;
        }
        return head;
    }
}
