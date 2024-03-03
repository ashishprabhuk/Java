package Zoho.Round2.Arrays;
import java.util.*;

import Zoho.Round2.Maths.count;

public class CountOccurrences {
    public static void main(String[] args) {
        int[] arr = {2, 1, 3, 2, 2, 5, 8, 9, 8,7};
        printOccurrences(arr);
        System.out.println();
        count(arr);
    }

    public static void printOccurrences(int[] arr) { // counting all occurrences
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }
    static void count(int[] arr) { //counting all occurrences
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == -1)
                continue;
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = -1;  
                }
            }
            System.out.println(arr[i] + "-" + count);
        }
    }

    public static int countOccurrences_Target(int[] arr, int target) { //with loops
        int[] occurrences = new int[1000];
        for (int num : arr) {
            occurrences[num]++;
        }
        return occurrences[target];
    }

    public static int countOccurrences_target(int[] arr, int target) { //without loops
        return countOccurrences(arr, target, 0, arr.length - 1);
    }
    private static int countOccurrences(int[] arr, int target, int start, int end) {
        if (start > end) {
            return 0;
        }
        if (start == end) {
            return arr[start] == target ? 1 : 0;
        }
        int mid = start + (end - start) / 2;
        return countOccurrences(arr, target, start, mid) + countOccurrences(arr, target, mid + 1, end);
    }
}
