package Zoho.Round2.Arrays;

import java.util.*;

public class RemoveDupInSortArr {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,4,4};
        int k = removeDuplicates_OP(arr);
        System.out.println("The array after removing duplicate elements is ");
        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    static int removeDuplicates_BF(int[] arr) { //pass by reference
        HashSet < Integer > set = new HashSet < > ();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        int k = set.size();
        int j = 0;
        for (int x: set) {
            arr[j++] = x;
        }
        return k;
    }

    static int removeDuplicates_OP(int[] arr) { //pass by reference
        int  i = 0;
        for (int j = 1; j < arr.length; j++) {
            if(arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }
        return ++i;
    }


}

