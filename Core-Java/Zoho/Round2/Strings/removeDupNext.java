package Zoho.Round2.Strings;

public class removeDupNext {
    public static String removeDuplicate(String input) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[256]; // Assuming ASCII characters

        for (char c : input.toCharArray()) {
            if (count[Character.toLowerCase(c)] == 0 && count[Character.toUpperCase(c)] == 0) {
                result.append(c);
                count[Character.toLowerCase(c)]++;
                count[Character.toUpperCase(c)]++;
            } else {
                char replacement = getNextChar(c, count);
                result.append(replacement);
                count[Character.toLowerCase(replacement)]++;
                count[Character.toUpperCase(replacement)]++;
            }
        }
        return result.toString();
    }

    private static char getNextChar(char c, int[] count) {
        if (Character.isLetter(c)) {
            char nextChar = c;
            do {
                nextChar = (char) ((nextChar == 'z' || nextChar == 'Z') ? nextChar - 25 : nextChar + 1);
            } while (count[Character.toLowerCase(nextChar)] > 0 || count[Character.toUpperCase(nextChar)] > 0);
            return nextChar;
        } else if (Character.isDigit(c)) {
            char nextChar = (char) ('0' + (c - '0' + 1) % 10);
            while (count[nextChar] > 0) {
                nextChar = (char) ('0' + (nextChar - '0' + 1) % 10);
            }
            return nextChar;
        } else {
            return c; // For non-letter and non-digit characters, keep them unchanged
        }
    }

    public static void main(String[] args) {
        String input1 = "Java1234";
        String input2 = "Python1223";
        String input3 = "aBuzZ9900";

        System.out.println("Testcase 1: " + removeDuplicate(input1)); // Output: Javb1234
        System.out.println("Testcase 2: " + removeDuplicate(input2)); // Output: Python1234
        System.out.println("Testcase 3: " + removeDuplicate(input3)); // Output: aBuzC9012
    }
}
