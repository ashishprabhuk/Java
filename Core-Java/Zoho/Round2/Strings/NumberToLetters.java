package Zoho.Round2.Strings;

public class NumberToLetters {
    private static final String[] LETTER_MAP = {
        "0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static void main(String[] args) {
        String input1 = "11112";
        String input2 = "163";

        System.out.println("Combinations for " + input1 + ":");
        generateCombinations(input1, "");

        System.out.println("\nCombinations for " + input2 + ":");
        generateCombinations(input2, "");
    }

    public static void generateCombinations(String digits, String current) {
        if (digits.isEmpty()) {
            System.out.println(current);
        } else {
            int num1 = Character.getNumericValue(digits.charAt(0));
            char letter1 = (char) ('A' + num1 - 1);
            generateCombinations(digits.substring(1), current + letter1);
            if (digits.length() >= 2) {
                int num2 = Integer.valueOf(digits.substring(0, 2));
                if (num2 >= 10 && num2 <= 26) {
                    char letter2 = (char) ('A' + num2 - 1);
                    generateCombinations(digits.substring(2), current + letter2);
                }
            }
        }
    }
}


/*
Given a string of integers find out all the
possible words that can made out of it in
continuous order. 
Eg: 11112
Ans: 
AAAAB
AKAB
AAKB
AAAL 
etc.
 */