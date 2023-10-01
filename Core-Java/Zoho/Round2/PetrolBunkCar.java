package Zoho.Round2;
import java.util.Scanner;

public class PetrolBunkCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the initial petrol in the car
        System.out.print("Petrol in car (in liters): ");
        int carPetrol = scanner.nextInt();
        
        // Input the number of petrol bunks
        System.out.print("Number of petrol bunks: ");
        int numPetrolBunks = scanner.nextInt();

        int[] distances = new int[numPetrolBunks];
        int[] capacities = new int[numPetrolBunks];
        
        // Input distances and capacities for each petrol bunk
        for (int i = 0; i < numPetrolBunks; i++) {
            System.out.print("Distance to Petrol Bunk " + (i + 1) + ": ");
            distances[i] = scanner.nextInt();
            
            System.out.print("Capacity of Petrol Bunk " + (i + 1) + ": ");
            capacities[i] = scanner.nextInt();
        }
        
        // Calculate remaining petrol and check if the car can complete the journey
        int remainingPetrol = carPetrol;
        boolean canComplete = true;
        
        for (int i = 0; i < numPetrolBunks; i++) {
            int requiredPetrol = distances[i];
            
            // Check if the remaining petrol is less than what's required to reach the current petrol bunk
            if (remainingPetrol < requiredPetrol) {
                canComplete = false; // Car cannot reach the current petrol bunk
                break;
            }
            
            remainingPetrol -= requiredPetrol; // Consume petrol for the distance to the current bunk
            remainingPetrol += capacities[i]; // Fill up petrol at the current bunk
        }
        
        // Output the result
        if (canComplete) {
            System.out.println("Remaining petrol in the car is " + remainingPetrol + " liters.");
        } else {
            System.out.println("The car cannot complete the journey with the available petrol.");
        }
        
        scanner.close();
    }
}

