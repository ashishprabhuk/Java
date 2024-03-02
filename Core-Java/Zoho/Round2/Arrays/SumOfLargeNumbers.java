package Zoho.Round2.Arrays;
import java.util.*;

public class SumOfLargeNumbers {
    public static void main(String[] args) {
        int[] arr1 = {9, 2, 8, 1, 3, 5, 6, 7, 3, 1, 1, 6};
        int[] arr2 = {7, 8, 4, 6, 2, 1, 9, 9, 7};
        System.out.println(calculateSum(arr1, arr2));
    }

    public static String calculateSum(int[] arr1, int[] arr2) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = arr1.length - 1;
        int j = arr2.length - 1;
        
        while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = i >= 0 ? arr1[i--] : 0;
            int digit2 = j >= 0 ? arr2[j--] : 0;
            int total = digit1 + digit2 + carry;
            sum.insert(0, total % 10);
            carry = total / 10;
        }
        return sum.toString();
    }
}


/*
Adding 2 numbers
GIven 2 huge numbers as separate digits, store
them in array
and process them and calculate the sum of 2
numbers and store
the result in an array and print the sum.
Input:
Number of digits:12
9 2 8 1 3 5 6 7 3 1 1 6
Number of digits:9
7 8 4 6 2 1 9 9 7
Output :
9 2 8 9 2 0 2 9 5 1 1 3
 */