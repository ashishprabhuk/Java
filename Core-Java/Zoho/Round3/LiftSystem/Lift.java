package Zoho.Round3.LiftSystem;


class Lift {
    private int currentFloor;
    private int capacity;
    private boolean underMaintenance;

    public Lift(int capacity) {
        this.currentFloor = 0;
        this.capacity = capacity;
        this.underMaintenance = false;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public int getCapacity() {
        return capacity;
    }

    public boolean isUnderMaintenance() {
        return underMaintenance;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public void setUnderMaintenance(boolean underMaintenance) {
        this.underMaintenance = underMaintenance;
    }
}