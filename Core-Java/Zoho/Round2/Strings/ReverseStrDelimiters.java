package Zoho.Round2.Strings;

public class ReverseStrDelimiters {

    public static String reverseStr_OP(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            if (i < j && !Character.isLetterOrDigit(chars[i])) {
                i++;
            }
            if (i < j && !Character.isLetterOrDigit(chars[j])) {
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static String reverseStr_OP2(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            while (i < j && !isLetterOrDigit(chars[i])) {
                i++;
            }
            while (i < j && !isLetterOrDigit(chars[j])) {
                j--;
            }
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }
    private static boolean isLetterOrDigit(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') || (c >= '0' && c <= '9');
    }
    

    static String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;

        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String str = "A man, in the boat says : I see 1-2-3 in the sky";
        System.out.println(reverseStr_OP2(str));
    }
}
