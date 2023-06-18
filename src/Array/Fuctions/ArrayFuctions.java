package Array.Fuctions;

import java.io.IOException;

public class ArrayFuctions {

    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//Change Element at a location
    public void ChangeElement() {
        arr[5] = 25;
        System.out.println("New Array is: ");
        for (int a : arr) {
            System.out.print(a + "\t");
        }
        System.out.println();
    }
    //Array length
    public void ArrayLength()
    {
        System.out.println("Length of array is " +arr.length);
    }
}

class tryArrayFuctions {
    public static void main(String args[]) throws IOException {
        ArrayFuctions d = new ArrayFuctions();
        d.ChangeElement();
        d.ArrayLength();
    }
}

