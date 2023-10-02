package Zoho.Round2.Arrays;
import java.util.Arrays;

public class AlternateSorting {

    public static int[] alternateSort(int[] arr) {
        // Sort the input array in ascending order
        Arrays.sort(arr);

        int n = arr.length;
        int[] result = new int[n];
        int left = 0; // Pointer for the minimum element
        int right = n - 1; // Pointer for the maximum element
        boolean flag = true; // Flag to alternate between max and min

        // Iterate through the sorted array and pick max and min alternately
        for (int i = 0; i < n; i++) {
            if (flag) {
                result[i] = arr[right];
                right--;
            } else {
                result[i] = arr[left];
                left++;
            }
            flag = !flag; // Toggle the flag
        }

        return result;
    }

    public static void main(String[] args) {
        int[] inputArray = {1, 2, 3, 4, 5, 6, 7};
        int[] resultArray = alternateSort(inputArray);

        System.out.println("Input Array: " + Arrays.toString(inputArray));
        System.out.println("Output Array: " + Arrays.toString(resultArray));
    }
}

