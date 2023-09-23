package DataStructures.Hashing.LinkedHashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class AccessOrdered{
    public static void main(String[] args) {
        // Create a LinkedHashMap with access order
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>(16, 0.75f, true);

        // Add key-value pairs to the LinkedHashMap
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 76);

        // Access an element (moves it to the end of the order)
        int aliceScore = scores.get("Alice");

        // Iterate through the LinkedHashMap (order is based on access frequency)
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }
        // Output:
        // Bob's score: 88
        // Charlie's score: 76
        // Alice's score: 95
    }
}

