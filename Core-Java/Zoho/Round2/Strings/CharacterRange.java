package Zoho.Round2.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterRange {
    public static void main(String[] args) {
        // Read the first and second strings
        String firstString = "abracadabra";
        String secondString = "cadabra";

        String result = findCharacterRange(firstString, secondString);
        System.out.println(result);
    }

    static String findCharacterRange(String firstString, String secondString) {
        if (firstString.isEmpty() || secondString.isEmpty()) {
            return ""; // Handle empty strings
        }

        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        for (char c : secondString.toCharArray()) {
            int index = firstString.indexOf(c);
            if (index != -1) {
                minIndex = Math.min(minIndex, index);
                maxIndex = Math.max(maxIndex, index);
            } else {
                return ""; // If any character is not found, return an empty string
            }
        }
        // Extract the substring
        return firstString.substring(minIndex, maxIndex + 1);
    }
}
