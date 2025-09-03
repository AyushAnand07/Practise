package Array;

import java.io.IOException;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args)throws IOException
    {
        String s1= "Silent";
        String s2= "Listen";

        char[] a1= s1.toLowerCase().toCharArray();
        Arrays.sort(a1);
        char[] a2= s2.toLowerCase().toCharArray();
        Arrays.sort(a2);

        boolean b= Arrays.equals(a1,a2);
        if(b)
            System.out.println("Anagram");
        else
            System.out.println("Not Anagram");
    }
}
