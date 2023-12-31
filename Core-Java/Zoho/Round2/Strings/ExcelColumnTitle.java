package Zoho.Round2.Strings;

public class ExcelColumnTitle {

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            // columnNumber--;  // Adjust to 0-based indexing
            char currentChar = (char) ('A' + (columnNumber-1) % 26);
            result.insert(0, currentChar);  // Insert character at the beginning of the result string
            columnNumber /= 26;
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(convertToTitle(1));    // Output: "A"
        System.out.println(convertToTitle(28));   // Output: "AB"
        System.out.println(convertToTitle(701));  // Output: "ZY"
    }
}

/*
Excel Sheet Column Title

Given an integer columnNumber, return its corresponding column title as it appears in an Excel sheet.

For example:

A -> 1
B -> 2
C -> 3
...
Z -> 26
AA -> 27
AB -> 28 
...

Example 1:
Input: columnNumber = 1
Output: "A"

Example 2:
Input: columnNumber = 28
Output: "AB"

Example 3:
Input: columnNumber = 701
Output: "ZY"
*/