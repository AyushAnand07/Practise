package ArrayList;
//The ArrayList class is a resizable array, which can be found in the java.util package.
//The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified (if you want to add
//or remove elements to/from an array, you have to create a new one). While elements can be added and removed from an ArrayList.

import java.util.*;

class GFG {
    public static void main(String args[])
    {
        ArrayList<String> al = new ArrayList<>();
        al.add("United");
        al.add("City");
        System.out.println("Original ArrayList " +al);
        al.add(0, "Manchester");//Adding element at index
        System.out.println("Updated ArrayList after addition " +al);
        al.set(2,"Arsenal");
        System.out.println("Updated ArrayList after changing element " +al);
        al.remove("United");
        System.out.println("Updated ArrayList after removing element " +al);
        String s = al.get(1);
        System.out.println("Fetched element is " +s);
    }
}
