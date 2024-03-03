package Zoho.Round2.Strings;

import java.util.Arrays;

public class MismatchedCharacters {
    public static void main(String[] args) {
        String str1 = "a b c d e f g h i";
        String str2 = "a b d e e g g i i";

        findMismatchedCharacters(str1, str2);
    }

    public static void findMismatchedCharacters(String str1, String str2) {
        if (str1.length() != str2.length()) {
            System.out.println("Input strings have different lengths.");
            return;
        }
        
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(str1.charAt(i) + " , " + str2.charAt(i));
            }
        }
    }
}

/*
Two strings of equal length are given print the
mismatched ones.
I/P: 
a b c d e f g h i
a b d e e g g i i
O/P: 
cd , de //when two char are mismatched they should be printed together.
f , g
h , i
 */