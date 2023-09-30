package Zoho.Round3.BusResv;
import java.util.*;

public class BusMain {
    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<>();
        buses.add(new Bus(1, true, 2));

        ArrayList<Booking> bookings = new ArrayList<>();

        int userChoice;
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Choose an option:");
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel a booking");
            System.out.println("3. Print booked tickets");
            System.out.println("4. Exit");
            System.out.println("--------------------------------");

            userChoice = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            switch (userChoice) {
                case 1:
                    System.out.println("Booking...");
                    Booking booking = new Booking();
                    if (booking.isAvailable(bookings, buses)) {
                        bookings.add(booking);
                        System.out.println("Your booking is confirmed");
                    } else {
                        System.out.println("Sorry, the bus is full. Try a different bus or date.");
                    }
                    break;
                case 2:
                    System.out.println("Enter passenger name to cancel booking:");
                    String passengerName = sc.nextLine();
                    boolean canceled = Booking.cancelBooking(bookings, passengerName);
                    if (canceled) {
                        System.out.println("Booking canceled successfully.");
                    } else {
                        System.out.println("No booking found with the provided passenger name.");
                    }
                    break;
                case 3:
                    Booking.printTickets(bookings);
                    break;
                case 4:
                    System.out.println("Exited");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
