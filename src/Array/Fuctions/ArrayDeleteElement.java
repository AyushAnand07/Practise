package Array.Fuctions;
import java.util.Arrays;

class ArrayDeleteElement {
    public static int[] removeTheElement(int[] arr, int index)
    {
        if (arr == null || index < 0 || index >= arr.length) //if array is null
        {
            return arr;
        }
        int[] anotherArray = new int[arr.length - 1]; //new array with -1 length
        for (int i = 0, k = 0; i < arr.length; i++) {
            if (i == index) {
                continue;
            }
            anotherArray[k++] = arr[i];
        }
        return anotherArray;
    }
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };
        System.out.println("Original Array: " + Arrays.toString(arr));
        int index = 2;
        System.out.println("Index to be removed: " + index);
        arr = removeTheElement(arr, index);
        System.out.println("Resultant Array: " + Arrays.toString(arr));
    }
}
