package Zoho.Round2;

public class ReverseVowels {
    public static void main(String[] args) {
        String str = "abcdef";
        // String str = "Ashish";
        System.out.println(reverseVowels(str));
    }

    public static String reverseVowels(String str) {
        int i = 0, j = str.length() - 1;
        char[] arr = str.toCharArray();
        String vowels = "aeiouAEIOU";
        while (i < j) {
            if (!vowels.contains(arr[i] + "")) {
                i++;
                continue;
            }
            if (!vowels.contains(arr[j] + "")) {
                j--;
                continue;
            }
            char temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return new String(arr);
    }
}