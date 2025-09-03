package Threads;

import java.sql.SQLOutput;

public class HelloWorld extends Thread{
    public void run()
    {
        for(int i=1;i<=10;++i)
        {
            try
                {Thread.sleep(1000);} //always surround sleep with try/catch
            catch (InterruptedException e)
                {throw new RuntimeException(e);}

            System.out.println(i);
        }
    }
}

class TryHelloWorld
{
    public static void main(String[] args) throws InterruptedException {
        HelloWorld h1= new HelloWorld();
        h1.start();
        h1.join(); //let the h1 to finish first and have to add exception in method signature
        System.out.println("Hello");
    }
}
