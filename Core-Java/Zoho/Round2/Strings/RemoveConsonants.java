package Zoho.Round2.Strings;

public class RemoveConsonants {
    public static void main(String[] args) {
        String str= "Ashish";
        System.out.println(removeConsonants(str));
    }

    public static String removeConsonants(String str) {
        StringBuilder result = new StringBuilder();
        String consonants = "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ";

        for (char c : str.toCharArray()) {
            if (!consonants.contains(String.valueOf(c))) {
                result.append(c);
            }
        }

        return result.toString();
    }
}