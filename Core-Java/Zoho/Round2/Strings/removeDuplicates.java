package Zoho.Round2.Strings;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "AshishPrabhu";
        removeDuplicate_OP(str);
        System.out.println(removeDuplicates1(str));
        System.out.println(removeDuplicates2(str));
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

    public static String removeDuplicates1(String str) {
        boolean[] seen = new boolean[256]; // Boolean array to track seen characters (ASCII assumption)
        StringBuilder result = new StringBuilder(); // Using StringBuilder for efficient string construction

        for (char c : str.toCharArray()) {
            if (!seen[c]) {
                seen[c] = true;
                result.append(c);
            }
        }
        return result.toString();
    }

    static String removeDuplicates2(String str){
        char[] s = str.toCharArray();
        Map<Character,Integer> exists = new HashMap<>();
        String st = "";
        for(int i = 0; i < str.length(); i++){
            if(!exists.containsKey(s[i])){
                st += s[i];
                exists.put(s[i], 1);
            }
        }
        return st;
    }
}
