package Threads;
import java.io.*;

//A thread is a thread of execution in a program. The Java Virtual Machine allows an application to have multiple threads of execution
//running concurrently.Every thread has a priority.Threads with higher priority are executed in preference to threads with lower priority.

//There are two ways to create a thread:
//By extending Thread class(we use the functions of thread class example run()
//By implementing Runnable interface.

class Main extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; ++i)
            System.out.println(i);

        try {
            Thread.sleep(1000);

        } catch (InterruptedException e) {
        }
    }
}

class tryThread {
    public static void main(String args[]) throws IOException {
        Main m = new Main();
        Main m1 = new Main();
        m.start();//Starting thread 1
        m1.start();//Starting thread 2
    }
}