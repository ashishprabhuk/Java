package Zoho.Round2.Strings;
import java.util.*;

public class AnagramFinder {
    public static void main(String[] args) {
        String[] inputArray = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
        String wordToFind = "ate";

        List<String> result = findAnagrams(inputArray, wordToFind);
        System.out.println("Anagrams of " + wordToFind + ": " + result);
    }

    public static List<String> findAnagrams(String[] inputArray, String wordToFind) {
        List<String> anagrams = new ArrayList<>();

        // Convert the wordToFind to lowercase and sort its characters
        char[] sortedWordToFind = wordToFind.toLowerCase().toCharArray();
        Arrays.sort(sortedWordToFind);

        for (String word : inputArray) {
            // Convert the current word to lowercase and sort its characters
            char[] sortedWord = word.toLowerCase().toCharArray();
            Arrays.sort(sortedWord);

            // Compare the sorted words to find anagrams
            if (Arrays.equals(sortedWord, sortedWordToFind)) {
                anagrams.add(word);
            }
        }
        return anagrams;
    }
}

/*
3. It’s about anagram.i/p was array of strings .and a
word was given to find whether it has anagram in
given array.
I/p catch, got, tiger, mat, eat, Pat, tap, tea
Word: ate
O/p eat, tea
 */