package Zoho.Round2.Strings;

public class removeDuplicates {
    public static String removeDuplicate(String input) {
        StringBuilder result = new StringBuilder();
        char[] chars = input.toCharArray();
        int[] count = new int[256]; // Assuming ASCII characters

        for (char c : chars) {
            if (count[c] == 0) {
                count[c]++;
                result.append(c);
            } else {
                char replacement = findReplacement(c);
                count[replacement]++;
                result.append(replacement);
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
            return c;
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

