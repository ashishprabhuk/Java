package Strivers.Arrays;

import java.util.Arrays;

public class Large2ndSmall2nd {
    public static void main(String[] args) {
        int[] arr = {7,7,2,4,5,1};
        SecondLargestOP(arr);
    }

    private static int[] SecondLargestBF(int[] arr) {
        int[] items = new int[2];
        Arrays.sort(arr);
        items[0] = arr[arr.length-2];
        items[1] = arr[1];
        return items;
    }
    
    private static void SecondLargestOP(int[] arr){
        Arrays.sort(arr);
        if(arr.length <=1){
            System.out.println("-1");
        }else{
            int n=arr[0];
            for(int i = 1; i < arr.length; i++){
                if(arr[i] > arr[i+1] && arr[i] < arr[i-1]){
                    n = arr[i];
                }
            }
            System.out.println(n);
        }
    }
}
