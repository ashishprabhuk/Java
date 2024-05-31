package Zoho.Round2.Arrays;

public class SearchInsertIndex {
    static int searchInsert(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (arr[mid] == target) {
                return mid; 
            }
            if(arr[mid]<target){
                start = mid+1;
            }else if(arr[mid]>target){
                end = mid-1;
            }
        }
        return start;
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 2;
        System.out.println(searchInsert(arr,target));
    }
}


/*

Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

 

Example 1:

Input: nums = [1,3,5,6], target = 5
Output: 2
Example 2:

Input: nums = [1,3,5,6], target = 2
Output: 1
Example 3:

Input: nums = [1,3,5,6], target = 7
Output: 4

 */