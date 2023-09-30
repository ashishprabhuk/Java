package Zoho.Round3.RailwayResv; // Package declaration

import java.util.*;

class Trains {
    private static final int MAX_SEATS = 63; // Maximum total seats
    private static final int MAX_RAC = 18;   // Maximum RAC (Reserved Against Cancellation) seats
    private static final int MAX_WL = 10;    // Maximum WL (Waiting List) seats

    private List<Passenger> passengers = new ArrayList<>(MAX_SEATS);  // List of booked passengers
    private List<Passenger> racPassengers = new ArrayList<>(MAX_RAC); // List of RAC passengers
    private List<Passenger> waitingList = new ArrayList<>(MAX_WL);     // List of passengers on the waiting list

    // Method to book a ticket for a passenger
    public boolean bookTicket(Passenger passenger) {
        if (passengers.size() < MAX_SEATS) {
            passenger.setStatus("L"); // Default to Lower Berth
            passengers.add(passenger);
            return true; // Ticket booked successfully
        } else if (racPassengers.size() < MAX_RAC) {
            passenger.setStatus("RAC");
            racPassengers.add(passenger);
            return true; // Ticket booked as RAC
        } else if (waitingList.size() < MAX_WL) {
            passenger.setStatus("WL");
            waitingList.add(passenger);
            return true; // Ticket added to the waiting list
        } else {
            return false; // No more tickets available
        }
    }

    // Method to cancel a ticket by passenger ID
    public boolean cancelTicket(int passengerId) {
        Passenger passengerToRemove = null;

        for (Passenger passenger : passengers) {
            if (passenger.getId() == passengerId) {
                passengerToRemove = passenger;
                break;
            }
        }

        if (passengerToRemove != null) {
            passengers.remove(passengerToRemove); // Remove passenger from booked list
            promoteFromRAC(); // Promote an RAC passenger to booked
            return true; // Ticket canceled successfully
        }

        return false; // Passenger not found or no tickets to cancel
    }

    // Getter method to retrieve the list of booked passengers
    public List<Passenger> getPassengers() {
        return passengers;
    }

    // Getter method to retrieve the list of RAC passengers
    public List<Passenger> getRACPassengers() {
        return racPassengers;
    }

    // Getter method to retrieve the list of passengers on the waiting list
    public List<Passenger> getWaitingList() {
        return waitingList;
    }

    // Method to promote a passenger from RAC to booked if there's space
    private void promoteFromRAC() {
        if (!racPassengers.isEmpty()) {
            Passenger promotedPassenger = racPassengers.remove(0); // Get the first RAC passenger
            promotedPassenger.setStatus("L"); // Promote to Lower Berth
            passengers.add(promotedPassenger); // Add to booked passengers
        }
    }
}
