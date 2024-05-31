package Zoho.Round2.Arrays;
import java.util.*;

class LongIncSubArr {
    public static void main(String args[]) {
        int arr[] = {50, 4, 10, 1, 2, 3, 40, 80};
        int[] arr1 = {3, 10, 2, 1, 20};
        int[] arr2 = {3, 2};
        int[] arr3 = {50, 3, 10, 7, 40, 80};
        System.out.println(max(arr));
        System.out.println(findLengthOfLIS(arr1)); // Output: 3
        System.out.println(findLengthOfLIS(arr2)); // Output: 1
        System.out.println(findLengthOfLIS(arr3)); // Output: 4
    }

    static int max(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
        int maxL = 1;
        // Initialize LIS values for all indices as 1
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
        // Compute optimized LIS values in bottom-up manner
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && lis[i] < lis[j] + 1) {
                    lis[i] = lis[j] + 1;
                }
            }
            System.out.println(Arrays.toString(lis));
            maxL = Math.max(maxL, lis[i]);
        }
        return maxL;
    }
    static int findLengthOfLIS(int[] arr) {
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1); // Initialize all elements in dp with 1

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int maxLength = 0;
        for (int len : dp) {
            maxLength = Math.max(maxLength, len);
        }

        return maxLength;
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