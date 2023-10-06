package Zoho.Round2.Maths;

public class NumberToAlphabet {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 26;
        int n3 = 28;
        int n4 = 676;
        int n5 = 705;

        System.out.println(convertToAlphabet(n1));
        System.out.println(convertToAlphabet(n2));
        System.out.println(convertToAlphabet(n3));
        System.out.println(convertToAlphabet(n4));
        System.out.println(convertToAlphabet(n5));
    }

    public static String convertToAlphabet(int n) {
        StringBuilder result = new StringBuilder();

        while (n > 0) {
            // Calculate the remainder when dividing by 26
            int rem = (n - 1) % 26;
            // Convert the rem to the corresponding alphabet character
            char alphabetChar = (char) ('A' + rem);
            // Append the character to the result
            result.insert(0, alphabetChar);
            // Reduce n by (rem + 1) and divide by 26
            n = (n - 1) / 26;
        }
        return result.toString();
    }
}

/*
Given a number, convert it into corresponding
alphabet.
Input Output
1 A
26 Z
27 AA
676 ZZZ
 */