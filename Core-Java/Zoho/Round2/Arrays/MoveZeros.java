package Zoho.Round2.Arrays;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        moveZeros_BF(arr);
        moveZeroes(arr);
        moveZeroes1(arr);
        int[] arrZero = moveZeros_OP(arr);
        System.out.println(Arrays.toString(arrZero));
    }


    private static void moveZeros_BF(int[] arr) {
        List<Integer > temp = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp.add(arr[i]);
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            arr[i] = temp.get(i);
        }
        for (int i = temp.size(); i < arr.length; i++) {
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] moveZeros_OP(int[] arr) {
        int n = arr.length;
        int j = -1; //place the pointer j:
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }
        //no non-zero elements:
        if (j == -1) return arr;

        //Move the pointers i and j and swap accordingly:
        for (int i = j + 1; i < n; i++) {
            if (arr[i] != 0) { //swap arr[i] & arr[j]:
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                j++;
            }
        }
        return arr;
    }

    public static void moveZeroes(int[] arr) {
        int nonZeroIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                if (i != nonZeroIndex) { 
                    int temp = arr[nonZeroIndex];
                    arr[nonZeroIndex] = arr[i];
                    arr[i] = temp;
                }
                nonZeroIndex++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroes1(int[] nums) {
        int i = 0;
        for (int num : nums){
            if (num != 0){
                nums[i] = num;
                i++;
            }
        }
        while (i <= nums.length - 1){
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));
    }
}
