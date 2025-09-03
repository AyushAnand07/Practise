package Array.Fuctions;

import java.util.Scanner;

public class ArrayDeleteWithoutExtraArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example array
        int[] arr = {10, 20, 30, 40, 50};
        int size = arr.length;

        System.out.print("Enter the element to delete: ");
        int elementToDelete = sc.nextInt();

        int indexToDelete = -1;

        // Find index of the element to delete
        for (int i = 0; i < size; i++) {
            if (arr[i] == elementToDelete) {
                indexToDelete = i;
                break;
            }
        }

        if (indexToDelete == -1) {
            System.out.println("Element not found.");
        } else {
            // Shift elements to the left to overwrite the deleted element
            for (int i = indexToDelete; i < size - 1; i++) {
                arr[i] = arr[i + 1];
            }
            size--; // Reduce size

            // Print updated array
            System.out.print("Array after deletion: ");
            for (int i = 0; i < size; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
