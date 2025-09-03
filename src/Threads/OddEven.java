package Threads;

public class OddEven {
    private static int number = 1;
    // Thread to print odd numbers
    static class OddThread extends Thread {
        public void run() {
            while (number < 100) {
                if (number % 2 != 0) {  // Check if the number is odd
                    System.out.println("Odd: " + number);
                    number++;
                }
                try {
                    Thread.sleep(10);  // Sleep for a while to let even thread run
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    // Thread to print even numbers
    static class EvenThread extends Thread {
        public void run() {
            while (number < 100) {
                if (number % 2 == 0) {  // Check if the number is even
                    System.out.println("Even: " + number);
                    number++;
                }
                try {
                    Thread.sleep(10);  // Sleep for a while to let odd thread run
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        // Start both threads
        oddThread.start();
        evenThread.start();
    }
}
