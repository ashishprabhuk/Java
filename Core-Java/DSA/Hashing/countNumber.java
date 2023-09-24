package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;

public class countNumber {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 3, 4, 2, 5, 5, 1};
        
        Map<Integer, Integer> numberCountMap = new HashMap<>();
        
        // Iterate through each number in the array
        for (int num : arr) {
            // Update the count in the map
            numberCountMap.put(num, numberCountMap.getOrDefault(num, 0) + 1);
        }
        
        // Print the number counts
        for (Map.Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

/*
 * We create a HashMap called numberCountMap to store the counts of numbers.
 * We iterate through each number in the array.
 * For each number, we check if it's already in the map. If it is, we increment its count by 1; 
 * otherwise, we add it to the map with a count of 1 using getOrDefault().
 * Finally, we print the number counts stored in the numberCountMap.
 */