package Algorithms.Search;

public class LinearSearch {

    // Function to perform linear search
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index where the target element is found
            }
        }
        return -1; // Return -1 if the target element is not found in the array
    }

    public static void main(String[] args) {
        int[] arr = { 12, 2, 4,14, 16, 6, 8, 10 };
        int target = 16;

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element " + target + " found at index " + result);
        } else {
            System.out.println("Element " + target + " not found in the array");
        }
    }
}
