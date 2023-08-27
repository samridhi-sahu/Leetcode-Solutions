<<<<<<< HEAD
// 2095. Delete the Middle Node of a Linked List

public class Qno2095 {
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (count == 1)
            return null;
        else if (count == 2) {
            head.next = null;
            return head;
        }

        p = head;
        for (int i = 1; i < count / 2; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;

    }
}
=======
// 2095. Delete the Middle Node of a Linked List

public class Qno2095 {
    public ListNode deleteMiddle(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        if (count == 1)
            return null;
        else if (count == 2) {
            head.next = null;
            return head;
        }

        p = head;
        for (int i = 1; i < count / 2; i++) {
            p = p.next;
        }
        p.next = p.next.next;
        return head;

    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
