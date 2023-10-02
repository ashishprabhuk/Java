package DataStructures.Hashing.HashSet;
import java.util.*;

public class HashSetExample {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> set = new HashSet<String>();

        // Add elements to the HashSet
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");
        set.add("Date");

        // Display the HashSet
        System.out.println("HashSet: " + set);

        // Check if an element exists in the HashSet
        boolean containsBanana = set.contains("Banana");
        System.out.println("Contains 'Banana': " + containsBanana);

        // Remove an element from the HashSet
        boolean removed = set.remove("Cherry");
        System.out.println("Removed 'Cherry': " + removed);

        // Display the size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Iterate over the elements in the HashSet
        System.out.println("Elements in HashSet:");
        for (String element : set) {
            System.out.println(element);
        }

        // Clear the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
