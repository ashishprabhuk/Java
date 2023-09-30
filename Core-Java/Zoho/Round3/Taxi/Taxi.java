package Zoho.Round3.Taxi;

import java.util.*;

class Taxi {
    private int id;
    private boolean booked;
    private char currentSpot;
    private int freeTime;
    private int totalEarnings;
    private List<String> trips;

    public Taxi(int id) {
        this.id = id;
        this.booked = false;
        this.currentSpot = 'A';
        this.freeTime = 6; // Taxi starts at 6 AM
        this.totalEarnings = 0;
        this.trips = new ArrayList<>();
    }

    public boolean isBooked() {
        return booked;
    }

    public int getId() {
        return id;
    }

    public char getCurrentSpot() {
        return currentSpot;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public int getTotalEarnings() {
        return totalEarnings;
    }

    public void book(char pickupPoint, char dropPoint, int pickupTime) {
        if (!booked) {
            int distance = Math.abs(pickupPoint - currentSpot) * 15; // Calculate distance in KM
            int earnings = 100 + Math.max(0, distance - 5) * 10; // Calculate earnings
            int dropTime = pickupTime + distance / 15; // Calculate drop time

            booked = true;
            currentSpot = dropPoint;
            freeTime = dropTime;
            totalEarnings += earnings;

            String tripDetails = String.format("From %c to %c | Pickup Time: %d | Drop Time: %d | Earnings: Rs.%d",
                    pickupPoint, dropPoint, pickupTime, dropTime, earnings);
            trips.add(tripDetails);

            System.out.println("Taxi-" + id + " is booked. Earnings: Rs." + earnings);
        } else {
            System.out.println("Taxi-" + id + " is already booked.");
        }
    }

    public void printTrips() {
        System.out.println("\nTaxi-" + id + " Trip History:");
        for (String trip : trips) {
            System.out.println(trip);
        }
    }
}

public class TaxiBookingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Taxi> taxis = new ArrayList<>();

        // Create 4 taxis
        for (int i = 1; i <= 4; i++) {
            taxis.add(new Taxi(i));
        }

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Book a Taxi");
            System.out.println("2. Print Taxi Details");
            System.out.println("3. Print Trip History");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter pickup point (A/B/C/D/E/F): ");
                char pickupPoint = sc.next().charAt(0);
                System.out.print("Enter drop point (A/B/C/D/E/F): ");
                char dropPoint = sc.next().charAt(0);
                System.out.print("Enter pickup time (in hours): ");
                int pickupTime = sc.nextInt();

                boolean taxiBooked = false;

                for (Taxi taxi : taxis) {
                    if (!taxi.isBooked() && taxi.getFreeTime() <= pickupTime) {
                        taxi.book(pickupPoint, dropPoint, pickupTime);
                        taxiBooked = true;
                        break;
                    }
                }

                if (!taxiBooked) {
                    System.out.println("No available taxis at the moment.");
                }
            } else if (choice == 2) {
                System.out.println("\nTaxi Details:");
                for (Taxi taxi : taxis) {
                    System.out.println("Taxi-" + taxi.getId() +
                            " | Current Spot: " + taxi.getCurrentSpot() +
                            " | Free Time: " + taxi.getFreeTime() +
                            " | Total Earnings: Rs." + taxi.getTotalEarnings());
                }
            } else if (choice == 3) {
                System.out.print("Enter Taxi ID: ");
                int taxiId = sc.nextInt();
                if (taxiId >= 1 && taxiId <= taxis.size()) {
                    taxis.get(taxiId - 1).printTrips();
                } else {
                    System.out.println("Invalid Taxi ID.");
                }
            } else if (choice == 4) {
                System.out.println("Exiting the program.");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
