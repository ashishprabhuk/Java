package Zoho.Round2.Arrays;
import java.util.*;

import Zoho.Round2.Maths.count;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 2, 5, 8, 9, 8,7};
        // printOccurrences(arr);
        count(arr);
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
    static void count(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            // Skip if the element is already visited
            if (arr[i] == -1)
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;  // Mark the visited element as -1
                }
            }
            System.out.println(arr[i] + "-" + count);
        }
    }
}
