package Zoho.Round3.BankSystem;
import java.util.*;

class Customer {
    private String customerId;
    private String password;
    private double balance;
    private Map<String, GiftCard> giftCards;

    public Customer(String customerId, String password) {
        this.customerId = customerId;
        this.password = password;
        this.balance = 0.0;
        this.giftCards = new HashMap<>();
    }

    public String getCustomerId() {
        return customerId;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    public double getBalance() {
        return balance;
    }

    public void addBalance(double amount) {
        balance += amount;
    }

    public void subtractBalance(double amount) {
        balance -= amount;
    }

    public boolean hasGiftCard(String cardNumber) {
        return giftCards.containsKey(cardNumber);
    }

    public void addGiftCard(GiftCard giftCard) {
        giftCards.put(giftCard.getCardNumber(), giftCard);
    }

    public GiftCard getGiftCard(String cardNumber) {
        return giftCards.get(cardNumber);
    }

    public void deposit(double amount) {
    if (amount > 0) {
        balance += amount;
        System.out.println("Deposit successful. New main account balance: " + balance);
    } else {
        System.out.println("Invalid deposit amount.");
    }
}

}