package Zoho.Round2.Strings;

public class MaxRepeatingSubString {
    public static int maxRepeating(String s, String word) {
        int count = 0;
        String str = word;
        while(s.contains(word)==true){
            count++;
            word = word+str;
        }
        return count;
    }

    public static void main(String[] args){
        String sequence = "abababc";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word));
    }
}

/*
Maximum Repeating Substring

For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence. If word is not a substring of sequence, word's maximum k-repeating value is 0.

Given strings sequence and word, return the maximum k-repeating value of word in sequence.

Example 1:
Input: sequence = "ababc", word = "ab"
Output: 2
Explanation: "abab" is a substring in "ababc".

Example 2:
Input: sequence = "ababc", word = "ba"
Output: 1
Explanation: "ba" is a substring in "ababc". "baba" is not a substring in "ababc".

Example 3:
Input: sequence = "ababc", word = "ac"
Output: 0
Explanation: "ac" is not a substring in "ababc".
*/