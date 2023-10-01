package DSA.Strings;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = areAnagrams(str1, str2);
        System.out.println("Are the strings anagrams? " + isAnagram);
    }
    
    static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        int[] charCount = new int[256];
        for (char c : str1.toCharArray()) {
            charCount[c]++;
        }
        for (char c : str2.toCharArray()) {
            charCount[c]--;
        }
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        return true;
    }
}

