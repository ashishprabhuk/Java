package Threads;

class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 3; i++) {
            System.out.println("Runnable Thread: " + i);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

public class Runnables {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);

        thread.start(); // Start the thread

        // Main thread continues its execution
        for (int i = 1; i <= 3; i++) {
            System.out.println("Main Thread: " + i);
            try {
                Thread.sleep(1000); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

