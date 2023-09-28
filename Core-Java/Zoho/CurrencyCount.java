package Zoho;

public class CurrencyCount {

    // Function to count and print currency notes
    public static void countCurrency(int amount) {
        // Array to store the available denominations of currency notes
        int[] notes = new int[]{2000, 500, 200, 100, 50, 20, 10, 5, 1};

        // Array to store the count of each denomination of currency notes
        int[] noteCounter = new int[9];

        // Count notes using Greedy approach
        for (int i = 0; i < 9; i++) {
            if (amount >= notes[i]) {
                // Calculate how many notes of the current denomination can be used
                noteCounter[i] = amount / notes[i];

                // Update the remaining amount after using the current denomination
                amount = amount % notes[i];
            }
        }

        // Print notes
        System.out.println("Currency Count ->");
        for (int i = 0; i < 9; i++) {
            if (noteCounter[i] != 0) {
                // Print the denomination and the count of notes used
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }
    }

    // Driver function
    public static void main(String argc[]) {
        int amount = 868;
        countCurrency(amount);
    }
}

