package Zoho.Round2.Maths;

public class RemoveZeroesSum {
    public static void main(String[] args) {
        int a = 101, b = 102; // Yes => 101 + 102 = 203 == 11 + 12 = 23
        // int a = 105, b = 108; // No => 105 + 108 = 213 != 15 + 18 = 33

        // Check if the sums after removing zeroes from 'a' and 'b' are equal
        if (isEqual(a, b)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // Function to check if the sums after removing zeroes are equal
    public static boolean isEqual(int a, int b) {
        // Calculate the sums after removing zeroes
        int sum1 = removeZeroes(a) + removeZeroes(b);
        int sum2 = removeZeroes(a + b);

        // Check if the sums are equal
        return sum1 == sum2;
    }

    // Function to remove zeroes from a number
    public static int removeZeroes(int num) {
        int result = 0;
        int multiplier = 1;

        while (num > 0) {
            int digit = num % 10;

            // If the digit is not zero, add it to the result
            if (digit != 0) {
                result += digit * multiplier;
                multiplier *= 10;
            }

            // Move to the next digit
            num /= 10;
        }

        return result;
    }
}
