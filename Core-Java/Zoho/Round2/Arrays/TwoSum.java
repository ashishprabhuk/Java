package Zoho.Round2.Arrays;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] array = { 1, 3, 4, 8, 10 };
        int target = 7;
        System.out.println(hasPairWithSum(array, target));
    }

    public static boolean hasPairWithSum(int[] array, int target) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int sum = array[start] + array[end];
            if (sum == target) {
                return true;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }

        return false;
    }

    public int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i <arr.length;i++){
            int rem = target - arr[i];
            if(map.containsKey(rem)){
                return new int[]{map.get(rem),i};
            }
            map.put(arr[i],i);
        }
        return new int[]{};
    }
}

/*
2.Given sorted array check if two numbers sum in it
is a given
value
Input
Array = {1 3 4 8 10 } N = 7
output
true
 */