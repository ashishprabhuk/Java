package Zoho.Round2.Arrays;

public class SlidingWindow {
    // Method to find the maximum for each and every contiguous subarray of size K.
    public static void printMaxInSlidingWindow(int[] arr, int k) {
        int n = arr.length;

        // Iterate through the array
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];

            // Find the maximum element in the current window
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }

            // Print the maximum element in the current window
            System.out.print(max + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 7, 6, 5, 1, 2, 3, 4};
        int k = 3;

        System.out.println("Sliding Window Maximum:");
        printMaxInSlidingWindow(arr, k);
    }
}


/*
Given an array of numbers and a window of
size k. Print the maximum of numbers inside the
window for each step as the window moves from
the beginning of the array.
INPUT :
Enter the array size : 8
Enter the elements : 1,3,5,2,1,8,6,9
Enter the window size : 3
OUTPUT :
5 5 5 8 8 9
*/

/*
Given a sliding window of size k print
the maximum of the numbers under the sliding
window.
Example: Consider a sliding window of size k equals 3. 
Let the array be [3,2,7,6,5,1,2,3,4] the output
should print 7 as the first output as first window
contains {3,2,7} and second window contains
{2,7,6} and so on and the final output is
{7,7,7,6,5,3,4}
*/