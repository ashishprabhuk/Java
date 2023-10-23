package Strivers.Arrays;

public class ExtraElement {
    public static void main(String[] args) {
        int[] arr1 = {3,7,8,6,4};
        int[] arr2 = {4,8,6,7};
        extraElement(arr1, arr2);
        int extra = findExtra(arr1, arr2);
        System.out.println("Extra:" + extra);
    }

    static void extraElement(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;
        // for (int i = 0; i < arr1.length; i++) {
        //     sum1 += arr1[i];
        // }
        // for (int i = 0; i < arr2.length; i++) {
        //     sum2 += arr2[i];
        // }
        for (int num : arr1) {
            sum1 += num;
        }
        for (int num : arr2) {
            sum2 += num;
        }
        System.out.println("Element: " + Math.abs(sum1 - sum2));
    }

    static int findExtra(int[] arr1, int[] arr2) {
        int result = 0;
        //The XOR(^) operation with the same number twice will result in 0, 
        //so it cancels out the common elements, leaving only the extra element.
        for (int num : arr1) { 
            result ^= num;
        }
        for (int num : arr2) {
            result ^= num;
        }
        return result;
    }
}
