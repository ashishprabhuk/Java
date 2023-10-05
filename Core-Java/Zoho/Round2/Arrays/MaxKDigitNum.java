package Zoho.Round2.Arrays;
import java.util.Scanner;
import java.util.Arrays;

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

        System.out.print("Enter number of digits: ");
        int k = scanner.nextInt();

        String maxKDigitNumber = findMaxKDigitNumber(arr, k);

        System.out.println("OUTPUT:");
        System.out.println(maxKDigitNumber);
    }

    public static String findMaxKDigitNumber(int[] arr, int k) {
        // Sort the array in descending order
        Arrays.sort(arr);
        StringBuilder maxKDigitNumber = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            int num = arr[i];
            if (num < Math.pow(10, k)) {
                maxKDigitNumber.insert(0, num);
                k -= countDigits(num);
            }

            if (k == 0) {
                break;
            }
        }

        return maxKDigitNumber.toString();
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



/*
Given an array of numbers and a number k. Print
the maximum possible k digit number which can be
formed using given numbers.
INPUT :
Enter the array size : 4
Enter the elements : 1 4 973 97
Enter number of digits : 3
OUTPUT :
974
INPUT :
Enter the array size : 6
Enter the elements : 1 4 89 73 9 7
Enter number of digits : 5
OUTPUT :
98973
*/



