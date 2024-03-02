package Zoho.Round2.Arrays;
import java.util.*;

public class SortByFrequency {
    public static void main(String[] args) {
        int[] arr = {2, 2, 3, 3, 3, 12, 12, 4, 5};
        Arrays.sort(arr);

        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        Integer[] sortedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }
        Arrays.sort(sortedArr, (a, b) -> map.get(b) - map.get(a));

        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}

