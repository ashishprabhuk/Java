package Zoho.Round2;

public class SlidingWindow {
    // Method to find the maximum for each and every contiguous subarray of size K.
    static void printMaxInSubarrays(int[] arr, int K) {
        int N = arr.length;

        for (int i = 0; i <= N - K; i++) {
            int max = arr[i];

            for (int j = 1; j < K; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            System.out.print(max + " ");
        }
    }

    // Driver's code
    public static void main(String[] args) {
        int[] arr = {3,2,7,6,5,1,2,3,4};
        int K = 3;

        // Function call
        printMaxInSubarrays(arr, K);
    }
}
