package Threads;
// Java program to demonstrate inter-thread communication(wait(), join() and notify())
import java.util.Scanner;
public class threadexample
{
    public static void main(String[] args) throws InterruptedException
    {
        final PC pc = new PC();
        Thread t1 = new Thread(new Runnable()             // Create a thread object that calls pc.produce()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.produce();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(new Runnable()             // Create another thread object that calls pc.consume()
        {
            @Override
            public void run()
            {
                try
                {
                    pc.consume();
                }
                catch(InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        });
        // Start both threads
        t1.start();
        t2.start();
        // t1 finishes before t2
        t1.join();
        t2.join();
    }
    // PC (Produce Consumer) class with produce() and consume() methods.
    public static class PC
    {
        public void produce()throws InterruptedException            // Prints a string and waits for consume()
        {
            // synchronized block ensures only one thread running at a time.
            synchronized(this)
            {
                System.out.println("producer thread running");
                wait();                                           // releases the lock on shared resource
                System.out.println("Resumed");                   // and waits till some other method invokes notify().
            }
        }
        // Sleeps for some time and waits for a key press. After key is pressed, it notifies produce().
        public void consume()throws InterruptedException
        {
            Thread.sleep(1000);                     // this makes the produce thread to run first.
            Scanner s = new Scanner(System.in);
            synchronized(this)                      // synchronized block ensures only one thread running at a time.
            {
                System.out.println("Waiting for return key.");
                s.nextLine();
                System.out.println("Return key pressed");

                notify();                       // notifies the produce thread that it can wake up.
                Thread.sleep(2000);       // Sleep
            }
        }
    }
}
