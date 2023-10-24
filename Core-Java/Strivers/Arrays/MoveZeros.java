package Strivers.Arrays;

import java.util.*;

public class MoveZeros {
    public static void main(String[] args) {
        int[] arr = {1 ,0 ,2 ,3 ,0 ,4 ,0 ,1};
        sortArr(arr);
    }

    private static void sortArr(int[] arr) {
        List<Integer > temp1 = new ArrayList<>();
        List<Integer > temp2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 0)) {
                temp1.add(arr[i]);
            } else {
                temp2.add(arr[i]);
            }
        }
        for (int i = 0; i <= arr.length; i++) {
            if(temp1.get(i) > 0){
                arr[i] = temp1.get(i);
            }else{
                arr[i] = temp2.get(i);
            }
        }
        System.out.println(temp1);
        System.out.println(temp2);
        System.out.println(Arrays.toString(arr));
    }

}
