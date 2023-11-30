package Zoho.Round2.Arrays;

import java.util.*;

public class ExtraElement {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 5};
        int[] array2 = {10, 30, 20};
        findExtraElement(array1, array2);
        findExtraElement_OP(array1, array2);
    }

    static void findExtraElement(int[] array1, int[] array2) {
        HashMap<Integer, Integer> countMap = new HashMap<>();

        // Count elements in array1
        for (int num : array1) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        // Subtract elements in array2 from the count
        for (int num : array2) {
            if (countMap.containsKey(num)) {
                countMap.put(num, countMap.get(num) - 1);
            }
        }

        // Find the extra element
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 0) {
                int extraElement = entry.getKey();
                int index = findIndex(array1, extraElement);
                System.out.println(extraElement + " is the extra element in array 1 at index " + index);
                return;
            }
        }

        System.out.println("No extra element found.");
    }

    static int findIndex(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                return i;
            }
        }
        return -1; // If the element is not found
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
