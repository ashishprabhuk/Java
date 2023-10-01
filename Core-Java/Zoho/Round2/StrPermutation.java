package Zoho.Round2;

import java.util.*;

public class StrPermutation {
    public static void main(String[] args) {
        String input = "ABC";
        List<String> results = generatePermutationsAndCombinations(input);
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static List<String> generatePermutationsAndCombinations(String input) {
        List<String> results = new ArrayList<>();
        generate("", input, results);
        return results;
    }

    private static void generate(String current, String remaining, List<String> results) {
        results.add(current);

        for (int i = 0; i < remaining.length(); i++) {
            generate(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), results);
        }
    }
}
