package Zoho.Round3.BankSystem;

class Transaction { // Definition of the Transaction class

    // Private instance variables to store transaction information
    private String description; // A description of the transaction
    private double amount; // The amount involved in the transaction

    // Constructor to initialize a Transaction object
    public Transaction(String description, double amount) {
        this.description = description; // Set the description from the provided argument
        this.amount = amount; // Set the amount from the provided argument
    }

    // Getter method to retrieve the description of the transaction
    public String getDescription() {
        return description; // Return the stored description
    }

    // Getter method to retrieve the amount of the transaction
    public double getAmount() {
        return amount; // Return the stored amount
    }
}
