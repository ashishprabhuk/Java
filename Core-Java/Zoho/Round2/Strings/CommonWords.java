package Zoho.Round2.Strings;

import java.util.*;

public class CommonWords {
    public static void main(String[] args) {
        String input1 = "I walk everyday in the morning."; 
        String input2 = "I run everyday in the evening.";
        String input3 = "I swim everyday in the night.";

        findCommonWords(input1, input2, input3);
        System.out.println();
        findAndPrintCommonWords(input1, input2, input3);
        System.out.println();
        System.out.print(findCommonWords2(input1, input2, input3));
        System.out.println();
        findCommonWords3(input1, input2, input3);
        System.out.println();
        System.out.print(findCommonWords4(input1, input2, input3));
    }

    public static void findCommonWords(String input1, String input2, String input3){
        // \\s+ is a regular expression that matches one or more white space characters.
        String[] words1 = input1.toLowerCase().split("\\s+"); 
        String[] words2 = input2.toLowerCase().split("\\s+");
        String[] words3 = input3.toLowerCase().split("\\s+");

        Arrays.sort(words1);
        Arrays.sort(words2);
        Arrays.sort(words3);

        int i = 0, j = 0, k = 0;

        System.out.println("Common words:");
        while (i < words1.length && j < words2.length && k < words3.length) {
            if (words1[i].equals(words2[j]) && words1[i].equals(words3[k])) {
                System.out.print(words1[i] + " ");
                i++;
                j++;
                k++;
            } else if (words1[i].compareTo(words2[j]) < 0) {
                i++;
            } else if (words2[j].compareTo(words3[k]) < 0) {
                j++;
            } else {
                k++;
            }
        }
    }

    public static void findAndPrintCommonWords(String input1, String input2, String input3) {
        String[] words1 = input1.split("\\s+");
        String[] words2 = input2.split("\\s+");
        String[] words3 = input3.split("\\s+");

        for (String word1 : words1) {
            for (String word2 : words2) {
                for (String word3 : words3) {
                    if (word1.equalsIgnoreCase(word2) && word1.equalsIgnoreCase(word3)) {
                        System.out.print(word1 + " ");
                        break; // Break the inner loop once a common word is found
                    }
                }
            }
        }
    }

    public static String findCommonWords2(String str1, String str2, String str3) {
        String[] words1 = str1.toLowerCase().split(" ");
        String[] words2 = str2.toLowerCase().split(" ");
        String[] words3 = str3.toLowerCase().split(" ");
    
        Set<String> common = new HashSet<>();
    
        for (String word : words1) {
            if (Arrays.asList(words2).contains(word) && Arrays.asList(words3).contains(word)){
                common.add(word);
            }
        }
        return String.join(" ", common);
    }

    public static void findCommonWords3(String... inputs) {
        Map<String, Integer> wordFrequency = new HashMap<>();

        for (String input : inputs) {
            String[] words = input.toLowerCase().split("\\s+");
            for (String word : words) {
                wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == inputs.length) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }

    public static String findCommonWords4(String str1, String str2, String str3) {
        String[] words1 = str1.toLowerCase().split(" ");
        String[] words2 = str2.toLowerCase().split(" ");
        String[] words3 = str3.toLowerCase().split(" ");
    
        StringBuilder commonWords = new StringBuilder();
    
        // Iterate through each word in the third string
        for (String word : words3) {
          boolean foundInFirst = false;
          boolean foundInSecond = false;
    
          // Check if the word exists in the first string
          for (String word1 : words1) {
            if (word.equals(word1)) {
              foundInFirst = true;
              break;
            }
          }
          if (foundInFirst) {
            for (String word2 : words2) {
              if (word.equals(word2)) {
                foundInSecond = true;
                break;
              }
            }
          }
          if (foundInFirst && foundInSecond) {
            commonWords.append(word).append(" ");
          }
        }
        return commonWords.toString().trim();
      }
}