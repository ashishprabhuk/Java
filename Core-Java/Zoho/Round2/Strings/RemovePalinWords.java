package Zoho.Round2.Strings;

import java.util.ArrayList;
import java.util.List;

public class RemovePalinWords {
    public static void main(String[] args) {
        String sentence = "Ashish speaks malayalam";
        String result = removePalindromeWords(sentence);
        System.out.println(result);
    }

    public static String removePalindromeWords(String sentence) {
        String[] words = sentence.split(" ");
        List<String> remainingWords = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            if (!isPalindrome(words[i])) {
                remainingWords.add(words[i]);
            }
        }
        return String.join(" ", remainingWords);
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




/*
Given a sentence of string, in that remove the
palindrome words and print the remaining.
Input:
He did a good deed
Output:
He good
Input:
Ashish speaks malayalam
Output:
Ashish speaks
 */