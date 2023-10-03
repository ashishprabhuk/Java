package Zoho.Round3.BankSystem;
import java.util.*;

class GiftCard {
    // Private instance variables to store card details and balance.
    private String cardNumber;
    private String pin;
    private double balance;
    private List<Transaction> transactions; // List to store transaction history.

    // Constructor to initialize a GiftCard object with card number and PIN.
    public GiftCard(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = 0.0; // Initialize balance to 0.
        this.transactions = new ArrayList<>(); // Initialize an empty list for transactions.
    }

    // Getter method for retrieving the card number.
    public String getCardNumber() {
        return cardNumber;
    }

    // Getter method for retrieving the PIN.
    public String getPin() {
        return pin;
    }

    // Getter method for retrieving the balance.
    public double getBalance() {
        return balance;
    }

    // Method to add money to the gift card (top-up).
    public void topUp(double amount) {
        balance += amount; // Increase the balance by the specified amount.
        transactions.add(new Transaction("Top-up", amount)); // Add a new transaction to the history.
    }

    // Method to make a purchase with the gift card.
    public void purchase(double amount) {
        if (amount <= balance) { // Check if there's enough balance for the purchase.
            balance -= amount; // Deduct the purchase amount from the balance.
            transactions.add(new Transaction("Purchase", -amount)); // Add a purchase transaction.

            // Calculate and add reward points if applicable.
            int rewardPoints = (int) (amount / 100);
            if (rewardPoints >= 10) {
                balance += 10; // Add 10 reward points to the balance.
                transactions.add(new Transaction("Reward Points", 10)); // Add a reward points transaction.
            }
        } else {
            System.out.println("Insufficient balance on gift card.");
        }
    }

    // Method to retrieve the transaction history.
    public List<Transaction> getTransactionHistory() {
        return transactions; // Return the list of transactions.
    }
}
