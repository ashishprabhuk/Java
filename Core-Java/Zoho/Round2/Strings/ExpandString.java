package Zoho.Round2.Strings;

public class ExpandString {
    public static void main(String[] args) {
        String input1 = "a1b10";
        String input2 = "a2b1c4d3";
        
        String output1 = expandString(input1);
        String output2 = expandString(input2);
        
        System.out.println("Output 1: " + output1);
        System.out.println("Output 2: " + output2);
    }
    
    public static String expandString(String input) {
        StringBuilder result = new StringBuilder();
        int i = 0;
        
        while (i < input.length()) {
            char ch = input.charAt(i);
            i++;
            
            // Check if the next character(s) represent a number
            int count = 0;
            while (i < input.length() && Character.isDigit(input.charAt(i))) {
                count = count * 10 + (input.charAt(i) - '0');
                i++;
            }
            
            // Append the character 'count' times
            for (int j = 0; j < count; j++) {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
}

