package Miscellaneous;

import Sorting.InsertionSort;

import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostOccurence {
    public static void main(String[]args)throws IOException
    {
        String s= "Hello, my name is Ayush. Hello people and hello friends.";
        String cleanedInput = s.replaceAll("[^a-zA-Z0-9]", " ");
        String[] ar= cleanedInput.split("\\s+");
        Map<String, Integer>map= new HashMap<>();
        for(String word:ar) {
            word = word.toLowerCase();
            map.put(word, map.getOrDefault(word, 0) + 1);
            //After retrieving the current count (or 0 if it's not found), we add 1 to it. This is because we are encountering the word again, so we want to increase its count.
        }
        int maxCount=0;
        String word=null;
        for(Map.Entry<String,Integer>entry :map.entrySet())
        {
            if(entry.getValue()>maxCount) {
                word = entry.getKey();
                maxCount = entry.getValue();
            }
        }
        System.out.println("Most ocurring word: "+word +" is occurring "+ maxCount);

    }
}
