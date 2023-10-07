package Zoho.Round2.Maths;

import java.util.Scanner;

public class MaxValueCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of integers
        int n = scanner.nextInt();

        // Read the array of integers
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Calculate and print the maximum value for each integer
        for (int i = 0; i < n; i++) {
            int num = arr[i];

            // Calculate the sum of digits
            int sumOfDigits = calculateSumOfDigits(num);

            // Calculate the product of digits
            int productOfDigits = calculateProductOfDigits(num);

            // Choose the maximum value between sum and product
            int max = Math.max(sumOfDigits, productOfDigits);

            System.out.print(max + " ");
        }
    }

    static int calculateSumOfDigits(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    static int calculateProductOfDigits(int num) {
        int product = 1;
        while (num > 0) {
            product *= num % 10;
            num /= 10;
        }
        return product;
    }
}
