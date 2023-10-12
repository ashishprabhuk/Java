package Zoho.Round2.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FiboNumbers {
    public static void main(String[] args) {
        int[] inputArray = {2, 10, 4, 8};
        List<Integer> fibonacciNumbers = findFibonacciNumbers(inputArray);

        System.out.print("Input: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }

        System.out.print("\nOutput: ");
        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> findFibonacciNumbers(int[] inputArray) {
        int maxInput = 0;
        for (int num : inputArray) {
            if (num > maxInput) {
                maxInput = num;
            }
        }

        List<Integer> fibonacciNumbers = generateFibonacciNumbers(maxInput);
        List<Integer> result = new ArrayList<>();

        for (int num : inputArray) {
            if (fibonacciNumbers.contains(num)) {
                result.add(num);
            }
        }

        return result;
    }

    static List<Integer> generateFibonacciNumbers(int max) {
        List<Integer> fibonacciNumbers = new ArrayList<>();
        int a = 0, b = 1, c = 1;

        while (c <= max) {
            fibonacciNumbers.add(c);
            a = b;
            b = c;
            c = a + b;
        }
        return fibonacciNumbers;
    }
}
