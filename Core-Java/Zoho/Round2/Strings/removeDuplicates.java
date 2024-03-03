package Zoho.Round2.Strings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AshishPrabhu";
        removeDuplicate_OP(str);
        System.out.println(removeDuplicate_BF(str));
        System.out.println(removeDuplicates(str));
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
            for (int j = i + 1; j < input.length(); j++) {
                if (currentChar == input.charAt(j)) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                result.append(currentChar);
            }
        }
        return result.toString();
    }

    static String removeDuplicates(String str){
        char[] s = str.toCharArray();
        int n = str.length();
        Map<Character,Integer> exists = new HashMap<>();
        String st = "";
        for(int i = 0; i < n; i++){
            if(!exists.containsKey(s[i])){
                st += s[i];
                exists.put(s[i], 1);
            }
        }
        return st;
    }
}
