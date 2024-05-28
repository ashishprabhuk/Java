package Zoho.Round2.Arrays;
import java.util.Arrays;

public class RotateArrByKSpace{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // {5,6,7,1,2,3,4} for k = 3
        int k = 3;
        rotate(arr,  arr.length, k); //~ [5, 6, 7, 1, 2, 3, 4] diff ans
        rotateArray(arr,  arr.length, k); //~ [4, 5, 6, 7, 1, 2, 3] diff ans
        // System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int[] arr, int n, int k) {
        k %= arr.length; // Ensure k is within array bounds
        reverseNum(arr,0,n-1); // Reverse entire array
        reverseNum(arr,0,k-1); // Reverse first k elements
        reverseNum(arr,k,n-1); // Reverse remaining elements
        System.out.println(Arrays.toString(arr));
        
    }
    public static void reverseNum(int[] arr, int start, int end) {
        while(start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void rotateArray(int[] arr, int n, int k) {
        if (k == 0) {
            return;
        }
        // Rotate the array to the left by one position
        int temp = arr[0];
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp;
    
        rotateArray(arr, n, k - 1);
    }
}