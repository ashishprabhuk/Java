package DataStructures.Hashing.HashMap;

import java.util.HashMap;

/* It is used to store key-value pairs, where each key is unique, and the values 
associated with those keys can be retrieved quickly. 
HashMap is a widely used data structure for fast data retrieval,
and it is based on the principles of hashing. */

public class CollisionHandling {
    public static void main(String[] args) {
        // Create a HashMap with custom objects as keys
        HashMap<Student, Integer> scores = new HashMap<>();

        // Create Student objects
        Student alice = new Student("Alice", 12345);
        Student bob = new Student("Bob", 54321);

        // Add key-value pairs
        scores.put(alice, 95);
        scores.put(bob, 88);

        // Retrieve values using custom objects as keys
        int aliceScore = scores.get(alice);
        System.out.println("Alice's score: " + aliceScore); // Output: Alice's score: 95
    }
}

class Student {
    private String name;
    private int studentId;

    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        // Custom hashCode implementation
        return studentId;
    }

    @Override
    public boolean equals(Object obj) {
        // Custom equals implementation
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return studentId == student.studentId;
    }
}

