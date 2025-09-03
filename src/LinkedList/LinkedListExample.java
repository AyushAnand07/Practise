package LinkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList of integers
        LinkedList<Integer> list = new LinkedList<>();

        // Add elements to the list using add() method
        list.add(10); // Adds 10 to the end of the list
        list.add(20); // Adds 20 to the end of the list
        list.add(30); // Adds 30 to the end of the list
        list.add(1, 15); // Adds 15 at index 1 (second position)

        // Display the list
        System.out.println("LinkedList after adding elements: " + list);

        // Remove an element by index
        list.remove(2); // Removes the element at index 2 (30)
        System.out.println("LinkedList after removing element at index 2: " + list);

        // Remove an element by value
        list.remove(Integer.valueOf(15)); // Removes the first occurrence of 15
        System.out.println("LinkedList after removing element 15: " + list);

        // Get an element by index
        int elementAtIndex1 = list.get(1); // Get the element at index 1 (20)
        System.out.println("Element at index 1: " + elementAtIndex1);

        // Check if the list contains a specific element
        boolean contains20 = list.contains(20); // Check if 20 is in the list
        System.out.println("Does the list contain 20? " + contains20);

        // Display the size of the LinkedList
        int size = list.size();
        System.out.println("Size of the LinkedList: " + size);

        // Iterate through the list using a for-each loop
        System.out.println("Iterating through the LinkedList:");
        for (int num : list) {
            System.out.println(num);
        }
    }
}
