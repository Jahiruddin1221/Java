package LinkedList;

public class Node {
        int data;
        Node next;

         Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    class LinkedList {
        public static boolean isTrue(Node h1, Node h2) {
            while (h1 != null && h2 != null) {
                if (h1.data != h2.data) return false;
                h1 = h1.next;
                h2 = h2.next;
            }
            return true;
            //h1 == null && h2 == null;
        }

        public static void main(String[] args) {
            Node h1 = new Node(1);
            h1.next = new Node(8);
            h1.next.next = new Node(3);

            Node h2 = new Node(1);
            h2.next = new Node(2);
            h2.next.next = new Node(3);

            System.out.println(isTrue(h1, h2) ? "It is same" : "Not same");
        }
    }