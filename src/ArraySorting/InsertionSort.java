package ArraySorting;

import java.util.Arrays;

class InsertionSort {

    void insertionSort(int array[]) {
        int size = array.length;

        for (int i = 1; i < size; i++) {
            int key = array[i];
            int j = i - 1;

            // Compare key with each element on the left of it until an element smaller than it is found.
            while (j >= 0 && key < array[j]) {
                array[j + 1] = array[j];
                --j;
            }

            // Place key at after the element just smaller than it.
            array[j + 1] = key;
        }
    }

    public static void main(String args[]) {
        int[] data = { 9, 5, 1, 4, 3 };
        InsertionSort is = new InsertionSort();
        is.insertionSort(data);
        System.out.println("Sorted Array in Ascending Order: ");
        System.out.println(Arrays.toString(data));
    }
}