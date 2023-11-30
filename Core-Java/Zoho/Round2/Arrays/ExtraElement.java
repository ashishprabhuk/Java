package Zoho.Round2.Arrays;

import java.util.*;

public class ExtraElement {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 5};
        int[] array2 = {10, 30, 20};
        System.out.println(findExtraElement(array1, array2));
        findExtraElement_OP(array1, array2);
    }

    public static int findExtraElement(int[] array1, int[] array2) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        // Increment count for each element in array1
        for (int num : array1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        // Decrement count for each element in array2
        for (int num : array2) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) - 1);
        }
        // Find the element with count less than 0
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() < 0) {
                return entry.getKey();
            }
        }
        // Return -1 or throw an exception if no extra element is found
        return -1;
    }

    static void findExtraElement_OP(int[] array1, int[] array2) {
        int result = 0;

        // XOR all elements in array1
        for (int num : array1) {
            result ^= num;
        }

        // XOR all elements in array2
        for (int num : array2) {
            result ^= num;
        }

        System.out.println(result + " is the extra element.");
    }
}
