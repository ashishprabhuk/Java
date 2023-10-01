package Zoho.Round2;

public class MagicNumber {
    public static void main(String[] args) {
        int number = 153; // Change this to the number you want to check

        if (isMagicNumber(number)) {
            System.out.println(number + " is a magic number.");
        } else {
            System.out.println(number + " is not a magic number.");
        }
    }

    public static boolean isMagicNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += digit * digit * digit; // Cube the digit and add to the sum
            number /= 10;
        }

        return sum == originalNumber;
    }
}
