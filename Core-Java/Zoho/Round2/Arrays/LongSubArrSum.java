package Zoho.Round2.Arrays;

public class LongSubArrSum {
    
    public static int getLongestSubArr_BF(int[] arr, int k) {
            int maxLen = 0;
            for (int i = 0; i < arr.length; i++) {
                int sum = 0;
                for (int j = i; j < arr.length; j++) {
                    sum += arr[j];
                    if (sum == k) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            return maxLen;
        }

        public static int getLongestSubArr_OP(int[] arr, int k) {
            int n = arr.length;
            int i = 0;
            int j = 0;
            int sum = 0;
            int maxLen = 0;
        
            while (j < n) {
                sum += arr[j];
                while (sum > k && i <= j) {
                    sum -= arr[i];
                    i++;
                }
                if (sum == k) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
                j++;
            }
            return maxLen;
        }
    
    public static void main(String[] args) {
        // int[] arr = {2, 3, 5, 1, 9};
        // int[] arr = {10, 5, 2, 7, 1, 9};
        int[] arr = {1, 2, 3};
        int k = 6;
        int len1 = getLongestSubArr_BF(arr, k);
        System.out.println("The length of the longest subarray is: " + len1);
        int len2 = getLongestSubArr_OP(arr, k);
        System.out.println("The length of the longest subarray is: " + len2);
    }
}

/* 
Only Positive numbers
Example 1:
Input Format: N = 3, k = 5, array[] = {2,3,5}
Result: 2
Explanation: The longest subarray with sum 5 is {2, 3}. And its length is 2.

Example 2:
Input Format: N = 5, k = 10, array[] = {2,3,5,1,9}
Result: 3
Explanation: The longest subarray with sum 10 is {2, 3, 5}. And its length is 3.

Example 3:
Input Format: N = 3, k = 1, array[] = {-1,1,1}
Result: 3
Explanation: The longest subarray with sum 1 is {1,1,1}. And its length is 3.

Example 1:
Input :
A[] = {10, 5, 2, 7, 1, 9}
K = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.

Example 2:

Input : 
A[] = {-1, 2, 3}
K = 6
Output : 0
Explanation: 
There is no such sub-array with sum 6.
*/