package Zoho;

import java.util.Scanner;

public class RevStrDelimiters {

    public static void reverseStr(char[] chars) {
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
        // return new String(chars);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = "A man, in the boat says : I see 1-2-3 in the sky";
        // String input = sc.nextLine();
        char[] chars = input.toCharArray();
        reverseStr(chars);
        System.out.println(new String(chars));
        // System.out.println(reverseStr(chars)); // for return types
        sc.close();
    }
}
