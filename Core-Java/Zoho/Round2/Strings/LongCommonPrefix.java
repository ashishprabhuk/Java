package Zoho.Round2.Strings;

import java.util.Arrays;

public class LongCommonPrefix {
    public static String longestCommonPrefix(String[] str) {
        StringBuilder ans = new StringBuilder();
        Arrays.sort(str);
        String first = str[0];
        String last = str[str.length-1];
        for (int i=0; i<Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        // String[] str = {"flower","flow","flight"};
        String[] str = {"dog","racecar","car"};
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

