package Zoho.Round2.Strings;

public class DistinctSubString {
    public static void main(String[] args) {
        String s1 = "abcda";
        System.out.println(countGoodSubstrings(s1)); // Output: 1

        String s2 = "aababcabc";
        System.out.println(countGoodSubstrings1(s2)); // Output: 4
    }

    public static int countGoodSubstrings(String s) {
        int count = 0;
        for (int i = 0; i <= s.length() - 3; i++) {
            if (isGoodSubstring(s, i)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isGoodSubstring(String s, int index) {
        // Check if the substring has distinct characters
        return s.charAt(index) != s.charAt(index + 1)
                && s.charAt(index + 1) != s.charAt(index + 2)
                && s.charAt(index) != s.charAt(index + 2);
    }

    public static int countGoodSubstrings1(String s) {
        int count = 0;

        // Iterate through the string
        for (int i = 0; i <= s.length() - 3; i++) {
            // Check for distinct characters in each substring of size three
            if (areDistinct(s.charAt(i), s.charAt(i + 1), s.charAt(i + 2))) {
                count++;
            }
        }

        return count;
    }

    private static boolean areDistinct(char a, char b, char c) {
        // Check if characters are distinct
        return a != b && b != c && a != c;
    }
}

/*
Substrings of Size Three with Distinct Characters

A string is good if there are no repeated characters.

Given a string s​​​​​, return the number of good substrings of length three in s​​​​​​.

Note that if there are multiple occurrences of the same substring, every occurrence should be counted.

A substring is a contiguous sequence of characters in a string.



Example 1:
Input: s = "xyzzaz"
Output: 1
Explanation: There are 4 substrings of size 3: "xyz", "yzz", "zza", and "zaz". 
The only good substring of length 3 is "xyz".

Example 2:
Input: s = "aababcabc"
Output: 4
Explanation: There are 7 substrings of size 3: "aab", "aba", "bab", "abc", "bca", "cab", and "abc".
The good substrings are "abc", "bca", "cab", and "abc".
 */