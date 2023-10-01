package Zoho.Round2;
import java.util.*;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 2, 5, 8, 9, 8};
        printOccurrences(arr);
    }

    public static void printOccurrences(int[] arr) {
        // Create a HashMap to store the count of each number
        Map<Integer, Integer> countMap = new HashMap<>();

        // Iterate through the array and update the count in the HashMap
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Iterate through the HashMap and print the occurrences
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
}
