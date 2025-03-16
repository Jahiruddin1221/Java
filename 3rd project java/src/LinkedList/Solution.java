package LinkedList;

class Solution {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Method to find the middle of the linked list
    public static Node findMiddle(Node head) {
        if (head == null) return null;

        Node slow = head;  // Moves one step at a time
        Node first = head; // Moves two steps at a time

        while (first != null && first.next != null) {
            slow = slow.next;      // Move slow one step
            first = first.next.next; // Move first two steps
        }

        return slow; // Slow will point to the middle element
    }

    public static void main(String[] args) {
        // Create a sample linked list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Find and print the middle
        Node middle = findMiddle(head);
        if (middle != null) {
            System.out.println("The middle node is: " + middle.data);
        } else {
            System.out.println("The list is empty.");
            System.out.println(findMiddle(head));
        }
    }
}
