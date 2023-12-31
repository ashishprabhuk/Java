package Zoho.Round2.Maths;

public class PrimeSum {
    public static void main(String[] args) {
        int num = 13; // true => 31 + 3 = 34
        // int num = 23; //false
        System.out.println(sumOfPrimes(num));
    }

    public static boolean sumOfPrimes(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (isPrime(i) && isPrime(num - i)) {
                System.out.println(num + " = " + i + " + " + (num - i));
                return true;
            }
        }
        return false;
    }

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
}

/*
Question 1 : Write a program to determine
whether a given number can be expressed as sum
of two prime numbers or not.
For example 34 can be expressed as sum of two
prime numbers but 23 cannot be.
 */