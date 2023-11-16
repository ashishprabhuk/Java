package Zoho.Round2.Arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {
    public static int singleNumber_BF(int[] nums) {
        int x=0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i] ,map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() == 1){
                x = entry.getKey();
                break;
            }
        }
        return x;
    }

    public static int singleNumber_OP(int[] arr) {
        int xor = 0;
        for(int i = 0; i<arr.length;i++){
            xor = xor^arr[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        int[] arr = {4, 1, 2, 1, 2};
        System.out.println("Example 1: " + singleNumber_BF(arr)); // Output: 1
        System.out.println("Example 2: " + singleNumber_OP(arr)); // Output: 4
    }
}


/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.



Example 1:

Input: nums = [2,2,1]
Output: 1

Example 2:

Input: nums = [4,1,2,1,2]
Output: 4

Example 3:

Input: nums = [1]
Output: 1

*/