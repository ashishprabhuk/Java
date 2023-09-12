package Threads;

public class SingleThread {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task " + i);
            try {
                Thread.sleep(1000); // Simulate a task taking 1 second
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted.");
            }
        }
        System.out.println("Program completed.");
    }
}

/* Single-threading refers to the execution of a program with only one thread of control.
In a single-threaded program, tasks are performed sequentially, one after another.
If one task takes a long time to complete, it can block the entire program. */