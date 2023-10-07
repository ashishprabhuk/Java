package Zoho.Round2.Maths;
import java.util.Scanner;

public class TwistedPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input number
        int number = scanner.nextInt();

        // Check if the number is a twisted prime
        if (isTwistedPrime(number)) {
            System.out.println("Twisted Prime Number");
        } else {
            System.out.println("Not a Twisted Prime Number");
        }
    }

    // Function to check if a number is prime
    static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to reverse a number
    static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }

    // Function to check if a number is a twisted prime
    static boolean isTwistedPrime(int num) {
        if (isPrime(num)) {
            int reversed = reverseNumber(num);
            return isPrime(reversed);
        }
        return false;
    }
}
