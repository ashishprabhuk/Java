package Zoho.Round2.Arrays;

import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {2, 5, 1, 6, 2, 6, 7, 10};

        int max = 0;
        int secondMax = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == 0) {
            System.out.println("No second maximum");
        } else {
            System.out.println("Second maximum: " + secondMax);
        }
    }
}

/*
Find the second maximum among the given numbers.

Ex. INPUT :
Size of Array : 8
Enter the elements : 2 5 1 6 2 6 7 10
OUTPUT : 7

Ex. INPUT :
Size of Array : 4
Enter the elements : 4 1 2 2
OUTPUT : 2

Ex. INPUT :
Size of Array : 1
Enter the elements : 1
OUTPUT : No second maximum
 */
