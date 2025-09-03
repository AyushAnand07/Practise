package ArraySorting;

import java.util.Arrays;

class Main {

    // perform the bubble sort
    static void bubbleSort(int[] array) {
        int size = array.length;

        for (int i = 0; i < size - 1; i++)

            // loop to compare array elements
            for (int j = 0; j < size - 1- i; j++)

                // compare two adjacent elements
                if (array[j] > array[j + 1]) {

                    // swapping occurs if elements are not in the ascending order
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
    }

    public static void main(String[] args) {

        int[] data = { -2, 45, 0, 11, -9 };

        // call method using class name
        Main.bubbleSort(data);

        System.out.println("Sorted Array in Ascending Order:");
        System.out.println(Arrays.toString(data));
    }
}