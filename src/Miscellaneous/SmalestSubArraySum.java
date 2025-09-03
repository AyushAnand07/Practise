package Miscellaneous;

import java.io.IOException;

public class SmalestSubArraySum {

    public static int minSubArrayLength(int target, int[] nums)
    {
        int left=0;
        int sum=0;
        int minLength= Integer.MAX_VALUE;

        for(int right= 0;right<nums.length;++right)
        {
            sum= sum + nums[right];
            while(sum>= target)
            {
                minLength= Math.min(minLength,right-left+1);
                sum= sum-nums[left];
                left++;
            }
        }
        return  minLength== Integer.MAX_VALUE ? -1 : minLength;
    }
    public static void main(String[] args)throws IOException
    {
        int[] arr= {2,3,1,2,4,3};
        int targer=7;
        System.out.println("Smallest subarray length= " +minSubArrayLength(targer,arr));
    }
}

//Left(start)	  Right	            SubArray	        Sum	       Min Length	    Action
// 0	            3	            [2, 3, 1, 2]	    8	            4	    Shrink window
// 1	            3	            [3, 1, 2]	        6	            4	    Sum < 7 (Stop shrinking)
// 1	            4	            [3, 1, 2, 4]	    10	            4	    Shrink window
// 2	            4	            [1, 2, 4]	        7	            3	    Shrink window
// 3	            4	            [2, 4]	            6	            3	    Sum < 7 (Stop shrinking)
// 3	            5	            [2, 4, 3]	        9	            3	    Shrink window
// 4	            5	            [4, 3]	            7	            2 ✅    Smallest found