package Zoho.Round2.Strings;

public class NumberToWords {
    
    private static final String[] UNITS = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] TEENS = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        int number = 333;
        System.out.println(convertToWords(number));
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero"; 
        }
        String words = ""; 
        if (number >= 100) { 
            words += UNITS[number / 100] + " Hundred "; 
            number %= 100; 
            if (number != 0) {
                words += "and ";
            }
        }
        if (number >= 20) { 
            words += TENS[number / 10]; 
            if (number % 10 != 0) {
                words += " " + UNITS[number % 10];
            }
        } else if (number >= 10) {
            words += TEENS[number - 10]; 
        } else if (number > 0) {
            words += UNITS[number]; 
        }
        return words;
    }
}



/*
To output the number in words (0-999)
Input: 234
Output: Two hundred and Thirty Four
 */