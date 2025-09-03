package Sorting;

import java.util.Arrays;

//Cyclic Sort is a simple and efficient algorithm used primarily when you're working with arrays containing numbers in a specific range
//(like 1 to n or 0 to n-1). It places each number at its correct index using in-place swaps.
public class CyclicSort {
    public void sorted(int[]ar)
    {
        int i=0;
        while(i<ar.length)
        {
            int correctIndex= ar[i]-1; //Put the actual number -1 at the correct index Ex- 3-> ar[0]-1 = 3-1= 2 which is the correct index of 3
            if(ar[i]!= ar[correctIndex])
            {
                // Swap arr[i] with arr[correctIndex]
                int temp = ar[i];
                ar[i] = ar[correctIndex];
                ar[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(ar));
    }

    public static void main(String []args)
    {
        int[] arr= {3,5,2,1,4};
        CyclicSort c= new CyclicSort();
        c.sorted(arr);
    }
}
