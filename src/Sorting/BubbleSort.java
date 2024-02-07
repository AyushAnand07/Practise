package Sorting;


import java.io.IOException;
import java.util.Arrays;

public class BubbleSort {
    public void BubbleSort(int[] a, int nl) {
        for (int i = 0; i < nl-1; ++i) {
            for (int j = 0; j < nl-1-i; ++j) {
                if (a[j] > a[j+1]) {
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void main(String a[]) throws IOException {
        int []arr = {3, 7, 1, 4, 9, 8};
        int n = arr.length;
        BubbleSort b = new BubbleSort();
        b.BubbleSort(arr,n);
    }
}
