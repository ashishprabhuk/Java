package Threads;

class MultiThreadExample extends Thread {
    private int taskId;

    public MultiThreadExample(int taskId) {
        this.taskId = taskId;
    }

    public void run() {
        System.out.println("Task " + taskId + " started.");
        try {
            Thread.sleep(1000); // Simulate a task taking 1 second
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }
        System.out.println("Task " + taskId + " completed.");
    }
}

public class MultiThread {
    public static void main(String[] args) {
        MultiThreadExample thread1 = new MultiThreadExample(1);
        MultiThreadExample thread2 = new MultiThreadExample(2);

        thread1.start();
        thread2.start();

        System.out.println("Main thread continues executing.");
    }
}

/*
 * Multi-threading involves the use of multiple threads to execute tasks concurrently, 
 * allowing for better utilization of CPU resources and potentially improving program performance. 
 * Each thread can work on a different task simultaneously.
 */