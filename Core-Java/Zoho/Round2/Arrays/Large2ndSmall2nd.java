package Zoho.Round2.Arrays;

import java.util.Arrays;

public class Large2ndSmall2nd {
    public static void main(String[] args) {
        int[] arr = {12,3,46,7,4,9,8};
        System.out.println("Optimized Solution");
        System.out.println(SecondSmall(arr));
        System.out.println(SecondLarge(arr));

        int[] items = SecondLargestBF(arr);
        System.out.println("Brute force");
        for (int i : items) {
            System.out.println(i);
        }
    }

    private static int[] SecondLargestBF(int[] arr) {
        int[] items = new int[2];
        Arrays.sort(arr);
        items[0] = arr[1];
        items[1] = arr[arr.length-2];
        return items;
    }
    
    private static int SecondSmall(int[] arr){
        int small = Integer.MAX_VALUE;
        int secondSmall = Integer.MAX_VALUE;
        if(arr.length<2){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]<small){
                secondSmall = small;
                small = arr[i];
            }else if(arr[i]<secondSmall && arr[i] != small){
                secondSmall = arr[i];
            }
        }
        return secondSmall;
    }
    private static int SecondLarge(int[] arr){
        int large = Integer.MIN_VALUE;
        int secondLarge = Integer.MIN_VALUE;
        if(arr.length<2){
            return -1;
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i]>large){
                secondLarge = large;
                large = arr[i];
            }else if(arr[i]>secondLarge && arr[i] != large){
                secondLarge = arr[i];
            }
        }
        return secondLarge;
    }
}
