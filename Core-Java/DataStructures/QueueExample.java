package DataStructures;
import java.util.LinkedList;
import java.util.Queue;

/*  
 * In Java, a Queue is a data structure that follows the First-In-First-Out (FIFO) order, 
 * meaning that the element added first is the one that gets removed first. 
 */


public class QueueExample {
    public static void main(String[] args) {
        // Create a Queue using LinkedList
        Queue<String> queue = new LinkedList<>();

        // Add elements to the Queue
        queue.add("Apple");
        queue.add("Banana");
        queue.add("Cherry");
        queue.add("Date");

        // Display the Queue
        System.out.println("Queue: " + queue);

        // Peek at the front element without removing it
        String frontElement = queue.peek();
        System.out.println("Front element: " + frontElement);

        // Remove and retrieve the front element
        String removedElement = queue.poll();
        System.out.println("Removed front element: " + removedElement);

        // Display the size of the Queue
        int size = queue.size();
        System.out.println("Size of Queue: " + size);

        // Iterate over the elements in the Queue
        System.out.println("Elements in Queue:");
        for (String element : queue) {
            System.out.println(element);
        }
    }
}
