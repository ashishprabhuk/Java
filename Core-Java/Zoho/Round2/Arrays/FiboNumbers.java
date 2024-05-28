package Zoho.Round2.Arrays;

import java.util.ArrayList;
import java.util.List;

public class FiboNumbers {
    public static void main(String[] args) {
        int[] inputArray = {1,1,2,3,5,8,13,21,20};
        List<Integer> fibonacciNumbers = findFibonacciNumbers(inputArray);

        for (int num : fibonacciNumbers) {
            System.out.print(num + " ");
        }
    }

    static List<Integer> findFibonacciNumbers(int[] arr) {
        List<Integer> result = new ArrayList<>();
        /*
        Fibonacci no. if and only if the conditions are satisfied:
        -> 5n^2+4 is a perfect square
        -> 5n^2-4 is a perfect square 
        */
        for (int num : arr) {
            if (isPerfectSquare(5 * num * num + 4) || isPerfectSquare(5 * num * num - 4)) {
                result.add(num); // 5*1*1+4
            }
        }
        return result;
    }

    static boolean isPerfectSquare(int x) { 
        int sqrt = (int) Math.sqrt(x); // 
        return sqrt * sqrt == x;
    }
}
