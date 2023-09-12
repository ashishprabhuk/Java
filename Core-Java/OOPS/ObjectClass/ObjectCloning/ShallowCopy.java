package ObjectClass.ObjectCloning;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }
}

public class ShallowCopy {
    public static void main(String[] args) {
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Gaming");

        Person originalPerson = new Person("Alice", hobbies);

        // Creating a shallow copy
        Person copiedPerson = new Person(originalPerson.getName(), originalPerson.getHobbies());

        // Modify the hobbies of the copied person
        copiedPerson.getHobbies().add("Painting");

        // Both the original and copied person will have the added hobby "Painting"
        System.out.println("Original Hobbies: " + originalPerson.getHobbies());
        System.out.println("Copied Hobbies: " + copiedPerson.getHobbies());
    }
}
