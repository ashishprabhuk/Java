package Zoho.Round2.Arrays;
import java.util.*;

public class SumOfLargeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first number
        System.out.print("Enter the size of arr - 1: ");
        int n1 = scanner.nextInt();
        int[] num1 = new int[n1];
        System.out.print("Enter elements of num1: ");
        for (int i = 0; i < n1; i++) {
            num1[i] = scanner.nextInt();
        }
        
        // Read the second number
        System.out.print("Enter the size of arr - 1: ");
        int n2 = scanner.nextInt();
        int[] num2 = new int[n2];
        System.out.print("Enter elements of num2: ");
        for (int i = 0; i < n2; i++) {
            num2[i] = scanner.nextInt();
        }

        // Calculate the sum
        List<Integer> result = calculateSum(num1, num2);

        // Print the result
        for (int num : result) {
            System.out.print(num + " ");
        }

        scanner.close();
    }

    public static List<Integer> calculateSum(int[] num1, int[] num2) {
        int n1 = num1.length;
        int n2 = num2.length;
        int n = Math.max(n1, n2);

        // Initialize the result array
        List<Integer> result = new ArrayList<>(Collections.nCopies(n + 1, 0)); //return a list containing n + 1 elements, and all elements will be 0

        // Calculate the sum digit by digit from right to left
        int carry = 0;
        for (int i = 0; i < n; i++) {
            int digit1 = i < n1 ? num1[n1 - 1 - i] : 0;
            int digit2 = i < n2 ? num2[n2 - 1 - i] : 0;
            int sum = digit1 + digit2 + carry;
            result.set(n - i, sum % 10); 
            carry = sum / 10;
        }
        result.set(0, carry);
        //set(int index, E element) that allows you to replace the element at a specified index in the ArrayList with a new element of type E.

        // Remove the leading zero if there is no carry
        if (carry == 0) {
            result.remove(0);
        }

        return result;
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