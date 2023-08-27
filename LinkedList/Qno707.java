// 707. Design Linked List

public class Qno707 {
    class Node {
        int val;
        Node next;

        Node() {
            next = null;
        }
    }

    class MyLinkedList {
        Node head;

        public MyLinkedList() {
        }

        public int countelement() {
            if (head == null)
                return 0;
            Node p = head;
            int count = 0;
            while (p != null) {
                count++;
                p = p.next;
            }
            return count;
        }

        public int get(int index) {
            int count = countelement();
            if (index >= count)
                return -1;
            int i = 0;
            Node p = head;
            while (i < index) {
                p = p.next;
                i++;
            }
            return p.val;
        }

        public void addAtHead(int val) {
            Node n = new Node();
            n.val = val;
            n.next = head;
            head = n;
        }

        public void addAtTail(int val) {
            Node n = new Node();
            n.val = val;
            if (head == null) {
                n.next = head;
                head = n;
            } else {
                Node p = head;
                while (p.next != null) {
                    p = p.next;
                }
                p.next = n;
                n.next = null;
            }
        }

        public void addAtIndex(int index, int val) {
            Node n = new Node();
            n.val = val;
            int count = countelement();
            if (index == 0) {
                n.next = head;
                head = n;
            } else {
                if (index == count) {
                    Node p = head;
                    while (p.next != null) {
                        p = p.next;
                    }
                    p.next = n;
                    n.next = null;
                } else if (index < count) {
                    int i = 1;
                    Node p = head;
                    while (i < index) {
                        p = p.next;
                        i++;
                    }
                    n.next = p.next;
                    p.next = n;
                }
            }
        }

        public void deleteAtIndex(int index) {
            int count = countelement();
            if (count != 0 && index < count) {
                if (index == 0) {
                    head = head.next;
                } else {
                    int i = 1;
                    Node p = head;
                    while (i < index) {
                        p = p.next;
                        i++;
                    }
                    p.next = p.next.next;
                }
            }
        }
    }

}
