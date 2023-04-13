// 2130. Maximum Twin Sum of a Linked List
public class Qno2130 {
    public int pairSum(ListNode head) {
        int size = 0;
        ListNode p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        int[] arr = new int[size];
        p = head;
        for (int i = 0; i < size; i++) {
            arr[size - 1 - i] = p.val;
            p = p.next;
        }
        p = head;
        int max = p.val + arr[0];
        for (int i = 0; i < size / 2; i++) {
            if (p.val + arr[i] >= max)
                max = p.val + arr[i];
            p = p.next;
        }
        return max;
    }
}
