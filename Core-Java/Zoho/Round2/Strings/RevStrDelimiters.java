package Zoho.Round2.Strings;

import java.util.Scanner;

public class RevStrDelimiters {

    public static String reverseStr(String str) {
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

    public static void main(String[] args) {
        String str = "A man, in the boat says : I see 1-2-3 in the sky";
        reverseStr(str);
        // System.out.println(new String(str));
        System.out.println(reverseStr(str)); // for return types
    }
}
