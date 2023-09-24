package DSA.Hashing;

import java.util.*;

public class NumberQuery {
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

/*
 * We first create a HashMap called numberCountMap to store the counts of numbers in the array.
 * We iterate through the array and update the count of each number in the map using getOrDefault().
 * After counting the occurrences of all numbers in the array, we iterate through the queries.
 * For each query, we use numberCountMap.getOrDefault(query, 0) to retrieve the count of the queried number. 
 * If the number is not found in the map, it defaults to 0.
 * Finally, we print the count for each queried number.
 */
