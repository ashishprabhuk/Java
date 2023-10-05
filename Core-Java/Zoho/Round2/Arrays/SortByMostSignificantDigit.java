package Zoho.Round2.Arrays;

import java.util.*;

public class SortByMostSignificantDigit {
    public static void main(String[] args) {
        int[] numbers = { 100, 1, 11, 21, 2, 3 };
        sortByMostSignificantDigit(numbers);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortByMostSignificantDigit(int[] numbers) {
        Arrays.sort(numbers);
        // Create a list of Integer objects to store the numbers
        List<Integer> numberList = new ArrayList<>();
        for (int num : numbers) {
            numberList.add(num);
        }

        // Sort the list using a custom comparator based on the most significant digit
        Collections.sort(numberList, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int msd1 = getMostSignificantDigit(num1);
                int msd2 = getMostSignificantDigit(num2);
                return Integer.compare(msd1, msd2);
            }
        });

        // Copy the sorted numbers back to the original array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numberList.get(i);
        }
    }

    public static int getMostSignificantDigit(int number) {
        while (number >= 10) {
            number /= 10;
        }
        return number;
    }
}


/*
to sort numbers based on
digits starting from most significant numbers. Eg:
input-100 1 11 21 2 3. Output-1 100 11 2 21 3
 */