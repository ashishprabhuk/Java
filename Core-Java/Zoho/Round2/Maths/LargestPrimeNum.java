package Zoho.Round2.Maths;
public class LargestPrimeNum {

    public static void main(String[] args) {
        int input = 4691;

        // Convert the input number to a character array
        char[] digits = Integer.toString(input).toCharArray();

        // Find and print the largest prime permutation
        String largestPrime = findLargestPrime(digits, 0, digits.length - 1);

        if (largestPrime != null) {
            System.out.println("Largest Prime Permutation: " + largestPrime);
        } else {
            System.out.println("No prime permutation found.");
        }
    }

    // Recursive function to find the largest prime permutation
    public static String findLargestPrime(char[] digits, int start, int end) {
        // Base case: If we have processed all digits, check if it's prime
        if (start == end) {
            int num = Integer.parseInt(new String(digits));
            if (isPrime(num)) {
                return new String(digits);
            } else {
                return null;
            }
        }
        //new String(digits):  it converts the array of characters into a string representation.
        //Integer.parseInt(...):Convert a String to an Integer.returns the string as a primitive type int

        String largestPrime = null;
        // Try all possible permutations by swapping digits
        for (int i = start; i <= end; i++) {
            swap(digits, start, i);
            String permutation = findLargestPrime(digits, start + 1, end); 
            if (permutation != null && (largestPrime == null || permutation.compareTo(largestPrime) > 0)) {
                largestPrime = permutation;
            }
            swap(digits, start, i); // Backtrack to restore the original order
        }
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

    // Function to swap two elements in an array
    public static void swap(char[] array, int i, int j) {
        char temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}


/*
findLargestPrime is a recursive function that takes three arguments: digits (an array of characters representing the number), start (the index of the current digit being considered), and end (the index of the last digit in the array).

The base case of the recursion is when start equals end, which means we have processed all the digits. In this case, it converts the array of digits back to an integer (num) and checks if num is a prime number using the isPrime function.

If num is prime, it returns the array of digits as a string, indicating that this is a valid prime permutation. Otherwise, it returns null to indicate that this permutation is not prime.

If we haven't reached the base case, the code iterates through all possible permutations of the digits by swapping the current digit with each digit to its right. It then recursively calls findLargestPrime with the updated digits array.

It keeps track of the largest prime permutation found (largestPrime) and updates it whenever a new prime permutation is discovered that is larger than the previously found one.

After trying all permutations, the function returns the largestPrime found during the process.

Finally, there are two utility functions:

isPrime(int num): This function checks if an integer num is prime.
swap(char[] array, int i, int j): This function swaps two elements in the character array array at positions i and j.
 */