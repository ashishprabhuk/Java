package Zoho.Round2.Maths;

public class BaseNAddition {
    public static void main(String[] args) {
        int n1 = 123, n2=13;
        String a = Integer.toString(n1); // a = "123"
        String b =  Integer.toString(n2); // b = "13"
        int n = 4;

        String result = addBaseN(a, b, n);
        System.out.println("Base " + n + " Sum: " + result);
    }

    public static String addBaseN(String a, String b, int n) {
        int carry = 0; // Initialize carry to 0
        StringBuilder sum = new StringBuilder(); // StringBuilder to store the sum

        int i = a.length() - 1; // Pointer for traversing string a from right to left
        int j = b.length() - 1; // Pointer for traversing string b from right to left

        // Iterate until both strings are processed and there is no carry left
        while (i >= 0 || j >= 0 || carry > 0) {
            int digitA = (i >= 0) ? Character.getNumericValue(a.charAt(i)) : 0; // Get the digit from string a
            int digitB = (j >= 0) ? Character.getNumericValue(b.charAt(j)) : 0; // Get the digit from string b

            int total = digitA + digitB + carry; // Calculate the sum of digits and carry

            sum.insert(0, total % n); // Insert the remainder of the sum divided by n at the beginning of the sum string
            carry = total / n; // Update the carry by dividing the sum by n

            i--; // Move the pointer for string a to the left
            j--; // Move the pointer for string b to the left
        }

        return sum.toString(); // Return the final sum as a string
    }
}


/*
The two numbers were given in base n
eg) a = 123 b = 13 n = 4
o/p 202
*/

/*
Certainly! In the given example, the two numbers `a` and `b` are represented in base `n`, which means they are in a different number system other than the usual decimal system (base 10). The base `n` indicates the number of unique digits available in the number system.

Let's break down the example step by step:

1. The given numbers are:
    - `a` = 123
    - `b` = 13
    - `n` = 4 (base)

2. To perform addition in base `n`, we need to consider the place values of each digit. The rightmost digit has a place value of `n^0`, the next digit has a place value of `n^1`, and so on.

3. Starting from the rightmost digit, we add the corresponding digits of `a` and `b` along with any carry from the previous place value.

- For the rightmost digit:
    - Digit from `a`: 3
    - Digit from `b`: 3
    - Carry: 0 (initially)
    - Sum: 3 + 3 + 0 = 6 (in base 4)

- For the next digit:
    - Digit from `a`: 2
    - Digit from `b`: 1
    - Carry: 1 (from the previous place value)
    - Sum: 2 + 1 + 1 = 4 (in base 4)

- For the leftmost digit:
    - Digit from `a`: 1
    - Digit from `b`: 0
    - Carry: 0 (from the previous place value)
    - Sum: 1 + 0 + 0 = 1 (in base 4)

4. The resulting digits from each place value are combined to form the final sum in base `n`. In this case, the final sum is 202 (in base 4).

Therefore, the output is 202, which represents the sum of the numbers `a` and `b` in base 4.
*/