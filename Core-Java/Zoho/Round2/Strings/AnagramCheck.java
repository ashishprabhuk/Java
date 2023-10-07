package Zoho.Round2.Strings;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
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
}
