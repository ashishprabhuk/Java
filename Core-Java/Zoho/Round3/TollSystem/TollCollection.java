package Zoho.Round3.TollSystem;
import java.util.*;

// Class to manage Toll Collection System
public class TollCollection {
    private List<Toll> tolls;

    public TollCollection() {
        tolls = new ArrayList<>();
    }

    public void addToll(Toll toll) {
        tolls.add(toll);
    }

    public double calculateDiscountedAmount(Vehicle vehicle, double amount) {
        // Apply 20% discount for VIP users
        if (isVIP(vehicle)) {
            return 0.8 * amount;
        } else {
            return amount;
        }
    }

    public boolean isVIP(Vehicle vehicle) {
        // Add logic to check if a vehicle is VIP (e.g., based on some criteria)
        // For simplicity, we assume all vehicles are non-VIP in this example
        return false;
    }

    public double calculateTotalTollPaid(Vehicle vehicle) {
        double totalTollPaid = 0.0;
        for (Toll toll : tolls) {
            Map<Vehicle, Double> vehicleToAmountMap = toll.getVehicleToAmountMap();
            if (vehicleToAmountMap.containsKey(vehicle)) {
                totalTollPaid += vehicleToAmountMap.get(vehicle);
            }
        }
        return totalTollPaid;
    }

    public void displayVehicleDetails(Vehicle vehicle) {
        System.out.println("Vehicle: " + vehicle.getVehicleNumber());
        System.out.println("Vehicle Type: " + vehicle.getVehicleType());
        System.out.println("Total Amount Paid: $" + calculateTotalTollPaid(vehicle));

        for (Toll toll : tolls) {
            Map<Vehicle, Double> vehicleToAmountMap = toll.getVehicleToAmountMap();
            if (vehicleToAmountMap.containsKey(vehicle)) {
                double amountPaid = vehicleToAmountMap.get(vehicle);
                System.out.println("Journey through " + toll.getTollName() + ": $" + amountPaid);
            }
        }
    }

    public double calculateTotalTollBetweenTolls(String startTollName, String destinationTollName) {
        double totalTollAmount = 0.0;
        boolean startFound = false;

        for (Toll toll : tolls) {
            if (toll.getTollName().equalsIgnoreCase(startTollName)) {
                startFound = true;
            }

            if (startFound) {
                Map<Vehicle, Double> vehicleToAmountMap = toll.getVehicleToAmountMap();
                for (Map.Entry<Vehicle, Double> entry : vehicleToAmountMap.entrySet()) {
                    totalTollAmount += entry.getValue();
                }

                if (toll.getTollName().equalsIgnoreCase(destinationTollName)) {
                    break;
                }
            }
        }
        return totalTollAmount;
    }

    public Toll[] getTolls() {
        return tolls.toArray(new Toll[0]);
    }
    
}