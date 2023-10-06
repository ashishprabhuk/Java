package Zoho.Round2.Maths;
import java.util.HashMap;
import java.util.Map;

public class CurrencyAtm {
    private Map<Integer, Integer> notesCount;

    // Constructor to initialize the ATM with available notes and their counts.
    public CurrencyAtm() {
        notesCount = new HashMap<>();
        notesCount.put(1000, 10); // Number of 1000 rupee notes
        notesCount.put(500, 20);  // Number of 500 rupee notes
        notesCount.put(100, 50);  // Number of 100 rupee notes
        notesCount.put(50, 100);  // Number of 50 rupee notes
        notesCount.put(20, 200);  // Number of 20 rupee notes
        notesCount.put(10, 500);  // Number of 10 rupee notes
    }

    // Method to withdraw a specified amount from the ATM.
    public boolean withdrawAmount(int amount) {
        int remainingAmount = amount;

        int[] notes = {1000, 500, 100, 50, 20, 10}; // notes in  descending order.

        // Iterate through available note denominations in descending order.
        for (int note : notes) {
            int count = notesCount.getOrDefault(note, 0); // Get the count of available notes.
            int notesNeeded = remainingAmount / note;     // Calculate how many notes are needed for the amount.

            if (notesNeeded > count) {
                notesNeeded = count; // If there are fewer notes available than needed, take all available notes.
            }

            remainingAmount -= notesNeeded * note; // Deduct the amount covered by the withdrawn notes.
            notesCount.put(note, count - notesNeeded); // Update the count of available notes.

            // If the remainingAmount becomes zero, the withdrawal is successful.
        }

        return remainingAmount == 0;
    }

    public static void main(String[] args) {
        CurrencyAtm atm = new CurrencyAtm();

        int amount = 2350; // The amount to withdraw.
        boolean success = atm.withdrawAmount(amount);

        // Check if the withdrawal was successful and print the result.
        if (success) {
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("No sufficient amount in ATM!");
        }
    }
}
