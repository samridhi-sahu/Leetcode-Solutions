<<<<<<< HEAD
// 1290. Convert Binary Number in a Linked List to Integer

public class Qno1290 {

    class Solution {
        public int getDecimalValue(ListNode head) {
            String s = "";
            ListNode p = head;
            while (p != null) {
                s += p.val;
                p = p.next;
            }
            int dec = Integer.parseInt(s, 2);
            return dec;
        }
    }
}
=======
// 1290. Convert Binary Number in a Linked List to Integer

public class Qno1290 {

    class Solution {
        public int getDecimalValue(ListNode head) {
            String s = "";
            ListNode p = head;
            while (p != null) {
                s += p.val;
                p = p.next;
            }
            int dec = Integer.parseInt(s, 2);
            return dec;
        }
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
