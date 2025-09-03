package Stack;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        // Create a Stack of integers
        Stack<Integer> stack = new Stack<>();

        // Push elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        // Display the stack
        System.out.println("Stack after pushing elements: " + stack);

        // Pop an element from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Display the stack after popping
        System.out.println("Stack after popping: " + stack);

        // Peek the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Get the size of the stack
        int stackSize = stack.size();
        System.out.println("Size of the stack: " + stackSize);
    }
}