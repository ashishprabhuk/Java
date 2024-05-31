package Zoho.Round2.Strings;

public class MaxRepeatingSubString {
    public static int maxRepeating(String seq, String word) {
        int count = 0;
        String str = word;
        while(seq.contains(word)==true){
            count++;
            word = word+str; //ab+ab = abab
        }
        return count;
    }

    static int maxRepeating_OP(String seq, String word){
        int count = 0;
        int i = 0;
        while(i<seq.length()){
            int j = 0;
            while(j<word.length() && i<seq.length() && seq.charAt(i)==word.charAt(j)){ // - a
                i++;
                j++;
            }
            if(j==word.length()){ // ab=2
                count++; //
            }else{
                i++;
            }
        }
        return count;
    }

    public static void main(String[] args){
        String sequence = "ababcab";
        String word = "ab";
        System.out.println(maxRepeating(sequence, word)); // for continues word
        System.out.println(maxRepeating_OP(sequence, word)); // for unordered word
    }
}

/*
Maximum Repeating Substring

For a string sequence, a string word is k-repeating if word concatenated k times is a substring of sequence. 
The word's maximum k-repeating value is the highest value k where word is k-repeating in sequence.
If word is not a substring of sequence, word's maximum k-repeating value is 0.

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