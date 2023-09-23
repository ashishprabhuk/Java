package DataStructures.Hashing.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/* The LinkedHashMap Class is just like HashMap with an additional feature 
of maintaining an order of elements inserted into it. 
HashMap provided the advantage of quick insertion, search, and deletion 
but it never maintained the track and order of insertion, which the 
LinkedHashMap provides where the elements can be accessed in their insertion order. */

public class LinkedHashMapExample {
    public static void main(String[] args) {
        // Create a LinkedHashMap with String keys and Integer values
        LinkedHashMap<String, Integer> scores = new LinkedHashMap<>();

        // Add key-value pairs to the LinkedHashMap
        scores.put("Alice", 95);
        scores.put("Bob", 88);
        scores.put("Charlie", 76);

        // Retrieve values using keys
        int aliceScore = scores.get("Alice");
        int bobScore = scores.get("Bob");

        System.out.println("Alice's score: " + aliceScore); // Output: Alice's score: 95
        System.out.println("Bob's score: " + bobScore);     // Output: Bob's score: 88

        // Iterate through the LinkedHashMap (order is guaranteed)
        for (Map.Entry<String, Integer> entry : scores.entrySet()) {
            String name = entry.getKey();
            int score = entry.getValue();
            System.out.println(name + "'s score: " + score);
        }
        // Output:
        // Alice's score: 95
        // Bob's score: 88
        // Charlie's score: 76
    }
}
