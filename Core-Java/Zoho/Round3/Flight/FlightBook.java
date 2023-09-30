package Zoho.Round3.Flight;
import java.util.*;

public class FlightBook {
    public static void main(String[] args) {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight());
        flights.add(new Flight());

        ArrayList<Passenger> passengers = new ArrayList<>();
        int passengerID = 1;

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("1. Book 2. Cancel 3. Print 4. Search Flights 5. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter Flight ID: ");
                    int flightID = sc.nextInt();
                    if (flightID >= 1 && flightID <= flights.size()) {
                        Flight flight = flights.get(flightID - 1);
                        System.out.println("Enter Passenger Name: ");
                        String passengerName = sc.next();
                        Passenger passenger = new Passenger(passengerID++, passengerName);
                        System.out.println("Enter Number of Tickets: ");
                        int numberOfTickets = sc.nextInt();
                        sc.nextLine();
                        flight.bookTicket(passenger, numberOfTickets);
                        passengers.add(passenger);
                    } else {
                        System.out.println("Invalid Flight ID.");
                    }
                    break;

                case 2:
                    System.out.println("Enter Passenger ID: ");
                    int cancelPassengerID = sc.nextInt();
                    Passenger passengerToRemove = null;
                    for (Passenger p : passengers) {
                        if (p.id == cancelPassengerID) {
                            passengerToRemove = p;
                            break;
                        }
                    }
                    if (passengerToRemove != null) {
                        System.out.println("Enter Flight ID: ");
                        int cancelFlightID = sc.nextInt();
                        if (cancelFlightID >= 1 && cancelFlightID <= flights.size()) {
                            Flight flightToCancel = flights.get(cancelFlightID - 1);
                            flightToCancel.cancelTicket(passengerToRemove);
                            passengers.remove(passengerToRemove);
                        } else {
                            System.out.println("Invalid Flight ID.");
                        }
                    } else {
                        System.out.println("Passenger ID not found.");
                    }
                    break;

                case 3:
                    for (Flight flight : flights) {
                        flight.flightSummary();
                        flight.printPassengerDetails();
                    }
                    break;

                case 4:
                    System.out.println("Enter Passenger Name to search for flights: ");
                    String searchName = sc.next();
                    System.out.println("Flights for Passenger " + searchName + ":");
                    for (Flight flight : flights) {
                        for (Passenger passenger : flight.passengers) {
                            if (passenger.name.equalsIgnoreCase(searchName)) {
                                System.out.println("Flight ID: " + flight.flightID);
                                break;
                            }else{
                                System.out.println("Invalid Name");
                            }
                        }
                    }
                    break;

                case 5:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

