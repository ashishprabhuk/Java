package DataStructures.Hashing.HashTable;

import java.util.Hashtable;
import java.util.Map;

public class HashtableExample {
    public static void main(String[] args) {
        // Create a Hashtable with String keys and Integer values
        Hashtable<String, Integer> scores = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 76);

        // Retrieve values using keys
        int aliceScore = scores.get("Alice");
        int bobScore = scores.get("Bob");

        System.out.println("Alice's score: " + aliceScore); // Output: Alice's score: 95
        System.out.println("Bob's score: " + bobScore);     // Output: Bob's score: 88

        // Iterate through the Hashtable (order is not guaranteed)
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }
    }
}

