package Zoho.Round2.Strings;

public class StrPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        combinations("", str);
    }

    public static void combinations(String current, String remaining) {
        System.out.println(current);
        for (int i = 0; i < remaining.length(); i++) {
            combinations(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }
}


/*
Write a program to print all permutations of a
given string. Note here you need to take all
combinations as well, say for the input ABC the
output should be as follows:
Input: ABC
Output:
A
B C
AB AC BA BC CA CB
ABC ACB BCA BAC CBA CAB
*/