package Zoho.Round2.Arrays;
import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 12, 12, 4, 5};

        // Step 1: Create a frequency map to store the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Step 2: Sort the array in descending order based on the frequency of occurrence
        Arrays.sort(arr);
        Integer[] sortedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr, (a, b) -> frequencyMap.get(b) - frequencyMap.get(a));

        // Step 3: Print the sorted array
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}

