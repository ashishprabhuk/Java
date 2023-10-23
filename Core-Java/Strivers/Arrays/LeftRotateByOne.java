package Strivers.Arrays;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7}; // {2,3,4,5,6,7,1}
        rotateLeft_BF(arr);
        rotateLeft_OP(arr);
    }

    static void rotateLeft_BF(int[] arr) {
        int[] temp = new int[arr.length];
        for (int i = 1; i < arr.length; i++) {
            temp[i-1] = arr[i];
        }
        temp[arr.length-1] = arr[0];
        System.out.println(Arrays.toString(temp));
    }

    static void rotateLeft_OP(int[] arr) {
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }

}
