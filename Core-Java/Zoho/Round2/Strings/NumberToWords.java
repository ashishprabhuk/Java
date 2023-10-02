package Zoho.Round2.Strings;

public class NumberToWords {
    private static final String[] units = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"
    };

    private static final String[] teens = {
        "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] tens = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"
    };

    public static void main(String[] args) {
        int number = 234;
        System.out.println(convertToWords(number));
    }

    public static String convertToWords(int number) {
        if (number == 0) {
            return "Zero"; // Special case: If the number is 0, return "Zero."
        }

        StringBuilder words = new StringBuilder(); // To build the word representation of the number.

        // Handle hundreds
        if (number >= 100) {
            words.append(units[number / 100]).append(" Hundred and "); // Append the hundreds place.
            number %= 100; // Remove the hundreds from the number.
        }

        // Handle tens and units
        if (number >= 20) {
            words.append(tens[number / 10]); // Append the tens place (e.g., "Twenty").
            if (number % 10 != 0) {
                words.append(" ").append(units[number % 10]); // Append the units place if it's not zero.
            }
        } else if (number >= 10) {
            words.append(teens[number - 10]); // Handle numbers in the teens (e.g., "Ten" to "Nineteen").
        } else if (number > 0) {
            words.append(units[number]); // Handle single-digit numbers.
        }

        return words.toString(); // Convert the StringBuilder to a String and return the word representation.
    }
}


