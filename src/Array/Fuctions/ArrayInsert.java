package Array.Fuctions;
import java.util.Arrays;
import java.util.Scanner;

 class Main
{
    public static int[] addElement(int n, int arr[], int ele, int pos)
    {
        int i;
        int newarr[] = new int[n + 1]; // create a new array of size n+1
        for (i = 0; i < n + 1; i++)   // insert the elements from the old array into the new array
        {
            if (i < pos - 1)
                newarr[i] = arr[i];  // insert all elements till position
            else if (i == pos - 1)
                newarr[i] = ele;        // then insert element at specific position
            else
                newarr[i] = arr[i - 1]; // then insert rest of the elements
        }
        return newarr;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;    //Array Size Declaration
        System.out.println("Enter the number of elements :");
        n=sc.nextInt();    //Array Size Initialization
        int []arr=new int[n];    //Array Declaration
        System.out.println("Enter the elements of the array :");
        for(int i=0;i<n;i++)     //Array Initialization
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the elements you want to insert :");
        int ele = sc.nextInt();
        System.out.println("Enter the position where you want to insert :");
        int pos = sc.nextInt();
        arr = addElement(n, arr, ele, pos);
        System.out.println("\nArray with " + ele  + " inserted at position " + pos + ":\n" + Arrays.toString(arr));
    }
}

