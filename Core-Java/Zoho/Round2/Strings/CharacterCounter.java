package Zoho.Round2.Strings;

public class CharacterCounter {
    public static void main(String[] args) {
        String input = "Ashish$Prabhu$";
        int count = countCharactersWithEscape(input);
        System.out.println("Output: " + count);
    }

    public static int countCharactersWithEscape(String input) {
        int count = 0;
        boolean escape = false;

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar == '$' && !escape) {
                escape = !escape; // Increment count if '$' is not in escape mode
            } else {
                count++;   // Increment count for all other characters
            }
        }
        return count;
    }
}



/*
3.Count the numbers of characters in the given
string treating ‘$’ as escape sequence. If ‘$’ is
preceeded by ”, consider it as normal ‘$’ and not
the escape sequence. If ” occurs, treat it as single ”.
Example:
Input: Hello$World$
Output: 11
 */