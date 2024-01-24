package InterfaceDefaultMethod;

import java.io.IOException;

interface Animal {
    public void name();
    default void show() //only default method can be used to define a method in interface
    {
        System.out.println("Hey Animal");
    }
}

class A implements Animal
{
    public void name()
    {
        System.out.println("Tiger");
    }
}

class Main {
    public static void main(String args[]) throws IOException {
        A ob = new A();
        ob.show();
        ob.name();
    }
}