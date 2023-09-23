package DataStructures.Hashing.TreeMap;

import java.util.*;

/* TreeMap is a class that implements the SortedMap interface and 
provides a sorted order for the keys in the map. It uses a Red-Black tree structure 
to maintain the keys in a sorted order. TreeMap is part of the Collections Framework and 
is particularly useful when you need to maintain elements in sorted order 
based on their natural order or a custom comparator. */

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap with Integer keys and String values
        TreeMap<Integer, String> scores = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        scores.put(95, "Alice");
        scores.put(88, "Bob");
        scores.put(76, "Charlie");

        // Retrieve values using keys (sorted order)
        int lowestScore = scores.firstKey(); // Gets the lowest key (smallest score)
        int highestScore = scores.lastKey(); // Gets the highest key (largest score)

        System.out.println("Lowest score: " + lowestScore);   // Output: Lowest score: 76
        System.out.println("Highest score: " + highestScore); // Output: Highest score: 95

        // Iterate through the TreeMap (sorted order)
        for (Map.Entry<Integer, String> entry : scores.entrySet()) {
            int score = entry.getKey();
            String name = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }
        // Output:
        // Charlie's score: 76
        // Bob's score: 88
        // Alice's score: 95
    }
}
