package Zoho.Round2.Maths;

public class NumberToAlphabet {
    public static void main(String[] args) {
        int n1 = 1;
        int n2 = 26;
        int n3 = 28;
        int n4 = 30;
        int n5 = 1000;

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
            int remainder = (n - 1) % 26;

            // Convert the remainder to the corresponding alphabet character
            char alphabetChar = (char) ('A' + remainder);

            // Append the character to the result
            result.insert(0, alphabetChar);

            // Reduce n by (remainder + 1) and divide by 26
            n = (n - remainder - 1) / 26;
        }

        return result.toString();
    }
}
