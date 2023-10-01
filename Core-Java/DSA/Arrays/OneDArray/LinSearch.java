package DSA.Arrays.OneDArray;

public class LinSearch {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int index = linearSearch(numbers, target);
        if (index != -1) {
            System.out.println("Element " + target + " found at index " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }
    
}
