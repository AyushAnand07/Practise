package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockExample {
    private final Lock lock= new ReentrantLock();

    public void OuterMethod()
    {
        lock.lock();
        try {
            System.out.println("Outer Lock");
            System.out.println(Thread.currentThread().getName());
            InnerMethod();
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
        finally {
            lock.unlock();
        }
    }

    private void InnerMethod() {
        lock.lock();
        try {
            System.out.println("Inner Lock");
            System.out.println(Thread.currentThread().getName());
        }
        catch (Exception e){
            Thread.currentThread().interrupt();
        }
        finally {
            lock.unlock();
        }
    }

    public static void main(String[]args)
    {
        ReentrantLockExample example= new ReentrantLockExample();
        example.OuterMethod();
    }
}
