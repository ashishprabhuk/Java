package Zoho.Round3.Taxi;
import java.util.*;

// Taxi class represents a taxi with its attributes and methods
class Taxi {
    private int id;
    private boolean booked;
    private char currentSpot;
    private int freeTime;
    private int totalEarnings;
    private List<String> trips;

    // Constructor initializes taxi attributes
    public Taxi(int id) {
        this.id = id;
        this.booked = false;
        this.currentSpot = 'A';
        this.freeTime = 6; // Taxi starts at 6 AM
        this.totalEarnings = 0;
        this.trips = new ArrayList<>(); // List to store trip details
    }

    // Getter methods
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

    // Method to book a taxi for a trip
    public void book(char pickupPoint, char dropPoint, int pickupTime) {
        if (!booked) {
            // Calculate distance in kilometers
            int distance = Math.abs(pickupPoint - currentSpot) * 15;
            // Calculate earnings based on distance
            int earnings = 100 + Math.max(0, distance - 5) * 10;
            // Calculate drop time
            int dropTime = pickupTime + distance / 15;

            // Update taxi's attributes after booking
            booked = true;
            currentSpot = dropPoint;
            freeTime = dropTime;
            totalEarnings += earnings;

            // Create a trip details string and add it to the trips list
            String tripDetails = String.format("From %c to %c | Pickup Time: %d | Drop Time: %d | Earnings: Rs.%d",
                    pickupPoint, dropPoint, pickupTime, dropTime, earnings);
            trips.add(tripDetails);

            System.out.println("Taxi-" + id + " is booked. Earnings: Rs." + earnings);
        } else {
            System.out.println("Taxi-" + id + " is already booked.");
        }
    }

    // Method to print the trip history of a taxi
    public void printTrips() {
        System.out.println("\nTaxi-" + id + " Trip History:");
        for (String trip : trips) {
            System.out.println(trip);
        }
    }
}