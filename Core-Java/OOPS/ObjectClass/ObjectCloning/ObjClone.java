package ObjectClass.ObjectCloning;

class Student implements Cloneable {
    private int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Override the clone() method
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public void display() {
        System.out.println("Student ID: " + id + ", Name: " + name);
    }
}

public class ObjClone {
    public static void main(String[] args) {
        try {
            // Create an instance of Student
            Student originalStudent = new Student(1, "Alice");

            // Clone the Student object
            Student clonedStudent = (Student) originalStudent.clone();

            // Modify the cloned object
            clonedStudent.name = "Bob";

            // Display original and cloned student details
            System.out.println("Original Student:");
            originalStudent.display();
            System.out.println("Cloned Student:");
            clonedStudent.display();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
