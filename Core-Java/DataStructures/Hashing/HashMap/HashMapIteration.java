package DataStructures.Hashing.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMapIteration {
    public static void main(String[] args) {
        // Create a HashMap with Integer keys and String values
        HashMap<Integer, String> students = new HashMap<>();

        // Add some key-value pairs
        students.put(1, "Alice");
        students.put(2, "Bob");
        students.put(3, "Charlie");
        students.put(4, "David");

        // Iterate through keys and values
        for (Map.Entry<Integer, String> entry : students.entrySet()) {
            int studentId = entry.getKey();
            String studentName = entry.getValue();
            System.out.println("Student ID: " + studentId + ", Name: " + studentName);
        }
    }
}

