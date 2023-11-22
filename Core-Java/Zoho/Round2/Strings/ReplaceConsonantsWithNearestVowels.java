package Zoho.Round2.Strings;

public class ReplaceConsonantsWithNearestVowels {
    public static void main(String[] args) {
        String inputString = "geeksforgeeks";
        String result = replaceConsonantsWithNearestVowels(inputString);
        System.out.println(result);
    }

    public static String replaceConsonantsWithNearestVowels(String input) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char[] chars = input.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (Character.isLetter(chars[i]) && !isVowel(chars[i])) {
                int index = (chars[i] - 'a') % 5;
                chars[i] = vowels[index];
            }
        }

        return new String(chars);
    }

    public static boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}
