package Zoho.Round3.TollSystem;
import java.util.*;

// Class to represent a Toll
class Toll {
    private String tollName;
    private Map<Vehicle, Double> vehicleToAmountMap;

    public Toll(String tollName) {
        this.tollName = tollName;
        this.vehicleToAmountMap = new HashMap<>();
    }

    public void collectToll(Vehicle vehicle, double amount) {
        vehicleToAmountMap.put(vehicle, amount);
    }

    public Map<Vehicle, Double> getVehicleToAmountMap() {
        return vehicleToAmountMap;
    }
    
    public String getTollName() {
        return tollName;
    }
}