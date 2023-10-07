package Zoho.Round2.Strings;

import java.util.HashMap;

public class RomanToDecimal {
    public static void main(String[] args) {
        String romanNumeral1 = "III"; // Should return 3
        String romanNumeral2 = "IV";  // Should return 4
        String romanNumeral3 = "IX";  // Should return 9
        String romanNumeral4 = "LVIII"; // Should return 58
        String romanNumeral5 = "MCMXCIV"; // Should return 1994

        System.out.println(romanToDecimal(romanNumeral1));
        System.out.println(romanToDecimal(romanNumeral2));
        System.out.println(romanToDecimal(romanNumeral3));
        System.out.println(romanToDecimal(romanNumeral4));
        System.out.println(romanToDecimal(romanNumeral5));
    }

    public static int romanToDecimal(String s) {
        HashMap<Character, Integer> roman = new HashMap<>();
        roman.put('I', 1);
        roman.put('V', 5);
        roman.put('X', 10);
        roman.put('L', 50);
        roman.put('C', 100);
        roman.put('D', 500);
        roman.put('M', 1000);

        int decimalValue = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = roman.get(currentChar);

            if (currentValue < prevValue) {
                decimalValue -= currentValue;
            } else {
                decimalValue += currentValue;
            }
            prevValue = currentValue;
        }
        return decimalValue;
    }
}

/*
Given a Roman numeral, the task is to find its corresponding decimal value.

Example : 

Input: IX
Output: 9
IX is a Roman symbol which represents 9 

Input: XL
Output: 40
XL is a Roman symbol which represents 40

Input: MCMIV
Output: 1904
M is a thousand, 
CM is nine hundred and 
IV is four
 */