package Zoho.Round3.BankSystem;
import java.util.*;

public class BankingSystem {
    private static Map<String, Customer> customers = new HashMap<>(); // Stores customer data using their unique IDs as keys.
    private static Scanner scanner = new Scanner(System.in); // Scanner for user input.
    private static Customer activeCustomer = null; // Stores the currently logged-in customer.

    public static void main(String[] args) {

        // Adding some sample customers to the system.
        customers.put("C1", new Customer("C1", "PW1"));
        customers.put("C2", new Customer("C2", "PW2"));

        while (true) {
            System.out.println("Welcome to the Banking System!");
            System.out.println("1. Account Login");
            System.out.println("2. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    login(); // Call the login function.
                    break;
                case 2:
                    System.out.println("Thank you for using our Banking System!");
                    // System.exit(0); // Exit the program.
                    return; // Exit the program.
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void login() {
        System.out.print("Enter your Customer ID: ");
        String customerId = scanner.nextLine();
        System.out.print("Enter your Password: ");
        String password = scanner.nextLine();

        // Check if the entered customer ID exists and the password is correct.
        if (customers.containsKey(customerId) && customers.get(customerId).authenticate(password)) {
            activeCustomer = customers.get(customerId);
            System.out.println("Login successful!");

            while (activeCustomer != null) {
                System.out.println("------------------------------");
                System.out.println("1. Create Gift Card");
                System.out.println("2. TopUp");
                System.out.println("3. Transaction History");
                System.out.println("4. Block");
                System.out.println("5. Deposit Funds");
                System.out.println("6. Logout");
                System.out.print("Enter your choice: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        createGiftCard(); // Call the createGiftCard function.
                        break;
                    case 2:
                        topUpGiftCard(); // Call the topUpGiftCard function.
                        break;
                    case 3:
                        viewTransactionHistory(); // Call the viewTransactionHistory function.
                        break;
                    case 4:
                        blockGiftCard(); // Call the blockGiftCard function.
                        break;
                    case 5:
                        depositFunds(); // Call the depositFunds function.
                        break;
                    case 6:
                        logout(); // Call the logout function.
                        return; // Exit the login loop
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Login failed. Invalid credentials.");
        }
    }

    private static void createGiftCard() {
        System.out.print("Enter a 5-digit Card Number: ");
        String cardNumber = scanner.nextLine();
        System.out.print("Enter a 4-digit PIN: ");
        String pin = scanner.nextLine();

        boolean isCardNumberUnique = true;
        for (Customer customer : customers.values()) {
            if (customer.hasGiftCard(cardNumber)) {
                isCardNumberUnique = false;
                break;
            }
        }

        if (isCardNumberUnique) {
            activeCustomer.addGiftCard(new GiftCard(cardNumber, pin));
            System.out.println("Gift Card created successfully.");
        } else {
            System.out.println("Card Number is already in use. Please choose a different one.");
        }
    }

    private static void topUpGiftCard() {
        System.out.print("Enter the 5-digit Card Number to top-up: ");
        String cardNumber = scanner.nextLine();

        if (activeCustomer.hasGiftCard(cardNumber)) {
            GiftCard giftCard = activeCustomer.getGiftCard(cardNumber);
            System.out.print("Enter the amount to top-up: ");
            double amount = scanner.nextDouble();

            if (amount > 0) {
                if (activeCustomer.getBalance() >= amount) {
                    activeCustomer.subtractBalance(amount);
                    giftCard.topUp(amount);
                    System.out.println("Top-up successful.");
                } else {
                    System.out.println("Insufficient balance in your main account.");
                }
            } else {
                System.out.println("Invalid top-up amount.");
            }
        } else {
            System.out.println("Gift Card not found.");
        }
    }

    private static void depositFunds() {
        System.out.print("Enter the amount to deposit: ");
        double amount = scanner.nextDouble();
    
        if (amount > 0) {
            activeCustomer.addBalance(amount);
            System.out.println("Deposit successful. New main account balance: " + activeCustomer.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    private static void viewTransactionHistory() {
        System.out.print("Enter the 5-digit Card Number to view transaction history: ");
        String cardNumber = scanner.nextLine();

        if (activeCustomer.hasGiftCard(cardNumber)) {
            GiftCard giftCard = activeCustomer.getGiftCard(cardNumber);
            List<Transaction> transactions = giftCard.getTransactionHistory();

            if (!transactions.isEmpty()) {
                System.out.println("Transaction History for Card Number " + cardNumber + ":");
                for (Transaction transaction : transactions) {
                    System.out.println(transaction.getDescription() + ": " + transaction.getAmount());
                }
            } else {
                System.out.println("No transactions found for this gift card.");
            }
        } else {
            System.out.println("Gift Card not found.");
        }
    }

    private static void blockGiftCard() {
        System.out.print("Enter the 5-digit Card Number to block: ");
        String cardNumber = scanner.nextLine();

        if (activeCustomer.hasGiftCard(cardNumber)) {
            GiftCard giftCard = activeCustomer.getGiftCard(cardNumber);
            double balance = giftCard.getBalance();
            activeCustomer.addBalance(balance);
            giftCard = null; // Remove reference to the gift card
            System.out.println("Gift Card blocked. Balance transferred to main account.");
        } else {
            System.out.println("Gift Card not found.");
        }
    }

    private static void logout() {
        activeCustomer = null; // Log out the active customer.
        System.out.println("Logged out successfully.");
    }
}
