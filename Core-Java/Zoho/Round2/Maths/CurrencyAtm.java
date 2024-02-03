package Zoho.Round2.Maths;
import java.util.HashMap;
import java.util.Map;
public class CurrencyAtm {
    private int[] notesCount; // Array to store note counts

    public CurrencyAtm() {
        notesCount = new int[]{10, 20, 50, 100, 200, 500};
    }

    public boolean withdrawAmount(int amount) {
        int remainingAmount = amount;

        int[] notes = {1000, 500, 100, 50, 20, 10};
        for (int i = 0; i < notes.length; i++) {
            int notesNeeded = remainingAmount / notes[i];
            if (notesNeeded > notesCount[i]) {
                notesNeeded = notesCount[i]; // Use available notes if needed notes exceed count
            }
            remainingAmount -= notesNeeded * notes[i]; // Update remaining amount
            notesCount[i] -= notesNeeded; // Update note count
        }
        return remainingAmount == 0; // Return true if amount is fully withdrawn
    }

    public static void main(String[] args) {
        CurrencyAtm atm = new CurrencyAtm();
        int amount = 2350;
        boolean success = atm.withdrawAmount(amount);
        if (success) {
            System.out.println("Amount withdrawn successfully!");
        } else {
            System.out.println("Not enough currency notes in ATM!");
        }
    }
}

// public class CurrencyAtm {
//     private Map<Integer, Integer> notesCount;

//     public CurrencyAtm() {
//         notesCount = new HashMap<>();
//         notesCount.put(1000, 10); 
//         notesCount.put(500, 20);  
//         notesCount.put(100, 50);
//         notesCount.put(50, 100);
//         notesCount.put(20, 200);  
//         notesCount.put(10, 500);  
//     }
//     public boolean withdrawAmount(int amount) {
//         int remainingAmount = amount;

//         int[] notes = {1000, 500, 100, 50, 20, 10}; 
//         for (int note : notes) {
//             int count = notesCount.getOrDefault(note, 0); 
//             int notesNeeded = remainingAmount / note; 
//             if (notesNeeded > count) {
//                 notesNeeded = count;
//             }
//             remainingAmount -= notesNeeded * note; 
//             notesCount.put(note, count - notesNeeded); 
//         }
//         return remainingAmount == 0;
//     }

//     public static void main(String[] args) {
//         CurrencyAtm atm = new CurrencyAtm();
//         int amount = 2350;
//         boolean success = atm.withdrawAmount(amount);
//         if (success) {
//             System.out.println("Amount withdrawn successfully!");
//         } else {
//             System.out.println("No sufficient amount in ATM!");
//         }
//     }
// }