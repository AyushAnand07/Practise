package Array;

import java.util.HashSet;
import java.util.Set;

public class findDuplicateElements {
    public  static void main(String[] args)
    {
        int[] ar= {1,2,1,5,2,6};

        Set<Integer> set= new HashSet<>();
        for(Integer i: ar)
        {
            if(!set.add(i))
                System.out.println(ar[i]);
        }
    }
}
