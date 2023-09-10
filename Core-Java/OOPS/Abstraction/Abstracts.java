package Abstraction;

// Define an abstract class
abstract class Vehicle {
    
    // Abstract method (no implementation)
    abstract void start();
    
    // Regular instance method
    void stop() {
        System.out.println("Vehicle stopped.");
    }
    
    // Final method (cannot be overridden)
    final void honk() {
        System.out.println("HONK HONK!");
    }
    
    // Static method (can be called without creating an object)
    static void repair() {
        System.out.println("Vehicle is being repaired.");
    }
    
    // Abstract classes can have constructors
    Vehicle() {
        System.out.println("Vehicle constructor called.");
    }
}

// Concrete class inheriting from the abstract class
class Car extends Vehicle {
    
    // Implement the abstract method
    void start() {
        System.out.println("Car started.");
    }
    
    // You can override non-final methods from the abstract class
    void stop() {
        System.out.println("Car stopped.");
    }
}
public class Abstracts {
    public static void main(String[] args) {
        // Cannot create an instance of an abstract class
        // Vehicle vehicle = new Vehicle(); // Error
        
        // Create an instance of a concrete subclass
        Car car = new Car();
        
        // Call methods
        car.start();
        car.stop();
        car.honk();
        Vehicle.repair();
    }
}
