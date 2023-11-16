package Zoho.Round2.Strings;

public class ExcelColumnNumber {
    public static int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            char c = columnTitle.charAt(i);
            result = result * 26 + (c - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(titleToNumber("A"));   // Output: 1
        System.out.println(titleToNumber("AB"));  // Output: 28
        System.out.println(titleToNumber("ZY"));  // Output: 701
    }
}
/*
Excel Sheet Column Number

Given a string columnTitle that represents the column title as appears in an Excel sheet, return its corresponding column number.

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
Input: columnTitle = "A"
Output: 1

Example 2:
Input: columnTitle = "AB"
Output: 28

Example 3:
Input: columnTitle = "ZY"
Output: 701
*/