package Practice;

class Superclass {
    int number = 10;

    void display() {
        System.out.println("This is the superclass.");
    }
}

class Subclass extends Superclass {
    int number = 20;

    void display() {
        System.out.println("This is the subclass.");
        System.out.println("Number in subclass: " + this.number);
        super.display(); // Calling superclass method
        System.out.println("Number in superclass: " + super.number); // Accessing superclass field
    }
}

public class Main{
  public static void main(String[] args) {
    Subclass sb = new Subclass();
    sb.display();
  }
}
