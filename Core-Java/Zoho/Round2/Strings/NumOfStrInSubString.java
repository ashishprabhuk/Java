package Zoho.Round2.Strings;

import java.util.Arrays;

public class NumOfStrInSubString {
    public static int numOfStrings(String[] strs, String word) {
        int count = 0;
        for(int i =0 ;i<strs.length;i++){
            if(word.contains(strs[i])) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        String[] strs = {"a","b", "ab","c"};
        String word = "aaaaabbbbbc";
        System.out.println(numOfStrings(strs, word));
        System.out.println(numOfStrings1(strs, word));
    }

    public static int numOfStrings1(String[] strs, String word) {
        Arrays.sort(strs); 
        int count = 0;
        for (String str : strs) {
            if (isSubstring(str, word)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSubstring(String str, String word) {
        int start = 0, end = word.length() - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (word.substring(mid).startsWith(str)) {
                return true;
            } else if (str.compareTo(word.substring(mid)) < 0) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}

/*
Number of Strings That Appear as Substrings in Word

Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.

A substring is a contiguous sequence of characters within a string.


Example 1:
Input: patterns = ["a","abc","bc","d"], word = "abc"
Output: 3
Explanation:
- "a" appears as a substring in "abc".
- "abc" appears as a substring in "abc".
- "bc" appears as a substring in "abc".
- "d" does not appear as a substring in "abc".
3 of the strings in patterns appear as a substring in word.

Example 2:
Input: patterns = ["a","b","c"], word = "aaaaabbbbb"
Output: 2
Explanation:
- "a" appears as a substring in "aaaaabbbbb".
- "b" appears as a substring in "aaaaabbbbb".
- "c" does not appear as a substring in "aaaaabbbbb".
2 of the strings in patterns appear as a substring in word.

Example 3:
Input: patterns = ["a","a","a"], word = "ab"
Output: 3
Explanation: Each of the patterns appears as a substring in word "ab".
*/