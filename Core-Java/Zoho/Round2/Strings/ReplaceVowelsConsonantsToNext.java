package Zoho.Round2.Strings;

public class ReplaceVowelsConsonantsToNext{
    public static void main(String[] args) {
        String input = "guvi";

        String output1 = replaceChars_BF(input);
        System.out.println("Output: " + output1);

        String output2 = replaceChars_OP(input);
        System.out.println("Output: " + output2);
    }

    public static String replaceChars_OP(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = getNextChar_OP(charArray[i]);
        }
        return new String(charArray);
    }
    public static char getNextChar_OP(char c) {
        String consonants = "bcdfghjklmnpqrstvwxyz";
        String vowels = "aeiou";

        int index;
        if ((index = consonants.indexOf(Character.toLowerCase(c))) != -1) {
            return consonants.charAt((index + 1) % consonants.length());
        } else if ((index = vowels.indexOf(Character.toLowerCase(c))) != -1) {
            return vowels.charAt((index + 1) % vowels.length());
        } else {
            return c;
        }
    }

//-------------------------------------------------------------------------

    public static String replaceChars_BF(String input) {
        char[] charArray = input.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = getNextChar_BF(charArray[i]);
        }
        return new String(charArray);
    }

    public static char getNextChar_BF(char c) {
        switch (c) {
            case 'b':
                return 'c';
            case 'c':
                return 'd';
            case 'd':
                return 'f';
            case 'f':
                return 'g';
            case 'g':
                return 'h';
            case 'h':
                return 'j';
            case 'j':
                return 'k';
            case 'k':
                return 'l';
            case 'l':
                return 'm';
            case 'm':
                return 'n';
            case 'n':
                return 'p';
            case 'p':
                return 'q';
            case 'q':
                return 'r';
            case 'r':
                return 's';
            case 's':
                return 't';
            case 't':
                return 'v';
            case 'v':
                return 'w';
            case 'w':
                return 'x';
            case 'x':
                return 'y';
            case 'y':
                return 'z';
            case 'z':
                return 'b';
            case 'a':
                return 'e';
            case 'e':
                return 'i';
            case 'i':
                return 'o';
            case 'o':
                return 'u';
            case 'u':
                return 'a';
            default:
                return c;
        }
    }
}


