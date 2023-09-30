package Zoho.Round3.LiftSystem;

public class Main {
    public static void main(String[] args) {
        // Create a lift system with 5 lifts
        LiftSystem liftSystem = new LiftSystem(5);

        // Display the initial lift status
        liftSystem.displayLiftStatus();

        // Example operations:
        // Assign a lift to a user from floor 2 to 5
        liftSystem.assignLiftToUser(2, 5);
        liftSystem.displayLiftStatus();

        // Assign the nearest lift to floor 4
        liftSystem.assignNearestLift(4);
        liftSystem.displayLiftStatus();

        // Assign a lift based on direction from floor 4 to 2
        liftSystem.assignLiftWithDirection(4, 2);
        liftSystem.displayLiftStatus();

        // Restrict lift movements to certain floors
        liftSystem.restrictLifts();
        liftSystem.displayLiftStatus();

        // Assign a lift with the least number of stops from floor 8 to 0
        liftSystem.assignLiftWithLeastStops(8, 0);
        liftSystem.displayLiftStatus();

        // Assign a lift based on capacity for 6 people
        liftSystem.assignLiftByCapacity(6);
        liftSystem.displayLiftStatus();

        // Mark a lift as under maintenance (e.g., lift 0)
        liftSystem.markLiftUnderMaintenance(0);
        liftSystem.displayLiftStatus();

    }
}
