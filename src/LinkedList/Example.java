package LinkedList;
//The LinkedList class is a collection which can contain many objects of the same type. Time complexity is O(n)
import java.io.IOException;
import java.util.LinkedList;

public class Example {
    public static void main(String args[])throws IOException
    {
        LinkedList<String> ls = new LinkedList<>();//declaring LinkedList
        ls.add("Ayush");//adding elements
        ls.add("Suyash");
        ls.add("John");
        ls.add("Randy");
        System.out.print("Original LinkedList is"+"\t");
        for(int i=0;i<ls.size();++i)//traversing LinkedList
        {
            System.out.print(ls.get(i) +"\t");//accessing element
        }
        System.out.println();
        ls.set(2,"Cena");//change specific element
        System.out.print("Changed LinkedList is"+"\t");
        for(int i=0;i<ls.size();++i)
        {
            System.out.print(ls.get(i) +"\t");
        }
        System.out.println();

        ls.remove(3);//removing element
        System.out.print("After removing element LinkedList is"+"\t");
        for(int i=0;i<ls.size();++i)
        {
            System.out.print(ls.get(i) +"\t");
        }
    }
}
//LinkedList Vs ArrayList
//Implements List, Queue, and Deque interfaces.	Implements List interface.
//Stores 3 values (previous address, data, and next address) in a single position.	Stores a single value in a single position.
//Provides the doubly-linked list implementation.	Provides a resizable array implementation.
//Whenever an element is added, prev and next address are changed.	Whenever an element is added, all elements after that position
//are shifted.
//To access an element, we need to iterate from the beginning to the element.	Can randomly access elements using indexes.

//creating linkedlist using List
//List<String> animals1 = new LinkedList<>();

// creating linkedlist using Queue
//Queue<String> animals2 = new LinkedList<>();

//creating linkedlist using Deque
//Deque<String> animals3 = new LinkedList<>();