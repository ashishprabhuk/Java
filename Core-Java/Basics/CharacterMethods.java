package Basics;

public class CharacterMethods {
    public static void main(String[] args) {
        char myChar1 = 'A';
        boolean isLetter = Character.isLetter(myChar1); // Returns true

        char myChar2 = '5';
        boolean isDigit = Character.isDigit(myChar2); // Returns true

        char myChar3 = '7';
        boolean isLetterOrDigit = Character.isLetterOrDigit(myChar3); // Returns true

        char myChar4 = '9';
        int numericValue = Character.getNumericValue(myChar4); // Returns 9

        char myChar5 = ' ';
        boolean isWhitespace = Character.isWhitespace(myChar5); // Returns true

        char myChar6 = 'A';
        char lowercaseChar = Character.toLowerCase(myChar6); // Returns 'a'

        char myChar7 = 'a';
        char uppercaseChar = Character.toUpperCase(myChar7); // Returns 'A'

        char myChar8 = 'a';
        boolean isLowerCase = Character.isLowerCase(myChar8); // Returns true

        char myChar9 = 'A';
        boolean isUpperCase = Character.isUpperCase(myChar9); // Returns true

    }
}
