package Accenture;

public class AutoBiographicalNum {

    public static int FindAutoCount(String n) {
        // Check if the input string is null
        if (n == null) {
            return 0;
        }

        // Initialize an array to store the count of each digit
        int[] digitCount = new int[10];

        // Iterate through the characters in the input string and count the occurrences of each digit
        for (char c : n.toCharArray()) {
            int digit = Character.getNumericValue(c);
            digitCount[digit]++;
        }

        // Iterate through the input string and check autobiographical property
        for (int i = 0; i < n.length(); i++) {
            if (digitCount[i] != Character.getNumericValue(n.charAt(i))) {
                // The number is not autobiographical
                return 0;
            }
        }

        // Count the number of unique digits in the input string
        int uniqueCount = 0;
        for (int count : digitCount) {
            if (count > 0) {
                uniqueCount++;
            }
        }

        return uniqueCount;
    }

    public static void main(String[] args) {
        // Example usage:
        String input = "0112";
        int result = FindAutoCount(input);
        System.out.println(result);  // Output: 3
    }
}
