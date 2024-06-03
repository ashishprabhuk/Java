package Zoho.Round2.Maths;

public class Armstrong {
    static boolean isArmstrong(int n) {
        int num = n;
        int len = String.valueOf(n).length(); //returns the length of the string representation of the integer value
        int sum = 0;
        while (n > 0) {
            int digit = n % 10; // 153
            sum += Math.pow(digit, len); // 0 + 1^3 = 1 ; 1 + 5^3 = 126 ; 126 + 3^3 = 153
            n /= 10;
        }
        return sum == num;
    }

    public static void main(String[] args) {
        System.out.println(isArmstrong(153)); // Test with 153
    }
}

/*
Given a number x, determine whether the given number is Armstrong’s number or not.

A positive integer of n digits is called an Armstrong number of order n (order is the number of digits) if

abcd... = pow(a,n) + pow(b,n) + pow(c,n) + pow(d,n) + .... 
Example: 

Input:153
Output: Yes
153 is an Armstrong number.
1*1*1 + 5*5*5 + 3*3*3 = 153

Input: 120
Output: No
120 is not a Armstrong number.
1*1*1 + 2*2*2 + 0*0*0 = 9

Input: 1253
Output: No
1253 is not a Armstrong Number
1*1*1*1 + 2*2*2*2 + 5*5*5*5 + 3*3*3*3 = 723

Input: 1634
Output: Yes
1*1*1*1 + 6*6*6*6 + 3*3*3*3 + 4*4*4*4 = 1634
*/