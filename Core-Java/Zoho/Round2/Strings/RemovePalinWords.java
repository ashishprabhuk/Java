package Zoho.Round2.Strings;
import java.util.*;

public class RemovePalinWords {
    public static void main(String[] args) {
        String sentence = "He did a good deed";
        String[] words = sentence.split(" ");

        List<String> remainingWords = new ArrayList<>();

        for (String word : words) {
            if (!isPalindrome(word)) {
                remainingWords.add(word);
            }
        }

        String output = String.join(" ", remainingWords);
        System.out.println(output);
    }

    public static boolean isPalindrome(String word) {
        int start = 0;
        int end = word.length() - 1;

        while (start < end) {
            if (word.charAt(start) != word.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
