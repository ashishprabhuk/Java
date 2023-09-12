package ObjectClass.ObjectCloning;

import java.util.ArrayList;
import java.util.List;

class Person {
    String name;
    List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = new ArrayList<>(hobbies); // Perform deep copy of the hobbies list
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}

public class DeepCopy{
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Gaming");

        Person original = new Person("Alice", hobbies);

        // Creating a deep copy
        Person copied = new Person(original.getName(), original.getHobbies());
        
        // Modify the hobbies of the copied person
        copied.getHobbies().add("Painting");
        
        // The original person's hobbies remain unchanged
        System.out.println("Original Hobbies: " + original.getHobbies());
        
        System.out.println("Copied Hobbies: " + copied.getHobbies());
    }
}

