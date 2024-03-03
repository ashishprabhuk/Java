package Zoho.Round2.Strings;

public class RemoveCharacter {
    public static void main(String[] args) {
        String s1 = "expErIence";
        String s2 = "En";

        String result = removeCharacters(s1, s2);
        System.out.println("Output s1: " + result);
    }

    static String removeCharacters(String s1, String s2) {
        String result = "";
        char[] ch = s1.toCharArray();
        for (int i = 0; i< ch.length; i++) {
            char c = s1.charAt(i);
            if (s2.indexOf(c) == -1) {
                result += c;
            }
        }
        return result;
    }
}
