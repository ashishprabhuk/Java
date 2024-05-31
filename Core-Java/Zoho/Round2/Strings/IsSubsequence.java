package Zoho.Round2.Strings;

public class IsSubsequence {
    public static boolean isSubsequence_1(String s, String t) {
        int i = 0, j = 0;
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length();
    }

    public static boolean isSubsequence_2(String s, String t) {
        if(s.length() == 0) return true;
        char[] arr = s.toCharArray();
        int idx = 0;
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == arr[idx]) idx++;
            if(idx == s.length()) return true;
        }
        return false;
    }

    static boolean isSubSeq(String str1, String str2){
        int i =0, j = 0;
        while(i<str1.length() && j<str2.length()){
            if(str1.charAt(i)==str2.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==str1.length()){
            return true;
        }
        return false;
	}
    
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence_1(s, t));
        System.out.println(isSubsequence_2(s, t));
        System.out.println(isSubSeq(s, t));
    }
}

/*
Is Subsequence

Given two strings s and t, return true if s is a subsequence of t, or false otherwise.

A subsequence of a string is a new string that is formed from the original string
 by deleting some (can be none) of the characters without disturbing 
 the relative positions of the remaining characters. 
 (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

Example 1:
Input: s = "abc", t = "ahbgdc"
Output: true

Example 2:
Input: s = "axc", t = "ahbgdc"
Output: false



import java.util.*;

public class Main
{
	public static void main(String[] args) {
		sequence("Hello$World$");
	}
	static void sequence(String str1, String str2){
	    int i =0, j = 0;
	    while(i<str1.length() && j<str2.length()){
	        if(str1.charAt(i)==str2.charAt(j)){
	            i++;
	            j++;
	        }else{
	            j++;
	        }
	    }
	    if(i==Str1.length()){
	        return true;
	    }
	    return false;
	}
}

*/