package Zoho.Round2.Strings;

public class ExpandString {
    public static void main(String[] args) {
        String input1 = "b3c6d15";
        String input2 = "a2b1c4d3";
        String c = "9";
        int ch = c.charAt(0) - '0'; // Character to Number 
        System.out.println("number: " + ch);

        System.out.println(expandString(input1));
        System.out.println(expandString1(input2));
    }
    
    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < input.length()) {
            char ch = input.charAt(i);
            i++;
            // Check if the next character(s) represent a number
            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0'); // convert character to respective integer
                i++;
            }
            // Append the character 'count' times
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static String expandString1(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // Check if the next character(s) represent a number
            int count = 0;
            while (i + 1 < input.length() && Character.isDigit(input.charAt(i + 1))) {
                count = count * 10 + Character.getNumericValue(input.charAt(i + 1));
                i++;
            }

            // Append the character 'count' times
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        return result.toString();
    }
}

/*
Write a program to give the following output for
the given input
Eg 1: Input: a1b10
Output: abbbbbbbbbb
Eg: 2: Input: b3c6d15
Output: bbbccccccddddddddddddddd
The number varies from 1 to 99.
 */