package Zoho.Round2.Arrays;

import java.util.Arrays;

public class ProductExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        int[] ans = productExceptSelf(arr);
        int[] ans1 = productExceptSelf1(arr);
        int[] ans2 = productExceptSelf2(arr);
        System.out.println(Arrays.toString(ans));
        System.out.println(Arrays.toString(ans1));
        System.out.println(Arrays.toString(ans2));
    }
    static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
    static int[] productExceptSelf1(int[] arr) { // 1 2 3 4
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int[] ans = new int[arr.length];

        left[0] = 1;
        for(int i = 1; i<arr.length;i++){
            left[i] = left[i-1]*arr[i-1]; // 1, 1, 2, 6
        }

        right[arr.length-1] = 1;
        for(int i = arr.length-2; i>=0;i--){
            right[i] = right[i+1]*arr[i+1]; // 24, 12, 4, 1
        }

        for(int i = 0; i<arr.length;i++){
            ans[i] = left[i]*right[i];
        }
        return ans;
    }
    static int[] productExceptSelf2(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        int pro = 1;
        for(int i : nums) {
            pro *= i;
        }
        
        for(int i = 0; i < n; i++) {
            ans[i] = pro / nums[i];
        }
        return ans;
    }
}

/*

Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.


Example 1:
Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:
Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]

 */