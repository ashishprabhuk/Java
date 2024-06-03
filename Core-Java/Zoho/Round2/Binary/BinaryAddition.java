package Zoho.Round2.Binary;

public class BinaryAddition {
    public static void main(String[] args) {
        String a = "11";
        String b = "1";

        // String result = addBinary_OP1(a, b);
        String result = addBinary_OP2(a, b);
        System.out.println("Binary Sum: " + result);
    }

    public static String addBinary_OP1(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            int sum = bitA + bitB + carry;
            sb.insert(0, sum % 2);
            carry = sum / 2;

            i--;
            j--;
        }

        return sb.toString();
    }

    public static String addBinary_OP2(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? a.charAt(i--) - '0' : 0;
            int digitB = (j >= 0) ? b.charAt(j--) - '0' : 0;

            int sum = digitA + digitB + carry;
            result.append(sum % 2);
            carry = sum / 2;
        }
        return result.reverse().toString();
    }
}


/*
Given two binary numbers add the two
numbers in binary form without converting them
to decimal value. (ZOHO)

Given two binary strings a and b, return their sum as a binary string.

Example 1:
Input: a = "11", b = "1"
Output: "100"
011
001
---
100

Example 2:
Input: a = "1010", b = "1011"
Output: "10101"

Example 3:

Input: a = "1010" , b = "11001"
Output: 100011
*/