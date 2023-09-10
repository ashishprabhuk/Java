package Encapsulation;

// Define a class named BankAccount
class BankAccount {
    // Private instance variables (attributes)
    private String accountNumber; // Encapsulated account number
    private double balance;       // Encapsulated balance

    // Constructor to initialize the BankAccount object
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber; // Set the account number
        // Check if the initial balance is non-negative
        if (initialBalance >= 0) {
            this.balance = initialBalance; // Set the balance if it's valid
        } else {
            System.out.println("Initial balance cannot be negative.");
        }
    }

    // Public getter method to retrieve the account number
    public String getAccountNumber() {
        return accountNumber;
    }

    // Public getter method to retrieve the balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money into the account
    public void deposit(double amount) {
        // Check if the deposit amount is positive
        if (amount > 0) {
            balance += amount; // Add the amount to the balance
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Public method to withdraw money from the account
    public void withdraw(double amount) {
        // Check if the withdrawal amount is positive and doesn't exceed the balance
        if (amount > 0 && amount <= balance) {
            balance -= amount; // Subtract the amount from the balance
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("12345", 1000);

        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        account.deposit(500.0);
        System.out.println("New Balance after Deposit: " + account.getBalance());

        account.withdraw(200.0);
        System.out.println("New Balance after Withdrawal: " + account.getBalance());
    }
}
