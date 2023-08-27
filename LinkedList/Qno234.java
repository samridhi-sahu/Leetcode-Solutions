// 234. Palindrome Linked List
public class Qno234 {
    class Solution {
        public boolean isPalindrome(ListNode head) {
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
            int x = 0;
            for (int i = count - 1; i >= 0; i--) {
                if (p.val == temp[i]) {
                    x++;
                } else
                    break;
                p = p.next;
            }
            return x == count;
        }
    }
}
