package Zoho.Round2.Arrays;

import java.util.Arrays;

public class Large2ndSmall2nd {
    public static void main(String[] args) {
        int[] arr = {12,3,46,7,4,9,8};
        System.out.println("Optimized Solution");
        SecondLargeSmall(arr);

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
    
    static void SecondLargeSmall(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int secMin = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secMax = max;
                max = arr[i];
            } else if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }

            if (arr[i] < min) {
                secMin = min;
                min = arr[i];
            } else if (arr[i] < secMin && arr[i] != min) {
                secMin = arr[i];
            }
        }

        System.out.println("Maximum: " + max);
        System.out.println("Second Maximum: " + secMax);
        System.out.println("Minimum: " + min);
        System.out.println("Second Minimum: " + secMin);
    }
}
