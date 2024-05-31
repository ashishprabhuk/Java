package Zoho.Round2.Strings;

import java.util.*;

public class CompressString {
    public static void main(String[] args) {
        String str = "abbccc"; // 1a2b3c
        count_1(str); 
        count_2(str);
    }
    private static void count_1(String str) {
        int[] counts = new int[256];
        for (int i = 0; i < str.length(); i++) {
            counts[str.charAt(i)]++; 
        }
        for (int i = 0; i < 256; i++) {
            if (counts[i] > 0) {
                System.out.print(counts[i] + "" + (char) i );
            }
        }
    }
    private static void count_2(String str) {
        Map<Character, Integer> counts = new HashMap<>();

        for (char c : str.toCharArray()) {
            counts.put(c, counts.getOrDefault(c, 0) + 1);
        }
        System.out.println();

        for (Map.Entry<Character, Integer> entry : counts.entrySet()) {
            // System.out.println(entry.getKey() + " : " + entry.getValue());
            System.out.print(entry.getValue()  + "" + entry.getKey());
        }
    }
}
