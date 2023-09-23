package DSA.Hashing;

import java.util.*;

public class NumberCountHash {
    public static void main(String[] args) {
        int[] array = {1, 2, 1, 3, 2};
        int[] queries = {1, 3, 4, 2, 10};
        
        // Create a HashMap to store the counts of each number in the array
        Map<Integer, Integer> numberCounts = new HashMap<>();
        
        // Populate the HashMap with counts from the array
        for (int num : array) {
            numberCounts.put(num, numberCounts.getOrDefault(num, 0) + 1);
        }
        
        // Process the queries
        for (int query : queries) {
            int count = numberCounts.getOrDefault(query, 0);
            System.out.println("Number " + query + " appears " + count + " times in the array.");
        }
    }
}

