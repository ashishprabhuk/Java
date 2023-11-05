package Strivers.Arrays;

public class LongSubArrPosNeg {
    public static int getLongestSubarray(int []arr, int k) {
        int n = arr.length; // size of the array.

        int len = 0;
        for (int i = 0; i < n; i++) { // starting index
            int s = 0;
            for (int j = i; j < n; j++) { // ending index
                // add the current element to the subarray arr[i...j-1]:
                s += arr[j];

                if (s == k)
                    len = Math.max(len, j - i + 1);
            }
        }
        return len;
    }

    public static void main(String[] args) {
        int[] arr = { -1, 1, 1};
        int k = 1;
        int len = getLongestSubarray(arr, k);
        System.out.println("The length of the longest subarray is: " + len);
    }
}
