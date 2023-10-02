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
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int decimalValue = 0;
        int prevValue = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            char currentChar = s.charAt(i);
            int currentValue = romanMap.get(currentChar);

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

