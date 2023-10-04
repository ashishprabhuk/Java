package Zoho.Round3.RailwayResv;
import java.util.*;

class Trains {
    private static final int MAX_SEATS = 63; 
    private static final int MAX_RAC = 18;   
    private static final int MAX_WL = 10;    

    private List<Passenger> passengers = new ArrayList<>();
    private List<Passenger> racPassengers = new ArrayList<>();
    private List<Passenger> waitingList = new ArrayList<>();

    // Method to book a train ticket for a passenger
    public boolean bookTicket(Passenger passenger) {
        // Check if there are available berths based on preference
        if (passengers.size() < MAX_SEATS) {
            if (passenger.getBerthPreference().equals("L") && countBerthPreference("L") < 7) {
                passenger.setStatus("L");
            } else if (passenger.getBerthPreference().equals("M") && countBerthPreference("M") < 7) {
                passenger.setStatus("M");
            } else if (passenger.getBerthPreference().equals("U") && countBerthPreference("U") < 7) {
                passenger.setStatus("U");
            } else {
                passenger.setStatus("L"); // Default to Lower Berth if preference is full
            }
            
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
            passengers.remove(passengerToRemove);
            promoteFromRAC();
            moveFromWaitingListToRAC();
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
            Passenger promotedPassenger = racPassengers.remove(0);
            promotedPassenger.setStatus("L");
            passengers.add(promotedPassenger);
        }
    }

    // Method to move a passenger from the waiting list to RAC if there's space
    public void moveFromWaitingListToRAC() {
        if (!waitingList.isEmpty() && racPassengers.size() < MAX_RAC) {
            Passenger passengerToMove = waitingList.remove(0);
            passengerToMove.setStatus("RAC");
            racPassengers.add(passengerToMove);
        }
    }

    // Method to print all booked tickets and the total number of filled tickets
    public void printBookedTickets() {
        System.out.println("List of Booked Tickets:");
        int totalFilledTickets = 0;

        // Print booked passengers
        for (Passenger passenger : passengers) {
            System.out.println(passenger);
            totalFilledTickets++;
        }

        // Print RAC passengers
        for (Passenger passenger : racPassengers) {
            System.out.println(passenger);
            totalFilledTickets++;
        }

        System.out.println("Total number of filled tickets: " + totalFilledTickets);
    }

    // Method to print all available (unoccupied) tickets and the total number of unoccupied tickets
    public void printAvailableTickets() {
        System.out.println("List of Available (Unoccupied) Tickets:");
        int totalAvailableTickets = 0;

        // Print available (unoccupied) seats
        if (passengers.size() < MAX_SEATS) {
            for (int i = passengers.size() + 1; i <= MAX_SEATS; i++) {
                System.out.println("Seat Number: " + i + " - Status: L (Lower Berth)");
                totalAvailableTickets++;
            }
        }

        // Print available (unoccupied) RAC seats
        if (racPassengers.size() < MAX_RAC) {
            for (int i = racPassengers.size() + 1; i <= MAX_RAC; i++) {
                System.out.println("RAC Seat Number: " + i);
                totalAvailableTickets++;
            }
        }

        // Print available (unoccupied) waiting list seats
        if (waitingList.size() < MAX_WL) {
            for (int i = waitingList.size() + 1; i <= MAX_WL; i++) {
                System.out.println("Waiting List Seat Number: " + i);
                totalAvailableTickets++;
            }
        }

        System.out.println("Total number of available (unoccupied) tickets: " + totalAvailableTickets);
    }

    // Helper method to count passengers with a specific berth preference
    private int countBerthPreference(String preference) {
        int count = 0;
        for (Passenger passenger : passengers) {
            if (passenger.getBerthPreference().equals(preference)) {
                count++;
            }
        }
        return count;
    }
}

