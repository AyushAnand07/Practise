package Abstraction;
//Abstraction is a process of hiding the implementation details and showing only functionality to the user.
//It can have abstract and non-abstract methods.
import java.io.IOException;

abstract class AbstractClass {
    public abstract void display();
}

class TryAbstractClass extends AbstractClass
{
    public void display()
    {
        System.out.println("Im in abstract class");
    }
}

class Main
{
    public static void main(String[] args)throws IOException
    {
        TryAbstractClass t = new TryAbstractClass();
        t.display();
    }
}
