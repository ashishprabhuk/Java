package Zoho.Round2.Arrays;

import java.util.Arrays;

public class MaxSumSubArray {
    public static void main(String[] args) {
        // Define the input array
        int[] array = { -2, 7, 5, -1, 3, 2, 9, -7 };
        // Call the function to find the maximum sum subarray
        findMaxSumSubarray(array);
    }

    public static void findMaxSumSubarray(int[] array) {
        // Initialize the maximum sum and the current sum to 0
        int maxSum = 0;
        int currentSum = 0;
        // Initialize the start and end indices of the maximum sum subarray to 0
        int start = 0;
        int end = 0;
        // Initialize a temporary start index to 0
        int tempStart = 0;

        // Iterate over each element in the array
        for (int i = 0; i < array.length; i++) {
            // If the current element is negative, reset the current sum to 0 and move the
            // temporary start index to the next element
            if (array[i] < 0) {
                currentSum = 0;
                tempStart = i + 1;
            } else {
                // If the current element is not negative, add it to the current sum
                currentSum += array[i];
            }

            // If the current sum is greater than the maximum sum, update the maximum sum
            // and the start and end indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Extract the subarray that resulted in the maximum sum
        int[] subArray = Arrays.copyOfRange(array, start, end + 1);

        // Print the maximum sum and the elements of the subarray
        System.out.println("Sum : " + maxSum);
        System.out.println("Elements : " + Arrays.toString(subArray));
    }
}