package Zoho.Round2.Strings;

public class AnagramFinder {
    public static void main(String[] args) {
        String[] inputArray = {"catch", "got", "tiger", "mat", "eat", "Pat", "tap", "tea"};
        String wordToFind = "ate";

        System.out.print("Anagrams of " + wordToFind + ": ");
        for (String word : inputArray) {
            if (areAnagrams(word.toLowerCase(), wordToFind.toLowerCase())) {
                System.out.print(word + " ");
            }
        }
    }

    public static boolean areAnagrams(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] counts = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            counts[word1.charAt(i) - 'a']++;
            counts[word2.charAt(i) - 'a']--;
        }
        for (int count : counts) {
            if (count != 0) {
                return false;
            }
        }
        return true;
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