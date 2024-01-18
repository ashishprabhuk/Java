package Accenture;

public class NumberOfCarries {
    public static void main(String[] args) {
        int num1 = 451;
        int num2 = 349;
        int result1 = NumberOfCarries(num1, num2);
        System.out.println(result1); // Output: 2

        int num3 = 23;
        int num4 = 563;
        int result2 = NumberOfCarries(num3, num4);
        System.out.println(result2); // Output: 0
    }

    static int NumberOfCarries(int num1, int num2) {
        int carry = 0;
        int numberOfCarries = 0;

        while (num1 > 0 || num2 > 0) {
            int digitSum = carry + num1 % 10 + num2 % 10;
            carry = digitSum / 10;
            
            if (carry > 0) {
                numberOfCarries++;
            }

            num1 /= 10;
            num2 /= 10;
        }
        return numberOfCarries;
    }
}



/*
A carry is a digit that is transferred to left if sum of digits exceeds 9 while adding two numbers from right-to-left one digit at a time

You are required to implement the following function.

Int NumberOfCarries(int num1 , int num2);

The functions accepts two numbers ‘num1’ and ‘num2’ as its arguments. You are required to calculate and return  the total number of carries generated while adding digits of two numbers ‘num1’ and ‘ num2’.

Assumption: num1, num2>=0

Example:

Input
Num 1: 451
Num 2: 349
Output
2


Explanation:

Adding ‘num 1’ and ‘num 2’ right-to-left results in 2 carries since ( 1+9) is 10. 1 is carried and (5+4=1) is 10, again 1 is carried. Hence 2 is returned.

Sample Input

Num 1: 23

Num 2: 563

Sample Output

0
 */