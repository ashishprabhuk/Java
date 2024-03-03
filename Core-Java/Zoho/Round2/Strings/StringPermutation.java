package Zoho.Round2.Strings;

public class StringPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        permute(str.toCharArray(), 0, str.length() - 1);
    }

    static void permute(char[] str, int start, int end) {
        if (start == end)
            System.out.println(new String(str));
        else {
            for (int i = start; i <= end; i++) {
                swap(str, start, i);
                permute(str, start + 1, end);
                swap(str, start, i);
            }
        }
    }

    static void swap(char[] str, int i, int j) {
        char temp = str[i];
        str[i] = str[j];
        str[j] = temp;
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