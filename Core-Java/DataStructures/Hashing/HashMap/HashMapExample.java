package DataStructures.Hashing.HashMap;

import java.util.HashMap;

/*It is used to store key-value pairs, where each key is unique, 
and the values associated with those keys can be retrieved quickly. 
HashMap is a widely used data structure for fast data retrieval, 
and it is based on the principles of hashing. */

public class HashMapExample {
    public static void main(String[] args) {
        // Create a new HashMap with String keys and Integer values
        HashMap<String, Integer> scores = new HashMap<>();

        // Add key-value pairs to the HashMap
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 76);

        // Retrieve values using keys
        int aliceScore = scores.get("Alice");
        int bobScore = scores.get("Bob");

        System.out.println("Alice's score: " + aliceScore); // Output: Alice's score: 95
        System.out.println("Bob's score: " + bobScore);     // Output: Bob's score: 88

        // Check if a key exists in the HashMap
        boolean hasCharlie = scores.containsKey("Charlie");
        System.out.println("Has Charlie: " + hasCharlie);   // Output: Has Charlie: true

        // Remove a key-value pair
        scores.remove("Charlie");

        // Check the size of the HashMap
        int size = scores.size();
        System.out.println("Size of HashMap: " + size);     // Output: Size of HashMap: 2
    }
}

