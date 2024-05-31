package Zoho.Round2.Arrays;
import java.util.*;

public class SortOddEven{
    public static void main(String[] args) {
        int[] input1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] input2 = {13, 2, 4, 15, 12, 10, 5};
        
        System.out.println("Input 1: " + Arrays.toString(input1));
        System.out.println("Output 1: " + Arrays.toString(sortOddEven(input1)));
        System.out.println("Input 1: " + Arrays.toString(input2));
        System.out.println("Output 1: " + Arrays.toString(sortEvenOdd(input2)));
    }
    
    static int[] sortOddEven(int[] arr) {
        int n = arr.length;
        // Sort odd positions in descending order
        for (int i = 0; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        // Sort even positions in ascending order
        for (int i = 1; i < n; i += 2) {
            for (int j = i + 2; j < n; j += 2) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    static int[] sortEvenOdd(int[] nums) {
        if(nums.length<3) return nums;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (i%2 == 0) 
                even.add(nums[i]);
                else 
                odd.add(nums[i]);
            }
        
        Collections.sort(odd);
        Collections.sort(even);
        Collections.reverse(even);
		
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++){
            if (i%2 == 0) 
                ans[i]=even.get(j++);
            else 
                ans[i]=odd.get(k++);
        }
        return ans;
    }
}

/*
 * class Solution {
    public int[] sortEvenOdd(int[] nums) {
        if(nums.length<3)
        return nums;
        List<Integer> odd=new ArrayList<>();
        List<Integer> even=new ArrayList<>();
        int ans[]=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if (i%2 == 0) 
                even.add(nums[i]);
                else 
                odd.add(nums[i]);
            }
        
        Collections.sort(even);
        Collections.sort(odd);
        Collections.reverse(odd);
		
        int j=0;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
             if (i%2 == 0) 
               ans[i]=even.get(j++);
             else 
               ans[i]=odd.get(k++);
        }
        return ans;
    }
}
 */


/*
Write a program to sort the elements in odd
positions in descending order and elements in
ascending order
Eg 1: Input: 13,2 4,15,12,10,5
Output: 13,2,12,10,5,15,4
Eg 2: Input: 1,2,3,4,5,6,7,8,9
Output: 9,2,7,4,5,6,3,8,1
 */