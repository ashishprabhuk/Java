package Zoho.Round2.Arrays;
import java.util.*;

class LongIncSubArr {
    public static void main(String args[]) {
        int arr[] = {3, 10, 2, 1, 20};
        lis(arr);
    }
    public static void lis(int[] arr) {
        int n = arr.length;
        int[] lis = new int[n];
    
        for (int i = 0; i < n; i++) {
            lis[i] = 1;
        }
        int max = 1;
        
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    lis[i] = Math.max(lis[i], lis[j] + 1);
                }
            }
            max = Math.max(max, lis[i]);
        }
        System.out.println(max);
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