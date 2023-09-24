package DataStructures.Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class GetOrDefault {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        // Put some key-value pairs into the map
        map.put("apple", 5);
        map.put("banana", 3);

        // Attempt to get the value for a key that exists
        int appleCount = map.getOrDefault("apple", 0);
        System.out.println("Apple Count: " + appleCount); // Output: Apple Count: 5

        // Attempt to get the value for a key that doesn't exist
        int orangeCount = map.getOrDefault("orange", 0);
        System.out.println("Orange Count: " + orangeCount); // Output: Orange Count: 0
    }
}

