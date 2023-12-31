package Strivers.Arrays;

public class LongSubArrSum {
    
    public static int getLongestSubArr_BF(int[] arr, int k) {
        int n = arr.length; // size of the array.
        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0; // Sum variable
            for (int j = i; j < n; j++) { // ending index
                // add the current element to the subarray arr[i...j-1]:
                s += arr[j];
                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static int getLongestSubArr_OP(int[] nums, int k) {
        int n = nums.length;
        int left = 0;
        int right = 0;
        int sum = nums[0];
        int maxLen = 0;
    
        while (right < n) {
            if (sum == k) {
                maxLen = Math.max(maxLen, right - left + 1);
                right++;
                if (right < n) {
                    sum += nums[right];
                }
            } else if (sum < k) {
                right++;
                if (right < n) {
                    sum += nums[right];
                }
            } else {
                sum -= nums[left];
                left++;
            }
        }
        return maxLen;
    }
    
    public static void main(String[] args) {
        // int[] arr = {2, 3, 5, 1, 9};
        int[] arr = {2, 2, 2, 2, 2, 3, 5, 1, 9};
        // int[] arr = { -1, 1, 1};
        int k = 10;
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
*/