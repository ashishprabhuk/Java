package Zoho.Round2.Strings;

public class AllSubStrings {
    public static void main(String[] args) {
        // String input = "abc";
        String input = "Geeky";
        
        int len = input.length();

        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = input.substring(i, j);
                System.out.println(substring);
            }
        }
    }
}
