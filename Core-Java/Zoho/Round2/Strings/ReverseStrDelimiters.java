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

    public static String reverseStr_OP2(String str) {
        char[] chars = str.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (start < end && !isLetterOrDigit(chars[start])) {
                start++;
            }
            while (start < end && !isLetterOrDigit(chars[end])) {
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }
    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    

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
        System.out.println(reverseStr_OP2(str));
    }
}
