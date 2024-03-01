package Zoho.Round2.Arrays;

import java.util.*;

public class LongestContinuousRange {
    public static void findLongestContinuousRange(int[] arr) {
        Arrays.sort(arr);

        int maxLength = 0;     
        int currentLength = 1; 
        int start = 0;         
        int end = 0;           

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            // Update the longest range if the current range is longer
            if (currentLength > maxLength) {
                maxLength = currentLength;
                end = i; 
            }
        }
        start = end - maxLength + 1;

        System.out.println("Longest Continuous Range:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 10, 7, 9, 4, 6, 8}; // 1,3,4,6,7,8,9,10
        findLongestContinuousRange(arr);       // 0 1 2 3 4 5 6 7
    }
}


/*
 * 
 * INPUT :
 * Enter array size : 8
 * Enter array elements : 1 3 10 7 9 2 4 6
 * OUTPUT :
 * 1 2 3 4
 * Ex. INPUT :
 * Enter array size : 8
 * Enter array elements : 1 3 9 7 8 2 4 6
 * OUTPUT :
 * 1 2 3 4
 * 6 7 8 9
 */