package Zoho.Round3.BankSystem;
import java.util.*;

class GiftCard {
    private String cardNumber;
    private String pin;
    private double balance;
    private List<Transaction> transactions;

    public GiftCard(String cardNumber, String pin) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void topUp(double amount) {
        balance += amount;
        transactions.add(new Transaction("Top-up", amount));
    }

    public void purchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            transactions.add(new Transaction("Purchase", -amount));
            int rewardPoints = (int) (amount / 100);
            if (rewardPoints >= 10) {
                balance += 10;
                transactions.add(new Transaction("Reward Points", 10));
            }
        } else {
            System.out.println("Insufficient balance on gift card.");
        }
    }

    public List<Transaction> getTransactionHistory() {
        return transactions;
    }
}