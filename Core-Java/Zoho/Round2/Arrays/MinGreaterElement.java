package Zoho.Round2.Arrays;

import java.util.*;

public class MinGreaterElement {
    public static void main(String[] args) {
        // Define the input array
        int[] array = { 2, 3, 7, -1, 8, 5, 11 };
        // Call the function to find the minimum greater elements and store the result
        Map<Integer, Integer> result = findMinGreaterElements(array);
        // Print the result
        printResult(result);
    }

    public static Map<Integer, Integer> findMinGreaterElements(int[] array) {
        // Create a map to store the result
        Map<Integer, Integer> result = new LinkedHashMap<>();
        // Iterate over each element in the array
        for (int i = 0; i < array.length; i++) {
            // Store the current element
            int current = array[i];
            // Initialize the minimum greater element as the maximum possible integer
            int minGreater = Integer.MAX_VALUE;
            // Iterate over the array again to find the minimum greater element
            for (int j = 0; j < array.length; j++) {
                // If the current element in the inner loop is greater than the current element
                // in the outer loop
                // and is less than the current minimum greater element, update the minimum
                // greater element
                if (array[j] > current && array[j] < minGreater) {
                    minGreater = array[j];
                }
            }
            // If no greater element was found, store null in the result map, otherwise
            // store the minimum greater element
            result.put(current, minGreater == Integer.MAX_VALUE ? null : minGreater);
        }
        // Return the result map
        return result;
    }

    public static void printResult(Map<Integer, Integer> result) {
        // Iterate over each entry in the result map
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            // Print the key and value of the entry, if the value is null print an empty
            // string
            System.out.println(entry.getKey() + "->" + (entry.getValue() != null ? entry.getValue() : ""));
        }
    }
}