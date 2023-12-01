package Zoho.Round2.Strings;

import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = areAnagrams(str1, str2);
        boolean isAnagram1= areAnagrams1(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
        System.out.println("Are the strings anagrams? " + isAnagram1);
    }

    static boolean areAnagrams(String str1, String str2) {
        // Check if the lengths of the two strings are different; if so, they cannot be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        // Create an array to count the occurrences of each character in str1
        int[] charCount = new int[256];
        // Increment the count for each character in str1
        for (char c : str1.toCharArray()) {
            charCount[c]++;
        }
        // Decrement the count for each character in str2
        for (char c : str2.toCharArray()) {
            charCount[c]--;
        }
        // Check if all character counts are zero; if not, they are not anagrams
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        // If all character counts are zero, the strings are anagrams
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
