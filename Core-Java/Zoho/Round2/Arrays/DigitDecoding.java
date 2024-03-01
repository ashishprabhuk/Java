package Zoho.Round2.Arrays;

public class DigitDecoding {
    public static void main(String[] args) {
        String digits = "1234";
        int count = countDecodings(digits);
        System.out.println("Number of possible decodings: " + count);
    }

    public static int countDecodings(String digits) {
        if (digits.length() == 0 || digits.charAt(0) == '0') {
            return 0;
        }

        int n = digits.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            int oneDigit = digits.charAt(i - 1) - '0';
            int twoDigits = (digits.charAt(i - 2) - '0') * 10 + oneDigit;

            if (oneDigit >= 1 && oneDigit <= 9) {
                dp[i] += dp[i - 1];
            }
            if (twoDigits >= 10 && twoDigits <= 26) {
                dp[i] += dp[i - 2];
            }
        }
        return dp[n];
    }
}


/*
Let 1 represent ‘A’, 2 represents ‘B’, etc. Given a
digit sequence, count the number of possible
decodings of the given digit sequence.
Examples:
Input: digits[] = “121”
Output: 3 // The possible decodings are “ABA”,
“AU”, “LA”
Input: digits[] = “1234” Output: 3
-> The possible decodings are “ABCD”, “LCD”, “AWD”
*/