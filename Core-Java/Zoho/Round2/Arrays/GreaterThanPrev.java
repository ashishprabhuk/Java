package Zoho.Round2.Arrays;

import java.util.*;

public class GreaterThanPrev {
    public static void main(String[] args) {
        int[] array = {2, -3, -4, 5, 9, 7, 8};
        printElements(array, 3);
    }

    static void printElements(int[] arr, int k) {
        int n = arr.length;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i <= n - k; i++) { // 4 5 31 6 23 1
            int max = arr[i];
            for (int j = 1; j < k; j++) { 
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            set.add(max);
            // System.out.println(max + " ");
        }
        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}



/*
You’re given an array. Print the elements of the
array which are greater than its previous elements
in the array.
Input : 2, -3, -4, 5, 9, 7, 8 
Output: 2 5 9
You should solve this question in O(n) time.
 */