package Zoho.Round2.Maths;
import java.util.Arrays;

public class LargestPrimeNum {
    public static void main(String[] args) {
        int input = 4691; // 9461
        // int input = 17; // 71
        // int input = 7571; // 7517
        int largestPrime = findLargestPrime(input);
        System.out.println("Largest Prime Permutation: " + largestPrime);
    }

    // Function to find the largest prime permutation of a given number
    public static int findLargestPrime(int n) {
        // Convert the number to an array of its digits
        char[] digits = Integer.toString(n).toCharArray();
        
        // Sort the digits in ascending order
        Arrays.sort(digits);

        int largestPrime = 0;

        // Generate permutations of the digits and check for primes
        do {
            // Convert the sorted digits back to an integer
            int num = Integer.parseInt(new String(digits));

            // Check if the current permutation is prime and larger than the largest found so far
            if (isPrime(num) && num > largestPrime) {
                largestPrime = num;
            }
        } while (nextPermutation(digits)); // Generate the next permutation

        return largestPrime;
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to generate the next lexicographically greater permutation of an array
    public static boolean nextPermutation(char[] array) {
        int i = array.length - 2;
        // Find the first index (i) where array[i] < array[i + 1]
        while (i >= 0 && array[i] >= array[i + 1]) {
            i--;
        }
        if (i < 0) {
            return false; // If no such index exists, it's the last permutation
        }
        int j = array.length - 1;
        // Find the smallest digit to the right of i that is greater than array[i]
        while (array[j] <= array[i]) {
            j--;
        }
        // Swap array[i] and array[j]
        swap(array, i, j);
        // Reverse the elements to the right of i
        reverse(array, i + 1);
        return true;
    }

    // Function to swap two elements in an array
    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Function to reverse elements in an array starting from the given index
    public static void reverse(char[] array, int start) {
        int end = array.length - 1;
        while (start < end) {
            swap(array, start, end);
            start++;
            end--;
        }
    }
}
