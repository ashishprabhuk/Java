package Zoho.Round2.Strings;

public class ReverseStrDelimiters {

    public static String reverseStr_OP(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            // Find the next non-alphabet character from the start
            while (start < end && !Character.isLetterOrDigit(chars[start])) {
                start++;
            }

            // Find the next non-alphabet character from the end
            while (start < end && !Character.isLetterOrDigit(chars[end])) {
                end--;
            }

            // Swap the characters at start and end positions
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;

            // Move to the next positions
            start++;
            end--;
        }
        return new String(chars);
    }

//-----------------------------------------------------------------

    static String reverseStr_BF(String str) {
        StringBuilder letters = new StringBuilder();
        StringBuilder nonLetters = new StringBuilder();
        
        // Separate letters and non-letters
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                letters.append(ch);
            } else {
                nonLetters.append(ch);
            }
        }

        // Reverse the letters
        String reversedLetters = reverse(letters.toString());

        // Reconstruct the string
        StringBuilder result = new StringBuilder();
        int j = 0;
        for (char ch : str.toCharArray()) {
            if (Character.isLetterOrDigit(ch)) {
                result.append(reversedLetters.charAt(j++));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

//---------------------------------------------------------------------

    static String reverse(String s) {
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "A man, in the boat says : I see 1-2-3 in the sky";
        System.out.println(reverseStr_OP(str));
    }
}
