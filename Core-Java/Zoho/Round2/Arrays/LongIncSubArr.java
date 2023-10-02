package Zoho.Round2.Arrays;

import java.util.Arrays;

/*  
* Input: arr[] = {3, 10, 2, 1, 20}
Output: 3
Explanation: The longest increasing subsequence is 3, 10, 20

Input: arr[] = {3, 2}
Output:1
Explanation: The longest increasing subsequences are {3} and {2}

Input: arr[] = {50, 3, 10, 7, 40, 80}
Output: 4
Explanation: The longest increasing subsequence is {3, 7, 40, 80}
*/

public class LongIncSubArr {
    
    static int lis(int arr[], int n) {
        int lis[] = new int[n];
    
        // Initialize LIS values to 1 for all elements
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
        System.out.println(Arrays.toString(lis));

        // Compute LIS values in a bottom-up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i]++;
                }
            }
        }
    
        // Find and return the maximum LIS value
        int maxLIS = 0;
        for (int i = 0; i < n; i++) {
            if (lis[i] > maxLIS) {
                maxLIS = lis[i];
            }
        }
    
        return maxLIS;
    }
    
    public static void main(String args[]) {
        int arr[] = { 10, 22, 9, 33, 21, 50, 41, 60 };
        int n = arr.length;
    
        // Function call
        System.out.println("Length of LIS is " + lis(arr, n));
    }
}

// import java.util.*;

// class LongIncSubArr {

//     // Function to find the length of Longest Increasing Subsequence (LIS)
//     static int lis(int arr[], int n) {
//         // Create an ArrayList to store the LIS elements
//         ArrayList<Integer> lis = new ArrayList<>();
//         lis.add(arr[0]); // Initialize the LIS with the first element of the array

//         // Iterate through the array starting from the second element
//         for (int i = 1; i < n; i++) {
//             // If the current element is greater than the last element in LIS, append it
//             if (arr[i] > lis.get(lis.size() - 1)) {
//                 lis.add(arr[i]);
//             } else {
//                 // Otherwise, find the position to replace an element using binary search
//                 int index = binarySearch(lis, arr[i]);
//                 lis.set(index, arr[i]); // Replace the element at the found position
//             }
//         }

//         return lis.size(); // The size of the LIS represents the length of the LIS
//     }

//     // Binary search to find the correct position for a new element in the LIS
//     static int binarySearch(ArrayList<Integer> lis, int key) {
//         int left = 0;
//         int right = lis.size() - 1;

//         while (left < right) {
//             int mid = left + (right - left) / 2;
//             if (lis.get(mid) >= key) {
//                 right = mid;
//             } else {
//                 left = mid + 1;
//             }
//         }

//         return left;
//     }

//     public static void main(String args[]) {
//         int arr[] = {10, 22, 9, 33, 21, 50, 41, 60};
//         int n = arr.length;

//         // Function call to find the length of the LIS
//         System.out.println("Length of LIS is " + lis(arr, n));
//     }
// }


    