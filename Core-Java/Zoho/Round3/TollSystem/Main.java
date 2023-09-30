package Zoho.Round3.TollSystem;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TollCollection tollSystem = new TollCollection();

        // Create toll booths
        Toll toll1 = new Toll("Toll 1");
        Toll toll2 = new Toll("Toll 2");
        Toll toll3 = new Toll("Toll 3");

        // Add toll booths to the system
        tollSystem.addToll(toll1);
        tollSystem.addToll(toll2);
        tollSystem.addToll(toll3);

        while (true) {
            System.out.println("Toll Payment Processing System");
            System.out.println("1. Collect Toll");
            System.out.println("2. Display Toll Details");
            System.out.println("3. Display Vehicle Details");
            System.out.println("4. Calculate Shortest Route and Toll Amount");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                // Module 1: Collect Toll
                case 1:
                    System.out.print("Enter vehicle number: ");
                    String vehicleNumber = scanner.next();
                    System.out.print("Enter vehicle type (Car/Truck/VIP): ");
                    String vehicleType = scanner.next();
                    System.out.print("Enter the toll booth name: ");
                    String tollName = scanner.next();
                    System.out.print("Enter the toll amount: ");
                    double amount = scanner.nextDouble();

                    Vehicle vehicle = new Vehicle(vehicleNumber, vehicleType);
                    for (Toll toll : tollSystem.getTolls()) {
                        if (toll.getTollName().equalsIgnoreCase(tollName)) {
                            double discountedAmount = tollSystem.calculateDiscountedAmount(vehicle, amount);
                            toll.collectToll(vehicle, discountedAmount);
                            System.out.println("Toll collected successfully.");
                            break;
                        }
                    }
                    break;

                // Module 2: Display Toll Details
                case 2:
                    System.out.println("Toll Details:");
                    for (Toll toll : tollSystem.getTolls()) {
                        System.out.println("Toll Booth: " + toll.getTollName());
                        Map<Vehicle, Double> vehicleToAmountMap = toll.getVehicleToAmountMap();
                        double totalAmountCollected = 0.0;

                        for (Map.Entry<Vehicle, Double> entry : vehicleToAmountMap.entrySet()) {
                            Vehicle v = entry.getKey();
                            double amt = entry.getValue();
                            totalAmountCollected += amt;

                            System.out.println("Vehicle: " + v.getVehicleNumber());
                            System.out.println("Amount Paid: $" + amt);
                        }

                        System.out.println("Total Amount Collected at this Toll Booth: $" + totalAmountCollected);
                        System.out.println();
                    }
                    break;

                // Module 3: Display Vehicle Details
                case 3:
                    System.out.print("Enter vehicle number: ");
                    vehicleNumber = scanner.next();
                    vehicle = new Vehicle(vehicleNumber, "");

                    System.out.println("Vehicle Details:");
                    tollSystem.displayVehicleDetails(vehicle);
                    break;

                // Module 4: Calculate Shortest Route and Toll Amount (Assuming circular highway)
                case 4:
                    System.out.print("Enter starting toll booth name: ");
                    String startTollName = scanner.next();
                    System.out.print("Enter destination toll booth name: ");
                    String destinationTollName = scanner.next();

                    double totalTollAmount = tollSystem.calculateTotalTollBetweenTolls(startTollName, destinationTollName);
                    System.out.println("Total Toll Amount from " + startTollName + " to " + destinationTollName + ": $" + totalTollAmount);
                    break;

                case 5:
                    System.out.println("Exiting the Toll Payment Processing System.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
