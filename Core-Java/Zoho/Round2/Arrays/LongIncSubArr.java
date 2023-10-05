package Zoho.Round2.Arrays;
import java.util.*;

class LongIncSubArr {

    // Function to find the length of Longest Increasing Subsequence (LIS)
    static void lis(int arr[], int n) {
        // Create an ArrayList to store the LIS elements
        ArrayList<Integer> lis = new ArrayList<>();
        lis.add(arr[0]); // Initialize the LIS with the first element of the array

        // Iterate through the array starting from the second element
        for (int i = 1; i < n; i++) {
            // If the current element is greater than the last element in LIS, append it
            if (arr[i] > lis.get(lis.size() - 1)) {
                lis.add(arr[i]);
            } else {
                // Otherwise, find the position to replace an element using binary search
                int index = binarySearch(lis, arr[i]);
                lis.set(index, arr[i]); // Replace the element at the found position
            }
        }
        System.out.println(lis); // The size of the LIS represents the length of the LIS
        System.out.println("Length of LIS is " + lis.size()); // The size of the LIS represents the length of the LIS
    }

    // Binary search to find the correct position for a new element in the LIS
    static int binarySearch(ArrayList<Integer> lis, int key) {
        int start = 0;
        int end = lis.size() - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (lis.get(mid) >= key) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static void main(String args[]) {
        int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
        int n = arr.length;

        // Function call to find the length of the LIS
        lis(arr, n);
    }
}

/*
Given an array arr[] of size N,to find the length of the Longest Increasing Subsequence (LIS) 
i.e., the longest possible subsequence in which the elements of the subsequence 
are sorted in increasing order.

Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20

Input: arr[] = {3, 2}
Output:1
Explanation: The longest increasing subsequences are {3} and {2}

Input: arr[] = {50, 3, 10, 7, 40, 80}
Output: 4
Explanation: The longest increasing subsequence is {3, 7, 40, 80}
 */