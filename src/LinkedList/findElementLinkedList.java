package LinkedList;

import java.util.LinkedList;
import java.util.List;

// Node class representing each element in the Linked List
class Node {
    int data;
    Node next;

    // Constructor to create a new node
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class findElementLinkedList {
    Node head;

    // Method to insert a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to find the nth element in the linked list
    public int findNthElement(int n) {
        Node current = head;
        int count = 1;

        // Traverse the linked list
        while (current != null) {
            if (count == n) {
                return current.data;
            }
            current = current.next;
            count++;
        }

        // If the nth element doesn't exist
        System.out.println("The list is shorter than " + n + " elements.");
        return -1; // Return -1 if nth element does not exist
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        findElementLinkedList linkedList= new findElementLinkedList();

        // Adding some elements to the linked list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // Display the linked list
        System.out.println("Linked List:");
        linkedList.display();

        // Find the 3rd element
        int nthElement = linkedList.findNthElement(3);
        if (nthElement != -1) {
            System.out.println("The 3rd element is: " + nthElement);
        }
    }
}
