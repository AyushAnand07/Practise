package ArraySearching;

import java.sql.Array;
import java.util.Arrays;

public class LinearSearch {
    public static int linearSearch(int[] arr, int value){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == value){
                return i;
            }
        }
        return -1;
    }
    public static void main(String a[]){
        int[] a1= {10,20,30,50,70,90};
        System.out.println("Array = "+ Arrays.toString(a1));
        int val = 50;
        System.out.println("Element index to find = "+ val);
        System.out.println(val+" is found at index: "+linearSearch(a1, val));
    }
}
