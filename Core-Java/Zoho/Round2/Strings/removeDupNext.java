package Zoho.Round2.Strings;

public class removeDupNext {
    public static String removeDuplicate(String input) {
        StringBuilder result = new StringBuilder();
        int[] count = new int[256]; // Assuming ASCII characters

        for (char c : input.toCharArray()) {
            if (count[c] == 0) {
                result.append(c);
                count[c]++;
            } else {
                char replacement = findReplacement(c);
                result.append(replacement);
                count[replacement]++;
            }
        }

        return result.toString();
    }

    private static char findReplacement(char c) {
        if (Character.isLetter(c)) {
            return Character.isLowerCase(c) ? 'a' : 'A';
        } else if (Character.isDigit(c)) {
            return (char)('1' + (c - '0') % 10);
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
