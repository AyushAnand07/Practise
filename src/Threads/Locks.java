package Threads;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Locks {
    int balance = 1000;
    private final Lock lock= new ReentrantLock();

    public void withdrawal(int amount)
    {
        System.out.println(Thread.currentThread().getName() +" Attempting to withdraw money");
        try {
            if (lock.tryLock()) {

                if (balance >= amount) {
                    try {
                        System.out.println(Thread.currentThread().getName() + " Withdrawal in progress for amount " + amount);
                        Thread.sleep(3000);
                        balance -= amount;
                        System.out.println(Thread.currentThread().getName() + " Money withdrawn " + amount + " Money remaining " + balance);
                    } catch (Exception e) {
                    } finally {
                        lock.unlock();
                    }
                }//end inner if

                else
                    System.out.println(Thread.currentThread().getName() + " Insufficient balance");
            }//end outer if
            else
                System.out.println(Thread.currentThread().getName() + " Couldn't acquire Lock");
        }
        catch (Exception e){
            Thread.currentThread().interrupt(); //good practise so we perform tasks later using Thread.currentThread().isInterrupted()
        }
    }
}

class TryLocks
{
    public static void main(String[] args)
    {
        Locks locks= new Locks();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                locks.withdrawal(600);
            }
        };
        Thread t1= new Thread(task,"Thread 1");
        Thread t2= new Thread(task,"Thread 2");
        t1.start();
        t2.start();
    }
}
