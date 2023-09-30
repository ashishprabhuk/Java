package Zoho.Round3.BusResv;
import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
    private String passengerName;
    private int busNo;
    private Date date; 

    Scanner sc = new Scanner(System.in);
    Booking(){

        System.out.println("Enter Your Name: ");
        passengerName = sc.nextLine();
        
        System.out.println("Enter Your Bus No.: ");
        busNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter date (dd-MM-yyyy): ");
        String dateInput = sc.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            date = dateFormat.parse(dateInput);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }


    public boolean isAvailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
        int capacity = 0;
        for (Bus bus : buses) {
            if (bus.getBus() == busNo) {
                capacity = bus.getCapacity();
            }
        }
    
        int booked = 0;
        for (Booking book : bookings) {
            if (book.getBusNo() == busNo && book.getDate().equals(date)) {
                booked++;
            }
        }
        return booked < capacity;
    }
    

    // Method to cancel a booking based on passenger name
    public static boolean cancelBooking(ArrayList<Booking> bookings, String passengerName) {
        for (Booking booking : bookings) {
            if (booking.getPassengerName().equalsIgnoreCase(passengerName)) {
                bookings.remove(booking);
                return true;
            }
        }
        return false;
    }

    // Method to print the list of booked tickets
    public static void printTickets(ArrayList<Booking> bookings) {
        if (bookings.isEmpty()) {
            System.out.println("No bookings to print.");
        } else {
            System.out.println("List of booked tickets:");
            for (Booking booking : bookings) {
                System.out.println("Passenger: " + booking.getPassengerName() +
                                    ", Bus No.: " + booking.getBusNo() +
                                    ", Date: " + booking.getDate());
            }
        }
    }


    public String getPassengerName(){
        return passengerName;
    }
    public int getBusNo(){
        return busNo;
    }
    public Date getDate(){
        return date;
    }
}
