package Zoho.Round3.Flight;
import java.util.*;

public class Flight {
    static int idCounter = 1;
    int flightID;
    int availableTickets;
    int ticketPrice;
    ArrayList<Passenger> passengers;

    public Flight() {
        flightID = idCounter++;
        availableTickets = 50;
        ticketPrice = 5000;
        passengers = new ArrayList<>();
    }

    public void bookTicket(Passenger passenger, int numberOfTickets) {
        if (numberOfTickets <= availableTickets) {
            passengers.add(passenger);
            availableTickets -= numberOfTickets;
            ticketPrice += 200 * numberOfTickets;
            System.out.println("Booking successful for Flight ID " + flightID);
        } else {
            System.out.println("Not enough tickets available for Flight ID " + flightID);
        }
    }

    public void cancelTicket(Passenger passenger) {
        int numberOfTicketsBooked = 0;
        for (Passenger p : passengers) {
            if (p.id == passenger.id) {
                numberOfTicketsBooked++;
            }
        }

        if (numberOfTicketsBooked > 0) {
            int refundAmount = numberOfTicketsBooked * 200;
            passengers.remove(passenger);
            availableTickets += numberOfTicketsBooked;
            ticketPrice -= refundAmount;
            System.out.println("Cancellation successful for Flight ID " + flightID + ". Refund amount: " + refundAmount);
        } else {
            System.out.println("No tickets booked for Passenger ID " + passenger.id + " on Flight ID " + flightID);
        }
    }

    public void flightSummary() {
        System.out.println("Flight ID: " + flightID + " - Available Tickets: " + availableTickets + " - Ticket Price: " + ticketPrice);
    }

    public void printPassengerDetails() {
        if (passengers.size() > 0) {
            System.out.println("Passenger Details for Flight ID " + flightID + ":");
            for (Passenger passenger : passengers) {
                System.out.println("Passenger ID: " + passenger.id + " - Name: " + passenger.name);
            }
        } else {
            System.out.println("No passengers booked for Flight ID " + flightID);
        }
    }
}