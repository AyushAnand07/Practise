package Array;

import java.util.HashSet;
import java.util.Set;

public class DuplicateNumbers {
    public static void main(String[] args)
    {
        int[]arr= {1,2,1,3,4,2,2,4,5,6,0};
        Set<Integer> unique= new HashSet<>();
        Set<Integer> duplicatesPrinted = new HashSet<>();  // To track duplicates that are already printed

        for(int i=0;i< arr.length;++i) {
            if (!unique.add(arr[i])) {
                
                if(!duplicatesPrinted.contains(arr[i])) {
                    System.out.println(arr[i]);
                    duplicatesPrinted.add(arr[i]);
                }
            }
        }
    }
}
