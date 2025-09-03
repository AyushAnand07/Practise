package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServicePrintEven {
    public static void main(String[] args) throws InterruptedException {
        // Create an ExecutorService with a fixed thread pool of 4 threads
        ExecutorService executor = Executors.newFixedThreadPool(4);

        // Create tasks to print even numbers under 100
        for (int i = 0; i < 100; i += 2) {
            final int evenNumber = i;
            // Submit a task to print each even number
            executor.submit(() -> {
                System.out.println(evenNumber);
            });
        }

        // Shut down the executor after all tasks are submitted
        executor.shutdown();

        // Wait for all tasks to finish before exiting the program
        if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
            executor.shutdownNow();
        }
    }
}
