package ObjectClass;

import java.util.Objects;

public class OverrideObjects {
    private String name;
    private int age;

    public OverrideObjects(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        OverrideObjects person = (OverrideObjects) obj;
        return age == person.age && Objects.equals(name, person.name);
    }

    public static void main(String[] args) {
        OverrideObjects person1 = new OverrideObjects("Alice", 30);
        OverrideObjects person2 = new OverrideObjects("Alice", 30);
        OverrideObjects person3 = new OverrideObjects("Bob", 25);

        if (person1.equals(person2)) System.out.println("person1 and person2 are equal.");
        else if (person1.equals(person3)) System.out.println("person1 and person3 are equal.");
        else System.out.println("person1, person2, and person3 are not equal.");
    }
}
