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

// package Zoho.Round2.Strings;

// public class AnagramFinder {
//     public static void main(String[] args) {
//         String[] inputArray = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
//         String wordToFind = "ate";

//         System.out.print("Anagrams of " + wordToFind + ": ");
//         for (String word : inputArray) {
//             if (areAnagrams(word.toLowerCase(), wordToFind.toLowerCase())) {
//                 System.out.print(word + " ");
//             }
//         }
//     }

//     public static boolean areAnagrams(String word1, String word2) {
//         if (word1.length() != word2.length()) {
//             return false;
//         }

//         // Count occurrences of each character
//         int[] counts = new int[26];
//         for (int i = 0; i < word1.length(); i++) {
//             counts[word1.charAt(i) - 'a']++;
//             counts[word2.charAt(i) - 'a']--;
//         }

//         // Check if all counts are zero
//         for (int count : counts) {
//             if (count != 0) {
//                 return false;
//             }
//         }
//         return true;
//     }
// }


/*
3. It’s about anagram.i/p was array of strings .and a
word was given to find whether it has anagram in
given array.
I/p catch, got, tiger, mat, eat, Pat, tap, tea
Word: ate
O/p eat, tea
 */