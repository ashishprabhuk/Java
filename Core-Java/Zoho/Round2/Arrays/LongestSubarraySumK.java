package Zoho.Round2.Arrays;

public class LongestSubarraySumK {
    static int longestSubarrayLength(int[] arr, int k) {
        int maxLength = 0;
        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++) {
                currentSum += arr[j];
                if (currentSum == k) {
                    int currentLength = j - i + 1;
                    maxLength = Math.max(maxLength, currentLength);
                }
            }
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr1 = {10, 5, 2, 7, 1, 9};
        int k1 = 15;
        System.out.println("Output for arr1: " + longestSubarrayLength(arr1, k1));

        int[] arr2 = {-5, 8, -14, 2, 4, 12};
        int k2 = -5;
        System.out.println("Output for arr2: " + longestSubarrayLength(arr2, k2));
    }
}

