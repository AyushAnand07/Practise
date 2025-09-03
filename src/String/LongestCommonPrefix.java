package String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] arr = {"geeksforgeeks", "geeks", "geekers","geeko"};
        String commonPrefix= null;

        Arrays.sort(arr);
        String first= arr[0];
        String last= arr[arr.length-1];

        //finding common substring
        int minLength= Math.min(first.length(),last.length());
        int i=0;
        while(i<minLength && first.charAt(i)== last.charAt(i))
        {
            i++;
        }

        System.out.println("Common longest Prefix is " +first.substring(0,i));
    }
}
