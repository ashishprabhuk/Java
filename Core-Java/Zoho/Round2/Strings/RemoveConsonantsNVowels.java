package Zoho.Round2.Strings;

public class RemoveConsonantsNVowels {
    public static void main(String[] args) {
        String str= "Ashish";
        System.out.println(remove(str));
    }

    public static String remove(String str) {
        StringBuilder result = new StringBuilder();
        String vowels = "aeiouAEIOU";  // Include both lowercase and uppercase vowels

        for (char c : str.toCharArray()) {
            if (vowels.contains(String.valueOf(c))) {
                result.append(c);
            }
        }
        return result.toString();
    }
}