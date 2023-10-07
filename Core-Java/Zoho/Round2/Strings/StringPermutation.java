package Zoho.Round2.Strings;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        int n = str.length();
        permute(str, 0, n - 1);
    }

    static void permute(String str, int left, int right) {
        if (left == right)
            System.out.println(str);
        else {
            for (int i = left; i <= right; i++) {
                str = swap(str, left, i);
                permute(str, left + 1, right);
                str = swap(str, left, i);
            }
        }
    }
    static String swap(String str, int i, int j) {
        char temp;
        char[] charArray = str.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}

/*
Print all distinct permutations of a string having duplicates.

Input : 
ABC

Output : 
ABC
ACB
BAC
BCA
CBA
CAB
*/