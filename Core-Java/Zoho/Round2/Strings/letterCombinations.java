package Zoho.Round2.Strings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class letterCombinations {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return result;
        }

        // Create a mapping of digits to their corresponding letters on a phone keypad
        Map<Character, String> digitToLetters = new HashMap<>();
        digitToLetters.put('2', "abc");
        digitToLetters.put('3', "def");
        digitToLetters.put('4', "ghi");
        digitToLetters.put('5', "jkl");
        digitToLetters.put('6', "mno");
        digitToLetters.put('7', "pqrs");
        digitToLetters.put('8', "tuv");
        digitToLetters.put('9', "wxyz");

        // Initialize a StringBuilder to build the current combination
        StringBuilder currentCombination = new StringBuilder();

        // Start DFS/backtracking
        generateCombinations(digits, 0, digitToLetters, currentCombination, result);

        return result;
    }

    private void generateCombinations(String digits, int index, Map<Character, String> digitToLetters,
                                    StringBuilder currentCombination, List<String> result) {
        // If we have built a combination of the same length as digits, add it to the result
        if (index == digits.length()) {
            result.add(currentCombination.toString());
            return;
        }

        char digit = digits.charAt(index);
        String letters = digitToLetters.get(digit);

        // Iterate through the letters for the current digit
        for (int i = 0; i < letters.length(); i++) {
            // Append the current letter to the current combination
            currentCombination.append(letters.charAt(i));

            // Recursively generate combinations for the remaining digits
            generateCombinations(digits, index + 1, digitToLetters, currentCombination, result);

            // Backtrack by removing the last character
            currentCombination.deleteCharAt(currentCombination.length() - 1);
        }
    }

    public static void main(String[] args) {
        letterCombinations lc = new letterCombinations();
        String digits = "23"; // Example input
        List<String> combinations = lc.letterCombinations(digits);

        for (String combination : combinations) {
            System.out.println(combination);
        }
    }
}
