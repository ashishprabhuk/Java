package Accenture;
import java.util.*;

class MaMaxExponents {
    public static int count (int i) {
        int count = 0;
        while (i % 2 == 0 && i != 0){
            i /= 2;
            count++; 
        }
        return count;
    }

    public static int maxExponents (int a, int b){
        int max = 0, num = 0, ans;
        for (int i = a; i <= b; i++){
            int temp = count (i);
            if (temp > max){
                max = temp;
                num = i;
            }
        }
        return num;
    }

    public static void main (String[]args){
        Scanner sc = new Scanner (System.in);
        int a = sc.nextInt ();
        int b = sc.nextInt ();
        System.out.println (maxExponents(a, b));
    }
}

/*
You are given a function,

Int MaxExponents (int a , int b);

You have to find and return the number between ‘a’ and ‘b’ ( range inclusive on both ends) which has the maximum exponent of 2.

The algorithm to find the number with maximum exponent of 2 between the given range is

Loop between ‘a’ and ‘b’. Let the looping variable be ‘i’.
Find the exponent (power) of 2 for each ‘i’ and store the number with maximum exponent of 2 so faqrd in a variable , let say ‘max’. Set ‘max’ to ‘i’ only if ‘i’ has more exponent of 2 than ‘max’.
Return ‘max’.
Assumption: a <b

Note: If two or more numbers in the range have the same exponents of  2 , return the small number.

Example

Input:
7
12
Output:
8
Explanation:

Exponents of 2 in:

7-0

8-3

9-0

10-1

11-0

12-2

Hence maximum exponent if two is of 8.
 */