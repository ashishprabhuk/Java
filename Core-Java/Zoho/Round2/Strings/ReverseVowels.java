package Zoho.Round2.Strings;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "abcdef"; //ebcdaf
        // String str = "Ashish";
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String str) {
        int i = 0, j = str.length() - 1;
        char[] ch = str.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i < j) {
            if (!vowels.contains(ch[i] + "")) { // if ch[i] => char to string
                i++;
                continue;
            }
            if (!vowels.contains(ch[j] + "")) {
                j--;
                continue;
            }
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }
        return new String(ch);
    }
}