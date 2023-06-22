package Iterator;

//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
//To use an Iterator, you must import it from the java.util package.

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

class IteratorExample
{
    public static void main(String args[])throws IOException
    {
        ArrayList<Integer> ar = new ArrayList<Integer>();
        ar.add(5);
        ar.add(12);
        ar.add(17);
        Iterator<Integer> i = ar.iterator();//Iterator declared

        while (i.hasNext())
         System.out.println(i.next());
    }
}

