package Zoho.Round2.Strings;

public class RepeatedSubString {
    public static void main(String[] args) {
        System.out.println(repeatedSubstring_1("abcabcabc"));  // true
        System.out.println(repeatedSubstring_2("abadabad"));    // true
        System.out.println(repeatedSubstring_1("aabaabaabaab"));  // true
        System.out.println(repeatedSubstring_2("abcdabc"));   // false
    }

    public static boolean repeatedSubstring_1(String s) {
        String doubled = s + s;
        String sub = doubled.substring(1, doubled.length() - 1);
        return sub.contains(s);
    }

    static boolean repeatedSubstring_2(String str) {
        int len = str.length();
        for (int i = 1; i <= len / 2; i++) {
            if (len % i == 0) {
                String substring = str.substring(0, i);
                String repeated = substring.repeat(len / i);
                if (repeated.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}

/*
Repeated Substring Pattern

Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.



Example 1:
Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.

Example 2:
Input: s = "aba"
Output: false

Example 3:
Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.
*/