package DSA.Arrays.OneDArray;

// Rotate an Array to the Right by K Steps
public class RotateArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int k = 2;
        rotateArray(numbers, k);
        System.out.print("Rotated array: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    public static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than array length
        
        reverseArray(arr, 0, n - 1);
        reverseArray(arr, 0, k - 1);
        reverseArray(arr, k, n - 1);
    }
    public static void reverseArray(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    } 
}
