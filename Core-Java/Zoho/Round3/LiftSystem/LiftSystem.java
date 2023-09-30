package Zoho.Round3.LiftSystem;
import java.util.*;

public class LiftSystem {
    private List<Lift> lifts;

    public LiftSystem(int numLifts) {
        lifts = new ArrayList<>();
        for (int i = 0; i < numLifts; i++) {
            lifts.add(new Lift(10)); // Assuming each lift can carry 10 people
        }
    }

    public void displayLiftStatus() {
        System.out.print("Lifts: ");
        for (int i = 0; i < lifts.size(); i++) {
            System.out.print("L" + (i + 1) + " ");
        }
        System.out.println();

        System.out.print("Floor: ");
        for (Lift lift : lifts) {
            System.out.print(lift.getCurrentFloor() + " ");
        }
        System.out.println();
        System.out.println("---------------------------------------");
    }

    public void assignLiftToUser(int sourceFloor, int destinationFloor) {
        // Find the lift closest to the source floor
        Lift closestLift = null;
        int minDistance = Integer.MAX_VALUE;

        for (Lift lift : lifts) {
            if (!lift.isUnderMaintenance()) {
                int distance = Math.abs(lift.getCurrentFloor() - sourceFloor);
                if (distance < minDistance) {
                    closestLift = lift;
                    minDistance = distance;
                }
            }
        }

        if (closestLift != null) {
            // Assign the lift to the user and update its current floor
            closestLift.setCurrentFloor(sourceFloor);
            System.out.println("L" + (lifts.indexOf(closestLift) + 1) + " is assigned");
            closestLift.setCurrentFloor(destinationFloor);
        } else {
            System.out.println("All lifts are under maintenance.");
        }
    }

    public void assignNearestLift(int sourceFloor) {
        // Find the nearest lift to the source floor
        Lift nearestLift = null;
        int minDistance = Integer.MAX_VALUE;

        for (Lift lift : lifts) {
            if (!lift.isUnderMaintenance()) {
                int distance = Math.abs(lift.getCurrentFloor() - sourceFloor);
                if (distance < minDistance) {
                    nearestLift = lift;
                    minDistance = distance;
                }
            }
        }

        if (nearestLift != null) {
            // Assign the nearest lift to the user and update its current floor
            nearestLift.setCurrentFloor(sourceFloor);
            System.out.println("L" + (lifts.indexOf(nearestLift) + 1) + " is assigned");
        } else {
            System.out.println("All lifts are under maintenance.");
        }
    }

    public void assignLiftWithDirection(int sourceFloor, int destinationFloor) {
        // Find the lift with the same direction as the user's requirement
        Lift selectedLift = null;
        int minDistance = Integer.MAX_VALUE;

        for (Lift lift : lifts) {
            if (!lift.isUnderMaintenance()) {
                int distance = Math.abs(lift.getCurrentFloor() - sourceFloor);

                // Check if the lift is moving in the same direction as the user
                boolean movingUp = lift.getCurrentFloor() < destinationFloor;
                boolean movingDown = lift.getCurrentFloor() > destinationFloor;
                boolean sameDirection = (movingUp && distance <= minDistance) || (movingDown && distance <= minDistance);

                if (sameDirection) {
                    selectedLift = lift;
                    minDistance = distance;
                }
            }
        }

        if (selectedLift != null) {
            // Assign the selected lift to the user and update its current floor
            selectedLift.setCurrentFloor(sourceFloor);
            System.out.println("L" + (lifts.indexOf(selectedLift) + 1) + " is assigned");
            selectedLift.setCurrentFloor(destinationFloor);
        } else {
            System.out.println("No available lifts are moving in the same direction.");
        }
    }

    public void restrictLifts() {
        // Restrict lift movement to certain floors as described in the question
        for (int i = 0; i < lifts.size(); i++) {
            Lift lift = lifts.get(i);
            if (i < 2) {
                // L1 and L2 restricted to 0-5th floor
                lift.setCurrentFloor(0);
            } else if (i < 4) {
                // L3 and L4 restricted to 6-10th floor
                lift.setCurrentFloor(6);
            } else {
                // L5 unrestricted
                lift.setCurrentFloor(0);
            }
        }
    }

    public void assignLiftWithLeastStops(int sourceFloor, int destinationFloor) {
        // Find the lift with the least number of stops
        Lift selectedLift = null;
        int minStops = Integer.MAX_VALUE;

        for (Lift lift : lifts) {
            if (!lift.isUnderMaintenance()) {
                int stops = Math.abs(lift.getCurrentFloor() - sourceFloor) + Math.abs(sourceFloor - destinationFloor);
                if (stops < minStops) {
                    selectedLift = lift;
                    minStops = stops;
                }
            }
        }

        if (selectedLift != null) {
            // Assign the selected lift to the user and update its current floor
            selectedLift.setCurrentFloor(sourceFloor);
            System.out.println("L" + (lifts.indexOf(selectedLift) + 1) + " is assigned");
            selectedLift.setCurrentFloor(destinationFloor);
        } else {
            System.out.println("All lifts are under maintenance.");
        }
    }

    public void assignLiftByCapacity(int numPeople) {
        // Assign a lift based on capacity
        Lift selectedLift = null;
        int maxCapacity = 0;

        for (Lift lift : lifts) {
            if (!lift.isUnderMaintenance() && lift.getCapacity() >= numPeople) {
                if (lift.getCapacity() > maxCapacity) {
                    selectedLift = lift;
                    maxCapacity = lift.getCapacity();
                }
            }
        }

        if (selectedLift != null) {
            // Assign the selected lift to the user and update its current floor
            System.out.println("L" + (lifts.indexOf(selectedLift) + 1) + " is assigned");
        } else {
            System.out.println("No available lifts can accommodate " + numPeople + " people.");
        }
    }

    public void markLiftUnderMaintenance(int liftIndex) {
        // Mark the specified lift as under maintenance
        if (liftIndex >= 0 && liftIndex < lifts.size()) {
            Lift lift = lifts.get(liftIndex);
            lift.setUnderMaintenance(true);
            lift.setCurrentFloor(-1);
            System.out.println("L" + (liftIndex + 1) + " is under maintenance.");
        } else {
            System.out.println("Invalid lift index.");
        }
    }
}
