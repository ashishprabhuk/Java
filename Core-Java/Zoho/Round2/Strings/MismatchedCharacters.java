package Zoho.Round2.Strings;

import java.util.Arrays;

public class MismatchedCharacters {
    public static void main(String[] args) {
        String str1 = "a b c d e f g h i";
        String str2 = "a b d e e g g i i";

        findMismatchedCharacters(str1, str2);
    }

    public static void findMismatchedCharacters(String str1, String str2) {
        String[] tokens1 = str1.split(" ");
        String[] tokens2 = str2.split(" ");
        System.out.println(Arrays.toString(tokens1));
        System.out.println(Arrays.toString(tokens2));

        if (tokens1.length != tokens2.length) {
            System.out.println("Input strings have different lengths.");
            return;
        }
        for (int i = 0; i < tokens1.length; i++) {
            if (!tokens1[i].equals(tokens2[i])) {
                System.out.println(tokens1[i] + " , " + tokens2[i]);
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