package Zoho.Round2.Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxKDigitNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();

        int[] arr = new int[size];

        System.out.print("Enter the elements: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.print("Enter the number of digits: ");
        int k = scanner.nextInt();

        int maxKDigitNumber = findMaxKDigitNumber(arr, k);

        System.out.println("Output:");
        System.out.println(maxKDigitNumber);
    }

    public static int findMaxKDigitNumber(int[] arr, int k) {
        Arrays.sort(arr);

        int maxKDigitNumber = 0;
        int count = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            int numDigits = countDigits(num);

            if (numDigits <= k) {
                maxKDigitNumber = maxKDigitNumber * (int) Math.pow(10, numDigits) + num;
                k -= numDigits;
                count++;
            }

            if (count == k) {
                break;
            }
        }

        return maxKDigitNumber;
    }

    public static int countDigits(int num) {
        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num != 0) {
            num /= 10;
            count++;
        }

        return count;
    }
}