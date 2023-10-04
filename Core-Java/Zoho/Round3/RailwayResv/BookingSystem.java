package Zoho.Round3.RailwayResv;
import java.util.*;

public class BookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Trains train = new Trains(); // Create a Trains object to manage bookings

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Train Ticket Booking System");
            System.out.println("1. Book Ticket");
            System.out.println("2. Cancel Ticket");
            System.out.println("3. View Passengers");
            System.out.println("4. View RAC Passengers");
            System.out.println("5. View Waiting List");
            System.out.println("6. Print");
            System.out.println("7. Unavailable seats");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Passenger Age: ");
                    int age = sc.nextInt();
                    sc.nextLine(); // Consume newline
                    System.out.print("Enter Berth Preference (L/M/U): ");
                    String berthPreference = sc.nextLine().toUpperCase();

                    Passenger passenger = new Passenger(name, age, berthPreference); // Create a Passenger object

                    if (train.bookTicket(passenger)) { // Try to book the ticket
                        System.out.println("Ticket booked successfully!");
                    } else {
                        System.out.println("Sorry, no tickets available.");
                    }
                    break;

                case 2:
                    System.out.print("Enter Passenger ID to cancel ticket: ");
                    int passengerId = sc.nextInt();

                    if (train.cancelTicket(passengerId)) { // Try to cancel the ticket
                        System.out.println("Ticket canceled successfully!");
                    } else {
                        System.out.println("Passenger not found or no tickets to cancel.");
                    }
                    break;

                case 3:
                    List<Passenger> bookedPassengers = train.getPassengers();
                    System.out.println("List of Booked Passengers:");
                    for (Passenger p : bookedPassengers) {
                        System.out.println(p); // Display details of booked passengers
                    }
                    break;

                case 4:
                    List<Passenger> racPassengers = train.getRACPassengers();
                    System.out.println("List of RAC Passengers:");
                    for (Passenger p : racPassengers) {
                        System.out.println(p); // Display details of RAC passengers
                    }
                    break;

                case 5:
                    List<Passenger> waitingList = train.getWaitingList();
                    System.out.println("Waiting List:");
                    for (Passenger p : waitingList) {
                        System.out.println(p); // Display details of passengers on the waiting list
                    }
                    break;

                case 6:
                    System.out.println("Printing the tickets.");
                    train.printBookedTickets(); // Exit the program
                    break;
                case 7:
                    System.out.println("Printing the unavailable seats.");
                    train.printAvailableTickets(); // Exit the program
                    break;
                case 8:
                    System.out.println("Exiting the program.");
                    sc.close(); // Close the scanner
                    System.exit(0); // Exit the program
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
