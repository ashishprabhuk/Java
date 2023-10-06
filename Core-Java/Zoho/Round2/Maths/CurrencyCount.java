package Zoho.Round2.Maths;

public class CurrencyCount {

    // Function to count and print currency notes
    public static void countCurrency(int amount) {
        // Array to store the available denominations of currency notes
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 1};

        // Iterate through the denominations of currency notes
        for (int note : notes) {
            // Calculate how many notes of the current denomination can be used
            int count = amount / note;
            // Update the remaining amount after using the current denomination
            amount = amount % note;

            // Print the denomination and the count of notes used
            if (count != 0) {
                System.out.println(note + " : " + count);
            }
        }
    }

    // Driver function
    public static void main(String args[]) {
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


/*
* ATM Machine Problem given notes of 1000,
500, 100, 50, 20, 10(Number of notes given at the
starting point and we have to N transactions if
amount present return the amount present in ATM
decrease count of notes and if not present then
display “no sufficient amount”)
*/
