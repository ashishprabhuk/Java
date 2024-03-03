package Zoho.Round2.Strings;

public class RemoveConsonantsNVowels {
    public static void main(String[] args) {
        String str = "Ashish";
        System.out.println(remove(str));
    }

    public static String remove(String str) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (isVowel(c)) {
                result += c;
            }
        }
        return result;
    }

    private static boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
            c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}
