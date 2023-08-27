// 1019. Next Greater Node In Linked List
public class Qno1019 {
    public int[] nextLargerNodes(ListNode head) {
        int size = 0;
        ListNode p = head;
        while (p != null) {
            size++;
            p = p.next;
        }
        int[] arr = new int[size];
        for (int j = 0; j < size; j++) {
            arr[j] = 0;
        }
        p = head;
        int i = 0;
        while (p.next != null) {
            ListNode q = p.next;
            while (q != null) {
                if (p.val < q.val) {
                    arr[i] = q.val;
                    break;
                }
                q = q.next;
            }
            p = p.next;
            i++;
        }
        return arr;
    }
}
