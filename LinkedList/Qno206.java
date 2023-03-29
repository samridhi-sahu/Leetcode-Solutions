// 206. Reverse Linked List
public class Qno206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode p = head;
            int count = 0;
            while (p != null) {
                count++;
                p = p.next;
            }
            int[] temp = new int[count];
            p = head;
            for (int i = 0; i < count; i++) {
                temp[i] = p.val;
                p = p.next;
            }
            p = head;
            for (int i = count - 1; i >= 0; i--) {
                p.val = temp[i];
                p = p.next;
            }
            return head;
        }
    }
}
