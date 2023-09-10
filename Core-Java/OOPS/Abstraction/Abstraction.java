package Abstraction;

// Abstract class representing a Shape
abstract class Shape {
    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();
    
    // Abstract method to calculate perimeter (to be implemented by subclasses)
    public abstract double calculatePerimeter();
}

// Concrete subclass representing a Circle
class Circle extends Shape {
    private double radius;
    
    // Constructor for Circle
    public Circle(double radius) {
        this.radius = radius;
    }
    
    // Override the abstract method to calculate the area of a Circle
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    // Override the abstract method to calculate the perimeter of a Circle
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}

// Concrete subclass representing a Rectangle
class Rectangle extends Shape {
    private double length;
    private double width;
    
    // Constructor for Rectangle
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Override the abstract method to calculate the area of a Rectangle
    @Override
    public double calculateArea() {
        return length * width;
    }
    
    // Override the abstract method to calculate the perimeter of a Rectangle
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Create a Circle and calculate its area and perimeter
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Perimeter: " + circle.calculatePerimeter());
        
        // Create a Rectangle and calculate its area and perimeter
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());
    }
}
