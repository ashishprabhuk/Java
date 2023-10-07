package Zoho.Round2.Strings;

import java.util.*;

public class StrPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        List<String> results = combinations(str);
        for (String result : results) {
            System.out.println(result);
        }
    }

    public static List<String> combinations(String str) {
        List<String> results = new ArrayList<>();
        generate("", str, results);
        return results;
    }

    private static void generate(String current, String remaining, List<String> results) {
        results.add(current);

        for (int i = 0; i < remaining.length(); i++) {
            generate(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1), results);
        }
    }
}

/*
Write a program to print all permutations of a
given string. Note here you need to take all
combinations as well, say for the input ABC the
output should be as follows:
Input: ABC
Output:
A
B C
AB AC BA BC CA CB
ABC ACB BCA BAC CBA CAB
*/