package Zoho.Round2.Arrays;
/*
Given an array arr, return true if the array was originally sorted in non-decreasing order,
then rotated some number of positions (including zero). Otherwise, return false.

There may be duplicates in the original array.

Note: An array A rotated by x positions results in an array B of the same length 
such that A[i] == B[(i+x) % A.length], where % is the modulo operation.

Example 1:

Input: arr = [3,4,5,1,2]
Output: true
Explanation: [1,2,3,4,5] is the original sorted array.
You can rotate the array by x = 3 positions to begin on the the element of value 3: [3,4,5,1,2].
Example 2:

Input: arr = [2,1,3,4]
Output: false
Explanation: There is no sorted array once rotated that can make arr.
Example 3:

Input: arr = [1,2,3]
Output: true
Explanation: [1,2,3] is the original sorted array.
You can rotate the array by x = 0 positions (i.e. no rotation) to make arr.
*/

public class CheckSortedNRotated {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        System.out.println(isSortRotated(arr));
    }
    private static boolean isSortRotated(int[] arr) { // optimal
        int count = 0;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i] > arr[i+1]){
                count++;
            }
        }
        if(count > 1){
            return false;
        }else if(arr[0]<arr[arr.length-1] && count!=0){
            return false;
        }
        return true;
    }
    static boolean check(int[] nums) {
        int count = 0 ;
        for(int i = 0 ; i < nums.length ; i++){
            if(nums[i]>nums[(i+1)%nums.length])count++;
            if(count>1) return false;
        }
        return true;
    }
}

