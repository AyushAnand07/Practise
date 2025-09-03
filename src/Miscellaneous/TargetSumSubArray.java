package Miscellaneous;

import java.util.ArrayList;
import java.util.List;

public class TargetSumSubArray {
    public static void main(String[]args)
    {
        int[]arr= {2,7,9,2,6,15,8,1};
        int target=9;
        List<List<Integer>> result = new ArrayList<>();

        // Loop through the array to find all subarrays
        for (int i= 0; i < arr.length; i++) {
            int sum = 0;
            List<Integer> currentSubarray = new ArrayList<>();

            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                currentSubarray.add(arr[j]);

                // If the sum matches the target, add the subarray to the result
                if (sum == target) {
                    result.add(new ArrayList<>(currentSubarray)); // Add a copy of the current subarray
                }
            }
        }
        for(List<Integer>integers:result)
        {
            System.out.println(integers);
        }
    }
}
