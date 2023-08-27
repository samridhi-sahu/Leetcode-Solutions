<<<<<<< HEAD
// 876. Middle of the Linked List
public class Qno876 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        p = head;
        for (int i = 1; i <= count / 2; i++) {
            p = p.next;
        }
        return p;
    }
}
=======
// 876. Middle of the Linked List
public class Qno876 {
    public ListNode middleNode(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        p = head;
        for (int i = 1; i <= count / 2; i++) {
            p = p.next;
        }
        return p;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
