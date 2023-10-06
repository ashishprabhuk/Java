package Zoho.Round2.Maths;

class GetNumericalValues {
    public static void main(String[] args) {
        char ch1 = '9';
        char ch2 = 'A';
        char ch3 = ' ';

        int numericValue1 = Character.getNumericValue(ch1);
        int numericValue2 = Character.getNumericValue(ch2);
        int numericValue3 = Character.getNumericValue(ch3);

        System.out.println("Numeric value of " + ch1 + ": " + numericValue1);
        System.out.println("Numeric value of " + ch2 + ": " + numericValue2);
        System.out.println("Numeric value of " + ch3 + ": " + numericValue3);
    }
}
class GetNumericalValue {
    public static void main(String[] args) {
        char ch1 = '7'; // A numeric character
        char ch2 = 'A'; // Not a numeric character

        // Get the numerical value of ch1
        int numericValue1 = Character.getNumericValue(ch1);
        System.out.println("Numeric value of '" + ch1 + "': " + numericValue1);

        // Get the numerical value of ch2
        int numericValue2 = Character.getNumericValue(ch2);
        System.out.println("Numeric value of '" + ch2 + "': " + numericValue2);

        // Check if the character is a valid numeric character
        if (numericValue1 != -1) {
            System.out.println("'" + ch1 + "' is a valid numeric character.");
        } else {
            System.out.println("'" + ch1 + "' is not a valid numeric character.");
        }

        if (numericValue2 != -1) {
            System.out.println("'" + ch2 + "' is a valid numeric character.");
        } else {
            System.out.println("'" + ch2 + "' is not a valid numeric character.");
        }
    }
}

/*
to find the numerical value of a character using the Character.getNumericValue(char ch) method 
from the Character class. This method returns the numeric value of the character as an int type.
 */