package Threads;
//2 ways.....1- Extend Thread.....2-Implement Runnable

public class Example1 {
    public static void main(String []args)
    {
        //Task 1
        Task1 t1 = new Task1();
        t1.run();

        //Task2
        Task2 t2 = new Task2();
        Thread td2 = new Thread(t2);
        td2.run();

    }

}

class Task1 extends Thread //Method 1 that is extending thread class
{
    public void run()
    {
        System.out.println("Task 1 Started");
        for(int i=1;i<=10;++i){
            System.out.print(i +" ");
        }
        System.out.println("\nTask 1 Completed");
    }
}

class Task2 implements Runnable //method 2 that is implementing runnable interface
{

    @Override
    public void run() {
        System.out.println("Task 2 Started");
        for(int i = 11;i<=20;++i)
        {
            System.out.print(i +" ");
        }
        System.out.println("\nTask 2 Completed");
    }
}