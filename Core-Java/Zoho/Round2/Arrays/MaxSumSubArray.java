package Zoho.Round2.Arrays;
import java.util.Arrays;

/*
2) Find the largest sum contiguous subarray which
should not have negative numbers. We have to
print the sum and the corresponding array
elements which brought up the sum.
input:
Array : {-2, 7, 5, -1, 3, 2, 9, -7}
Output:
Sum : 14
Elements : 3, 2, 9
*/

public class MaxSumSubArray {
    public static void main(String[] args) {
        // Define the input arr
        int[] arr = { -2, 7, 5, -1, 3, 2, 9, 7 };
        // Call the function to find the maximum sum subarray
        findMaxSumSubarray(arr);
    }

    public static void findMaxSumSubarray(int[] arr) {
        // Initialize the maximum sum and the current sum to 0
        int maxSum = 0;
        int currentSum = 0;
        // Initialize the start and end indices of the maximum sum subarray to 0
        int start = 0;
        int end = 0;
        // Initialize a temporary start index to 0
        int index = 0;

        // Iterate over each element in the arr
        for (int i = 0; i < arr.length; i++) {
            // If the current element is negative, reset the current sum to 0 and move the
            // temporary start index to the next element
            if (arr[i] < 0) {
                currentSum = 0;
                index = i + 1;
            } else {
                // If the current element is not negative, add it to the current sum
                currentSum += arr[i];
            }

            // If the current sum is greater than the maximum sum, update the maximum sum
            // and the start and end indices
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = index;
                end = i;
            }
        }

        // Extract the subarray that resulted in the maximum sum
        int[] subArray = Arrays.copyOfRange(arr, start, end + 1);

        // Print the maximum sum and the elements of the subarray
        System.out.println("Sum : " + maxSum);
        System.out.println("Elements : " + Arrays.toString(subArray));
    }
}

/*
The `findMaxSumSubarray` method is used to find the maximum sum subarray in an input array. Here's an explanation of how it works:

1. The method takes an integer array `arr` as input.

2. It initializes the variables `maxSum` and `currentSum` to 0. `maxSum` will store the maximum sum found so far, and `currentSum` will store the sum of the current subarray being considered.

3. It also initializes the variables `start`, `end`, and `index` to 0. `start` and `end` will store the indices of the maximum sum subarray, and `index` will store the temporary start index of the current subarray being considered.

4. The method then iterates over each element in the `arr` array using a for loop.

5. Inside the loop, it checks if the current element is negative. If it is, it means that the current subarray's sum will be smaller if we include this negative element. So, it resets the `currentSum` to 0 and moves the `index` to the next element.

6. If the current element is not negative, it adds it to the `currentSum`.

7. After adding the current element to the `currentSum`, it checks if the `currentSum` is greater than the `maxSum`. If it is, it updates the `maxSum`, `start`, and `end` variables with the current values of `currentSum`, `index`, and `i`, respectively.

8. This process continues until all elements in the `arr` array have been processed.

9. After the loop ends, the method uses the `Arrays.copyOfRange` method to extract the subarray that resulted in the maximum sum. It creates a new array `subArray` containing the elements from the `start` index to the `end` index + 1.

10. Finally, the method prints the maximum sum and the elements of the subarray as output.

That's how the `findMaxSumSubarray` method works to find the maximum sum subarray in the input array.
*/