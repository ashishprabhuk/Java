package Zoho.Round2.Maths;

public class SumOfSquares {
    public static void main(String[] args) {
        int n = 12;
        int minCount = getMinCount(n);
        System.out.println("Output: min: " + minCount);
    }

    public static int getMinCount(int n) {
        if (n <= 3) {
            return n; // For n = 1, 2, 3, return n itself
        }

        int minCount = n; // Initialize minCount with n as the worst case

        // Try every square number less than or equal to n
        for (int i = 1; i * i <= n; i++) {
            int temp = 1 + getMinCount(n - i * i); // Recursively find the count for n - x^2
            minCount = Math.min(minCount, temp);
        }

        return minCount;
    }
}


/*
 * Find the minimum number of times required to
 * represent a number as sum of squares.
 * 12 = 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2
 * 12 = 2^2 + 2^2 + 2^2
 * 12 = 3^2 + 1^2 + 1^2 + 1^2
 * Input: 12
 * Output: min: 3
 */