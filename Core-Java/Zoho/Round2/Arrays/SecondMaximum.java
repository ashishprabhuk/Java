package Zoho.Round2.Arrays;

import java.util.Scanner;

public class SecondMaximum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Size of Array: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < size; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }

        if (secondMax == Integer.MIN_VALUE) {
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
