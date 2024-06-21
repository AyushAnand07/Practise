package Generics;

//Java Generics programming makes the code stable by detecting the bugs at compile time.
//Before generics, we can store any type of objects in the collection.
// Now generics force the java programmer to store a specific type of objects.


// We use < > to specify a Parameter type
class Test<T> {
    // An object of type T is declared
    T obj;
    Test(T obj) {     //constructor
        this.obj = obj;
    }
    public T getObject() {
        return this.obj;
    }
}

class Main {
    public static void main(String[] args) {
        Test<Integer> iObj = new Test<Integer>(15); // instance of an Integer type
        System.out.println(iObj.getObject());

        Test<String> sObj = new Test<String>("Hello");         // instance of a String type
        System.out.println(sObj.getObject());
    }
}

