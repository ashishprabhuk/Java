package Zoho.Round2.Strings;

public class NumberToWords {
    
    private static final String[] UNITS = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] TEENS = {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] TENS = {"", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static void main(String[] args) {
        int number = 317;
        System.out.println(convertToWords(number));
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero"; 
        }
        String words = ""; 
        if (number >= 100) { 
            words += UNITS[number / 100] + " Hundred "; // 333/100 = 3 => three hundred
            number %= 100; // 333%100 = 33
            if (number != 0) {
                words += "and ";
            }
        }
        if (number >= 20) { 
            words += TENS[number / 10];  // 33/10 = 3 => thirty
            if (number % 10 != 0) {
                words += " " + UNITS[number % 10]; // units[33%10] = units[3] = three
            }
        } else if (number >= 10) {
            words += TEENS[number - 10]; // 17-10 = 7 => seventeen
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