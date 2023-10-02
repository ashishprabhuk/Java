package DataStructures;
import java.util.LinkedList;

/*  
 * A LinkedList in Java is a data structure that represents a collection of elements, 
 * where each element is connected to the next element through a "link."
 */

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<String> linkedList = new LinkedList<String>();

        // Add elements to the LinkedList
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Cherry");
        linkedList.add("Date");

        // Display the LinkedList
        System.out.println("LinkedList: " + linkedList);

        // Get the size of the LinkedList
        int size = linkedList.size();
        System.out.println("Size of LinkedList: " + size);

        // Access an element by index
        String elementAtIndex = linkedList.get(1);
        System.out.println("Element at index 1: " + elementAtIndex);

        // Check if an element exists in the LinkedList
        boolean containsBanana = linkedList.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Add an element at a specific index
        linkedList.add(2, "Grape");
        System.out.println("LinkedList after adding 'Grape' at index 2: " + linkedList);

        // Remove an element by index
        linkedList.remove(3);
        System.out.println("LinkedList after removing element at index 3: " + linkedList);

        // Iterate over the elements in the LinkedList
        System.out.println("Elements in LinkedList:");
        for (String element : linkedList) {
            System.out.println(element);
        }

        // Clear the LinkedList
        linkedList.clear();
        System.out.println("LinkedList after clearing: " + linkedList);
    }
}
