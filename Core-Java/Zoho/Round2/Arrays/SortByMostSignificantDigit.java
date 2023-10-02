package Zoho.Round2.Arrays;

import java.util.*;

public class SortByMostSignificantDigit {
    public static void main(String[] args) {
        Integer[] numbers = { 100, 1, 11, 21, 2, 3 };
        sortByMostSignificantDigit(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortByMostSignificantDigit(Integer[] numbers) {
        // Create an array of the most significant digits
        int[] mostSignificantDigits = new int[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            mostSignificantDigits[i] = Integer.parseInt(Integer.toString(numbers[i]).substring(0, 1));
        }

        // Sort the original array based on the most significant digits
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (mostSignificantDigits[j] > mostSignificantDigits[j + 1]) {
                    // Swap numbers[j] and numbers[j+1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;

                    // Swap mostSignificantDigits[j] and mostSignificantDigits[j+1]
                    temp = mostSignificantDigits[j];
                    mostSignificantDigits[j] = mostSignificantDigits[j + 1];
                    mostSignificantDigits[j + 1] = temp;
                }
            }
        }
    }
}