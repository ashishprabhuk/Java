package Zoho.Round2.Strings;

public class NumberOfSubStrOfStr {
    static int countNonEmptySubstr(String str){
        int n = str.length();
        return n * (n + 1) / 2;
    }
    public static void main(String args[]){
        String s = "abcde";
        System.out.println(countNonEmptySubstr(s));
    }
}

/*
Input : str = “abc” 
Output : 6 
Every substring of the given string : “a”, “b”, “c”, “ab”, “bc”, “abc”

Input : str = “abcd” 
Output : 10 
Every substring of the given string : “a”, “b”, “c”, “d”, “ab”, “bc”, “cd”, “abc”, “bcd” and “abcd”
 */