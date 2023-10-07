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

        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != 0 && arr[i] == arr[i + 1]) {
                // Double the value and set the next number to 0
                arr[i] *= 2;
                arr[i + 1] = 0;
            }
        }

        // Move all the zeros to the end of the array
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
        while (index < n) {
            arr[index++] = 0;
        }
    }
}
