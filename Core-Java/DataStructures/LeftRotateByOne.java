package DataStructures;

import java.util.Arrays;

public class LeftRotateByOne {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rotateByOne_BF(arr);
        rotateByOne_OP(arr);
    }

    static void rotateByOne_BF(int[] arr){
        int i = 0;
        int[] temp = new int[arr.length];
        for(int j = 1; j < temp.length; j++){
            temp[i] = arr[j];
            i++;
        }
        temp[temp.length-1] = arr[0];
        System.out.println(Arrays.toString(temp));
    }
    
    static void rotateByOne_OP(int[] arr){
        int temp = arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[arr.length-1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
