package Zoho.Round2.Maths;
import java.util.Scanner;

public class PetrolBunkCar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Petrol in car (in liters): ");
        int carPetrol = scanner.nextInt();

        System.out.print("Number of petrol bunks: ");
        int numPetrolBunks = scanner.nextInt();
        int remainingPetrol = carPetrol;
        boolean canComplete = true;

        for (int i = 0; i < numPetrolBunks; i++) {
            System.out.print("Distance to Petrol Bunk " + (i + 1) + ": ");
            int distance = scanner.nextInt();
            System.out.print("Capacity of Petrol Bunk " + (i + 1) + ": ");
            int capacity = scanner.nextInt();
            if (remainingPetrol < distance) {
                canComplete = false; 
                break;
            }
            // Consume petrol for the distance to the current bunk and fill up petrol at the current bunk
            remainingPetrol -= distance;
            remainingPetrol += capacity;
        }

        if (canComplete) {
            System.out.println("Remaining petrol in the car is " + remainingPetrol + " liters.");
        } else {
            System.out.println("The car cannot complete the journey with the available petrol.");
        }
        scanner.close();
    }
}

/*
A man his driving car from home to office with X
petrol. There are N number of petrol bunks in the
city with only few capacities and each petrol is
located in different places For one km one liter will
consume. So he fill up petrol in his petrol tank in
each petrol bunks. Output the remaining petrol if
he has or tell him that he cannot travel if he is out
of petrol.
Input:
Petrol in car: 2 Liters
Petrol bunks: A B C
Distance from petrol each petrol bunks: 1, 5, 3
Capacities of each petrol bunk: 6, 4, 2
Output:
Remaining petrol in car is 5 liters
 */