package Strivers.Arrays;

import java.util.Arrays;

public class RotateArrByKSpace{
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // {5,6,7,1,2,3,4} for k = 3
        int k = 3;
        rotate(arr, k);
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length; // Ensure k is within array bounds
        int n = nums.length;
        reverseNum(nums,0,n-1); // Reverse entire array
        reverseNum(nums,0,k-1); // Reverse first k elements
        reverseNum(nums,k,n-1); // Reverse remaining elements
        System.out.println(Arrays.toString(nums));
    }
    public static void reverseNum(int[] nums, int start, int end) {
        while(start < end) {
            // int temp = nums[start];
            // nums[start] = nums[end];
            // nums[end] = temp;
            nums[start]=nums[start]+nums[end]-(nums[end]=nums[start]);
            start++;
            end--;
        }
    }
}
