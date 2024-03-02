package Zoho.Round2.Arrays;
import java.util.Arrays;

public class RotateArrByKSpace{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // {5,6,7,1,2,3,4} for k = 3
        int k = 3;
        rotate(arr, k);
    }
    public static void rotate(int[] arr, int k) {
        k %= arr.length; // Ensure k is within array bounds
        int n = arr.length;
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
}