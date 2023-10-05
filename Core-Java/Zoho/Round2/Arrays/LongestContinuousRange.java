package Zoho.Round2.Arrays;

import java.util.*;

public class LongestContinuousRange {
    public static void findLongestContinuousRange(int[] arr, int n) {
        // Step 1: Sort the array in ascending order
        Arrays.sort(arr);

        // Step 2: Initialize variables to keep track of the longest range
        int maxLength = 0;     // Length of the longest range
        int currentLength = 1; // Length of the current range (initially 1)
        int start = 0;         // Start index of the longest range
        int end = 0;           // End index of the longest range

        // Step 3: Iterate through the sorted array to find the longest range
        for (int i = 1; i < n; i++) {
            // Check if the current number is consecutive to the previous one
            if (arr[i] == arr[i - 1] + 1) {
                currentLength++; // Increment the current range length
            } else {
                currentLength = 1; // Reset the current range length
            }

            // Update the longest range if the current range is longer
            if (currentLength > maxLength) {
                maxLength = currentLength;
                end = i; // Update the end index of the longest range
            }
        }

        // Step 4: Calculate the start index of the longest range
        start = end - maxLength + 1;

        // Step 5: Print the longest continuous range
        System.out.println("Longest Continuous Range:");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        System.out.print("Enter array elements: ");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        findLongestContinuousRange(array, size);

        scanner.close();
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