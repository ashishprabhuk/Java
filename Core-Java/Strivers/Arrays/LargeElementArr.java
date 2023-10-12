package Strivers.Arrays;

import java.util.Arrays;

public class LargeElementArr {
    public static void main(String[] args) {
        int[] arr = {21,43,9,5,1};
        System.out.println(LargeElementBF(arr));
        System.out.println(LargeElementOP(arr));
    }

    private static int LargeElementBF(int[] arr) { // brute force
        Arrays.sort(arr);
        int n = arr.length;
        return arr[n-1];
    }

    static int LargeElementOP(int[] arr) { // optimized solution
        int max = arr[0];
        for(int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}
