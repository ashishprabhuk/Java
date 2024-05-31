package Zoho.Round2.Strings;

public class CharacterRange {
    public static void main(String[] args) {
        String firstString = "abracadabra";
        String secondString = "cadabra";
        String result = findCharacterRange(firstString, secondString);
        System.out.println(result);
    }

    static String findCharacterRange(String firstString, String secondString) {
        if (firstString.isEmpty() || secondString.isEmpty()) {
            return "";
        }

        int[] charCount = new int[26]; // Count of each character in secondString
        for (char c : secondString.toCharArray()) {
            charCount[c - 'a']++;
        }

        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;
        int count = 0; // Count of characters from secondString found in the range

        for (int i = 0; i < firstString.length(); i++) {
            char c = firstString.charAt(i);
            if (charCount[c - 'a'] > 0) {
                charCount[c - 'a']--; // Decrement count for found character
                count++;
                minIndex = Math.min(minIndex, i);
                maxIndex = Math.max(maxIndex, i);
            } else if (count == secondString.length()) {
                break;
            }
        }

        return count == secondString.length() ? firstString.substring(minIndex, maxIndex + 1) : "";
    }
}