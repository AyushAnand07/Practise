package Generics;

//Java Generics programming makes the code stable by detecting the bugs at compile time.
//Before generics, we can store any type of objects in the collection.
// Now generics force the java programmer to store a specific type of objects.


import java.util.ArrayList;
import java.util.Iterator;

class TestGenerics1{
    public static void main(String args[]){
        ArrayList<String> list=new ArrayList<String>();
        list.add("rahul");
        list.add("jai");
        list.add("25");
//list.add(32);//compile time error

        String s=list.get(1);//type casting is not required
        System.out.println("element is: "+s);

        Iterator<String> itr=list.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}