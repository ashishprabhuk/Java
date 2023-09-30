package Zoho.Round3.BusResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public void setBus(int busNo) { //mutators
        this.busNo = busNo;
    }
    public void setAC(boolean ac) {
        this.ac = ac;
    }
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBus() { //accessor methods
        return busNo;
    }
    public boolean getAC() {
        return ac;
    }
    public int getCapacity() {
        return capacity;
    }
    
    public void busInfo(){
        System.out.println("Bus no.: " + busNo + ", capacity: " + capacity + ", AC: " + ac);
    } 
}
