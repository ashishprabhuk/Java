package Strings;

public class StringBuilders {
    public static void main(String[] args) {
        // Creating a StringBuilder with an initial capacity
        StringBuilder sb = new StringBuilder(20);

        // Appending text
        sb.append("Hello");
        sb.append("World");
        System.out.println("Appended Text: " + sb.toString());

        // Inserting text at a specific position
        sb.insert(5, ", Java");
        System.out.println("Inserted Text: " + sb.toString());

        // Deleting a portion of the string
        sb.delete(5, 10);
        System.out.println("Deleted Text: " + sb.toString());

        // Replacing a portion of the string
        sb.replace(0, 5, "Hi");
        System.out.println("Replaced Text: " + sb.toString());

        // Reverse the string
        sb.reverse();
        System.out.println("Reversed Text: " + sb.toString());

        // Getting the length and capacity
        int length = sb.length();
        int capacity = sb.capacity();
        System.out.println("Length: " + length);
        System.out.println("Capacity: " + capacity);

        // Setting a new capacity
        sb.ensureCapacity(50);
        capacity = sb.capacity();
        System.out.println("New Capacity: " + capacity);

        // Converting StringBuilder to a String
        String result = sb.toString();
        System.out.println("Final String: " + result);
    }

    public void append(char ch) {
    }
}
