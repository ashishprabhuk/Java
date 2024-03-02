package Zoho.Round2.Arrays;

import java.util.Arrays;

public class ModifyRearrange {
    public static void main(String[] args) {
        int[] arr1 = {2, 2, 0, 4, 0, 8};
        int[] arr2 = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8};

        modifyAndRearrange(arr1);
        System.out.println(Arrays.toString(arr1));
        modifyAndRearrange(arr2);
        System.out.println(Arrays.toString(arr2));
    }

    static void modifyAndRearrange(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        while (j < n) {
            arr[j++] = 0;
        }
    }
}

/*
. Given an array of integers of size n. Convert the
array in such a way that if next valid number is
same as current number, double its value and
replace the next number with 0. After the
modification, rearrange the array such that all 0’s
are shifted to the end.
Input : arr[] = {2, 2, 0, 4, 0, 8}
Output : 4 4 8 0 0 0
Input : arr[] = {0, 2, 2, 2, 0, 6, 6, 0, 0, 8}
Output : 4 2 12 8 0 0 0 0 0 0

 */