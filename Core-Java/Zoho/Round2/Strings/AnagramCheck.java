package Zoho.Round2.Strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "eat";
        String str2 = "tea";
        boolean isAnagram = areAnagrams(str1, str2);
        boolean isAnagram1= areAnagrams1(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
        System.out.println("Are the strings anagrams? " + isAnagram1);
    }

    static boolean areAnagrams(String str1, String str2) {
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

    static boolean areAnagrams1(String str1, String str2) {
        // Check if the lengths of the two strings are different; if so, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Convert the strings to character arrays, sort them, and then compare
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        // Check if the sorted strings are equal
        return Arrays.equals(charArray1, charArray2);
    }
}
