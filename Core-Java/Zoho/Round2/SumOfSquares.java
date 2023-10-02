package Zoho.Round2;

public class SumOfSquares {
    public static void main(String[] args) {
        int n = 12;
        int minCount = getMinCount(n);
        System.out.println("Output: min: " + minCount);
    }

    public static int getMinCount(int n) {
        int[] dp = new int[n + 1];
        dp[0] = 0;

        for (int i = 1; i <= n; i++) {
            dp[i] = i; // Initialize dp[i] with the maximum possible value

            for (int j = 1; j * j <= i; j++) {
                dp[i] = Math.min(dp[i], 1 + dp[i - j * j]);
            }
        }

        return dp[n];
    }
}

/*
 * Find the minimum number of times required to
 * represent a number as sum of squares.
 * 12 = 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2 +
 * 1^2 + 1^2 + 1^2 + 1^2 + 1^2 + 1^2
 * 12 = 2^2 + 2^2 + 2^2
 * 12 = 3^2 + 1^2 + 1^2
 * Input: 12
 * Output: min: 3
 */