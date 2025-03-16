package LinkedList;

public class basicsll {

    // How to print a LinkedList
    public static void displayr(Node head) {
        if (head == null) return;
        System.out.print(head.data + " ");
        displayr(head.next);

    }

    // How to print total element present in LinkedList
    public static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    // How to print a LinkedList in reverse order
    public static void displayReverse(Node head) {
        if (head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }
    public static void display(Node head) {
       // Node temp = head;
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;

        }
    }
    public static class Node{
        int data;   // value
        Node next;  // Address of next node
        Node(int data) {
            this.data = data;

        }
    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(3);
        Node c = new Node(9);
        Node d = new Node(8);
        Node e = new Node(16);
        Node f = new Node(32);
        // 5 -> 3 -> 9 -> 8 -> 16 -> 32
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;
        
        displayr(a);
        System.out.println();
        displayReverse(a);
        System.out.println();
        System.out.println(length(a));
        //System.out.println(a.next.next.next.next.data);


    }

}
