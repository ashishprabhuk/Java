package Algorithms.Search.BinarySearch;

import java.util.Arrays;

public class BinarySearch {

    // Function to perform binary search
    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // Check if the target is equal to the middle element
            if (arr[mid] == target) {
                return mid; // Return the index where the target element is found
            }

            // If the target is greater, ignore the start half
            if (arr[mid] < target) {
                start = mid + 1;
            }

            // If the target is smaller, ignore the end half
            else {
                end = mid - 1;
            }
        }

        return -1; // Return -1 if the target element is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = { 2,1,4,3};
        Arrays.sort(arr);
        int target = 3;

        int result = binarySearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}

/*  
 * This algorithm works by repeatedly dividing the sorted array in half until the 
 * desired element is found or the entire array has been searched.
 * 
 * The binary search algorithm has a time complexity of O(log n), where n is the size of the array. 
 * This is significantly faster than the linear search algorithm, which has a time complexity of O(n).
 */