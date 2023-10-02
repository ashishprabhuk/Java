package Zoho.Round2.Arrays;

public class CurrencyCount {

    // Function to count and print currency notes
    public static void countCurrency(int amount) {
        // Array to store the available denominations of currency notes
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1};

        // Array to store the count of each denomination of currency notes
        int[] noteCounter = new int[notes.length];

        // Count notes using Greedy approach
        for (int i = 0; i < notes.length; i++) {
            if (amount >= notes[i]) {
                // Calculate how many notes of the current denomination can be used
                noteCounter[i] = amount / notes[i]; 
                // 2143 / 2000 = 1 => 143 / 100 = 1 => 43 / 20 = 2 => 3 / 1 = 3 ;

                // Update the remaining amount after using the current denomination
                amount = amount % notes[i];
                // 2143 % 2000 = 143 => 143 % 100 = 43 => 43 % 20 = 3 => 3 % 1 = 0 ;
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                // Print the denomination and the count of notes used
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }

    // Driver function
    public static void main(String argc[]) {
        int amount = 2143;
        countCurrency(amount);
    }
}

/*
 *  After calculating the count of notes for the current denomination, 
 * it updates the amount to the remainder left after using the current denomination. 
 * This is done using the modulo operator (%). For example, if amount was 2500, and 
 * the current denomination is 1000, amount will be updated to 500 (2500 % 1000).
 */
