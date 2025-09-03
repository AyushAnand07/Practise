package ArraySorting;

import java.io.IOException;
import java.util.Arrays;

public class SelectionSort {
    public static void main(String args[]) throws IOException {
        int[] arr = {30, 55, 23, 7, 15, 35};
        int temp = 0;
        int n = arr.length;

        for (int i = 0 ;i< n-1; i++){
            int min = i;

            for (int j = i+1; j<n; j++){
                if (arr[j] < arr[min]){
                    min = j;
                }
            }     //min finds the minimum in 1 full cycle and then swaps it to the correct position in that cycle.
            temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
