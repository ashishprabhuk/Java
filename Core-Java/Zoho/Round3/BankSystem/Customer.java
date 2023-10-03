package Zoho.Round3.BankSystem;
import java.util.*;

class Customer {
    // Private member variables to store customer information
    private String customerId;
    private String password;
    private double balance;
    private Map<String, GiftCard> giftCards;

    // Constructor to initialize a Customer object with customerId and password
    public Customer(String customerId, String password) {
        this.customerId = customerId;
        this.password = password;
        this.balance = 0.0;  // Initialize the main account balance to 0
        this.giftCards = new HashMap<>();  // Initialize an empty HashMap to store gift cards
    }

    // Getter method to retrieve the customer's ID
    public String getCustomerId() {
        return customerId;
    }

    // Method to authenticate the customer by checking the provided password
    public boolean authenticate(String password) {
        return this.password.equals(password);
    }

    // Getter method to retrieve the main account balance
    public double getBalance() {
        return balance;
    }

    // Method to add funds to the main account balance
    public void addBalance(double amount) {
        balance += amount;
    }

    // Method to subtract funds from the main account balance
    public void subtractBalance(double amount) {
        balance -= amount;
    }

    // Method to check if the customer has a gift card with a specific card number
    public boolean hasGiftCard(String cardNumber) {
        return giftCards.containsKey(cardNumber);
    }

    // Method to add a gift card to the customer's collection
    public void addGiftCard(GiftCard giftCard) {
        giftCards.put(giftCard.getCardNumber(), giftCard);
    }

    // Method to retrieve a gift card by its card number
    public GiftCard getGiftCard(String cardNumber) {
        return giftCards.get(cardNumber);
    }

    // Method to deposit funds into the main account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New main account balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
