package Zoho.Round2.Arrays;
import java.util.*;

public class MinGreaterElement {
    public static void main(String[] args) {
        int[] array = { 2, 3, 7, -1, 8, 5, 11 };
        Map<Integer, Integer> result = findMinGreaterElements(array);
        printResult(result);
    }
    public static Map<Integer, Integer> findMinGreaterElements(int[] array) {
        Map<Integer, Integer> result = new LinkedHashMap<>();
        for (int i = 0; i < array.length; i++) {
            int current = array[i];
            int minGreater = Integer.MAX_VALUE;
            for (int j = 0; j < array.length; j++) {
                if (array[j] > current && array[j] < minGreater) {
                    minGreater = array[j];
                }
            }
            result.put(current, minGreater == Integer.MAX_VALUE ? null : minGreater);
        }
        return result;
    }
    public static void printResult(Map<Integer, Integer> result) {
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + "->" + (entry.getValue() != null ? entry.getValue() : ""));
        }
    }
}

/*
Given an array, find the minimum of all the
greater numbers for each element in the
array.

Sample:
Array : {2, 3, 7, -1, 8, 5, 11}

Output:
{2->3, 3->5, 7->8, -1->2, 8->11, 5->7, 11->} 
 */