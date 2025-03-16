package LinkedList;

public class Implementation {
    public static class Node{
        int data;
        Node next;

        Node (int data) {
            this.data = data;
        }
    }
    public static class LinkedList{
        Node head = null;
        Node tail = null;

        // How to insert a new Node at first
        void insertAtEnd(int value) {
            Node temp = new Node(value);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
        }

        // How to insert a new data between two element
        void insertAt(int index, int value) {
            Node t = new Node(value);
            Node temp = head;
            for (int i = 1; i <= index-1; i++) {
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
//
//        // How to find data of any LinkedList element
        int getAt(int index) {
            Node temp = head;
            for (int i = 1; i <= index; i++) {
                temp = temp.next;
            }
            return temp.data;
        }

        // How to insert a new Node at last
        void insertAtHead(int value) {
            Node temp = new Node(value);
            if (head == null) {  //empty list
                head = temp;
                //tail = null;
            } else {            // non-empty list
                temp.next = head;
                head = temp;
            }
        }
        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }

        public static void main(String[] args) {
            LinkedList ll = new LinkedList();
            ll.insertAtEnd(4); // 4
            ll.display();
            ll.insertAtEnd(9); // 4 -> 9
            ll.display();
            ll.insertAtEnd(12);  // 4 -> 9 -> 12
            ll.display();
            ll.insertAtHead(3);  // 3 -> 4 -> 9 -> 12
            ll.display();
            ll.insertAt(2, 10);  // 3 -> 4 -> 10 -> 9 -> 12
            ll.display();
            ll.insertAtHead(7);    // 7 -> 3 -> 4 -> 10 -> 9 -> 12
            ll.display();
            System.out.println(ll.getAt(2));



        }
    }
}
