package Zoho.Round2.Binary;

public class BinaryAddition {
    public static void main(String[] args) {
        String a = "1010";
        String b = "11001";

        String result = addBinary(a, b);
        System.out.println("Binary Sum: " + result);
    }

    public static String addBinary(String a, String b) {
        StringBuilder sum = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry > 0) {
            int bitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0;
            int bitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0;

            int total = bitA + bitB + carry;
            sum.insert(0, total % 2);
            carry = total / 2;

            i--;
            j--;
        }

        return sum.toString();
    }
}


/*
Given two binary numbers add the two
numbers in binary form without converting them
to decimal value.
eg) a = 1010 b = 11001
o/p 100011
 */