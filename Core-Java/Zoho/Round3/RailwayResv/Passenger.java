package Zoho.Round3.RailwayResv;

// This class represents a passenger who can book a train ticket
class Passenger {
    // Static variable to keep track of passenger IDs
    private static int idCounter = 1;
    
    // Instance variables to store passenger details
    private int id;                  // Unique passenger ID
    private String name;             // Passenger's name
    private int age;                 // Passenger's age
    private String berthPreference;  // Passenger's berth preference (L, M, U)
    private String status;           // Passenger's booking status (L, M, U, RAC, WL)

    // Constructor to create a new Passenger object
    public Passenger(String name, int age, String berthPreference) {
        // Assign a unique ID to the passenger and increment the counter
        this.id = idCounter++; 
        
        // Initialize passenger details based on constructor parameters
        this.name = name;
        this.age = age;
        this.berthPreference = berthPreference;
        
        // Initialize the booking status as an empty string (no booking status yet)
        this.status = "";
    }

    // Getter method to retrieve the passenger's unique ID
    public int getId() {
        return id;
    }

    // Getter method to retrieve the passenger's berth preference
    public String getBerthPreference() {
        return berthPreference;
    }

    // Getter method to retrieve the passenger's booking status
    public String getStatus() {
        return status;
    }

    // Setter method to set the passenger's booking status
    public void setStatus(String status) {
        this.status = status;
    }

    // Override the toString method to provide a string representation of the passenger
    @Override
    public String toString() {
        return "Passenger ID: " + id + ", Name: " + name + ", Age: " + age +
                ", Berth Preference: " + berthPreference + ", Status: " + status;
    }
}
