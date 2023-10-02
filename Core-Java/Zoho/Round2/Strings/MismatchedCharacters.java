package Zoho.Round2.Strings;

public class MismatchedCharacters {
    public static void main(String[] args) {
        String str1 = "a b c d e f g h i";
        String str2 = "a b d e e g g i i";

        String[] tokens1 = str1.split(" ");
        String[] tokens2 = str2.split(" ");

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
