package Zoho.Round2.Strings;

import java.util.Arrays;

public class LongCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        if (str == null || str.length == 0) {
            return "";
        }
        String prefix = str[0]; 
        for (int i = 1; i < str.length; i++) {
            while (str[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1); // Shorten the prefix
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }
    public static void main(String[] args) {
        String[] str = {"flower","flow","flight"};
        // String[] str = {"dog","racecar","car"};
        System.out.println(longestCommonPrefix(str));
    }
}

/*

Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

Example 1:

Input: str = ["flower","flow","flight"]
Output: "fl"
Example 2:

Input: str = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.
 */

