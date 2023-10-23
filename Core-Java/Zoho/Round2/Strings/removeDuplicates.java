package Zoho.Round2.Strings;

import java.util.LinkedHashSet;

public class removeDuplicates {
    public static void main(String[] args) {
        String str = "AshishPrabhu";
        removeDuplicate_OP(str);
        System.out.println(removeDuplicate_BF(str));
    }
    
    private static void removeDuplicate_OP(String str) { 
        LinkedHashSet<Character> set = new LinkedHashSet<Character>();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        for(char c : set) {
            sb.append(c);
        }
        System.out.println(sb.toString());
    }

    public static String removeDuplicate_BF(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            boolean isDuplicate = false;
            // Check for duplicates in the remaining part of the string
            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            // If not a duplicate, add it to the result
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
