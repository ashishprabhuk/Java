package Zoho.Round2.Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the first and second strings
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();

        String result = findCharacterRange(firstString, secondString);
        System.out.println(result);
    }

    static String findCharacterRange(String firstString, String secondString) {
        Map<Character, Integer> firstStringIndices = new HashMap<>();

        // Initialize the indices with -1
        for (char c : secondString.toCharArray()) {
            firstStringIndices.put(c, -1);
        }

        // Find the first occurrence indices
        for (int i = 0; i < firstString.length(); i++) {
            char c = firstString.charAt(i);
            if (firstStringIndices.containsKey(c) && firstStringIndices.get(c) == -1) {
                firstStringIndices.put(c, i);
            }
        }

        int minIndex = Integer.MAX_VALUE;
        int maxIndex = Integer.MIN_VALUE;

        // Find the minimum and maximum indices
        for (int index : firstStringIndices.values()) {
            if (index == -1) {
                // If any character is not found, return an empty string
                return "";
            }
            minIndex = Math.min(minIndex, index);
            maxIndex = Math.max(maxIndex, index);
        }

        // Extract the substring
        return firstString.substring(minIndex, maxIndex + 1);
    }
}
