package Zoho.Round2.Strings;

import java.util.*;

public class WordBreak {
    public static void main(String[] args) {
        Set<String> dictionary = new HashSet<>();
        dictionary.add("i");
        dictionary.add("like");
        dictionary.add("sam");
        dictionary.add("sung");
        dictionary.add("samsung");
        dictionary.add("mobile");
        dictionary.add("ice");
        dictionary.add("cream");
        dictionary.add("icecream");
        dictionary.add("man");
        dictionary.add("go");
        dictionary.add("mango");

        String input1 = "ilike";
        String input2 = "ilikesamsung";

        System.out.println(wordBreak(input1, dictionary)); // Output: Yes
        System.out.println(wordBreak(input2, dictionary)); // Output: Yes
    }

    static boolean wordBreak(String s, Set<String> dictionary) {
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;
    
        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (dp[j] && dictionary.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];
    }
}

/*
Given an input string and a dictionary of words,
find out if the input string can be segmented into a
space-separated sequence of dictionary words. See
following examples for more details.
Consider the following dictionary
{ i, like, sam, sung, samsung, mobile, ice, cream, icecream, man, go, mango}
Input: ilike
Output: Yes
The string can be segmented as "i like".
Input: ilikesamsung
Output: Yes
The string can be segmented as "i like samsung"
or "i like sam sung".<>
 */