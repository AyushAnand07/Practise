package Array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GreatestOnRight {
    public static void main(String[] args)
    {
        int[] arr= {3,4,1,6,5,7,2};

        for(int i=0;i<arr.length;++i) {
            if (i == arr.length - 1)
                System.out.println("First Greatest for " + arr[i]  + " on right side is " + -1);
            else {
                int num = arr[i];
                List<Integer> subList = new ArrayList<>();
                for (int j = i + 1; j < arr.length; ++j)
                    subList.add(arr[j]);

                Collections.sort(subList, Collections.reverseOrder());
                System.out.println("First Greatest for " + num + " on right side is " + subList.get(0));
            }
        }
    }
}
