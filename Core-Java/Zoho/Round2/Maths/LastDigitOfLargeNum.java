package Zoho.Round2.Maths;
import java.util.*;

public class LastDigitOfLargeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String base = sc.nextLine();
        String exp = sc.nextLine();
        System.out.println(getLastDigit(base, exp));
        sc.close();
    }
    static int Modulo(int a, String b){
        int mod = 0;
        for (int i = 0; i < b.length(); i++)
            mod = (mod * 10 + b.charAt(i) - '0') % a;
        return mod;
    }
    static int getLastDigit(String a, String b) {
        int len_a = a.length(), len_b = b.length();
        if (len_a == 1 && len_b == 1 && b.charAt(0) == '0' && a.charAt(0) == '0')
            return 1;
        if (len_b == 1 && b.charAt(0) == '0')
            return 1;
        if (len_a == 1 && a.charAt(0) == '0')
            return 0;
        int exp = (Modulo(4, b) == 0) ? 4 : Modulo(4, b);
        int res = (int)(Math.pow(a.charAt(len_a - 1) - '0', exp));
        return res % 10;
    }
}

/*

Find Last Digit Of a^b for Large Numbers

You are given two integer numbers, the base a and the index b. 
You have to find the last digit of ab.


Example 1:
Input:
a = "3", b = "10"
Output:
9
Explanation:
310 = 59049. Last digit is 9.


Example 2:
Input:
a = "6", b = "2"
Output:
6
Explanation:
62 = 36. Last digit is 6.

Your Task:
You don't need to read input or print anything. 
Your task is to complete the function getLastDigit() which takes two strings a,b as parameters and returns an integer denoting the last digit of ab.


Expected Time Complexity: O(|b|)
Expected Auxiliary Space: O(1)


Constraints:
1 <= |a|,|b| <= 1000

Note:|a| = length of a and |b| = length of b. There will not be any test cases such that ab is undefined.
*/