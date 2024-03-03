package Zoho.Round2.Strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";
        boolean isAnagram = areAnagrams1(str1, str2);
        boolean isAnagram1= areAnagrams2(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
        System.out.println("Are the strings anagrams? " + isAnagram1);
    }

    static boolean areAnagrams1(String str1, String str2) {
        char[] ch1  = str1.toCharArray();
        char[] ch2  = str2.toCharArray();
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < str1.length(); i++) {
			count[ch1[i]]++;
			count[ch2[i]]--;
		}
		for (int i = 0; i < 256; i++)
			if (count[i] != 0)
				return false;
        return true;
    }

    public static boolean areAnagrams2(String word1, String word2) {
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
