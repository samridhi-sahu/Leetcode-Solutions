<<<<<<< HEAD
// 1669. Merge In Between Linked Lists
public class Q1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p = list1;
        ListNode Anode = p;
        ListNode Bnode = p;
        int i = 0;
        while (i <= b) {
            if (i + 1 == a) {
                Anode = p;
            }
            if (i == b) {
                Bnode = p.next;
            }
            p = p.next;
            i++;
        }
        p = list2;
        while (p.next != null) {
            p = p.next;
        }
        ListNode temp = p;
        Anode.next = list2;
        temp.next = Bnode;
        return list1;
    }
}
=======
// 1669. Merge In Between Linked Lists
public class Q1669 {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode p = list1;
        ListNode Anode = p;
        ListNode Bnode = p;
        int i = 0;
        while (i <= b) {
            if (i + 1 == a) {
                Anode = p;
            }
            if (i == b) {
                Bnode = p.next;
            }
            p = p.next;
            i++;
        }
        p = list2;
        while (p.next != null) {
            p = p.next;
        }
        ListNode temp = p;
        Anode.next = list2;
        temp.next = Bnode;
        return list1;
    }
}
>>>>>>> fff7980f4d45a6779a665685eb84f54c961ba96f
