package Zoho.Round2.Strings;

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Hello$World$";
        int count = countCharacters(input);
        System.out.println("Output: " + count);
    }

    public static int countCharacters(String input) {
        int count = 0;
        boolean escape = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '$' && !escape) {
                escape = true;
            } else if (c == '$' && escape) {
                escape = false;
            } else {
                count++;
                escape = false;
            }
        }

        return count;
    }
}