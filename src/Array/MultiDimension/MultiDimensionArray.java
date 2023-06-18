package Array.MultiDimension;

import java.io.IOException;
import java.util.Scanner;

public class MultiDimensionArray {
    public static void main(String args[])throws IOException
    {
        int arr[][] = new int[10][5];
        Scanner d = new Scanner(System.in);
        System.out.println("Enter a 2D Array");
        for (int i=0;i<10;++i)
        {
            for (int j=0;j<5;++j)
            {
                arr[i][j] = d.nextInt();
            }
        }
        System.out.println("2D array is...");
        for (int i=0;i<10;++i)
        {
            for (int j=0;j<5;++j)
            {
                System.out.print(arr[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
