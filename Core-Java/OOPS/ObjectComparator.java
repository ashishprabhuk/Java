import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

class Person {
    private String name;
    private int marks;

    public Person(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return name + " - Marks: " + marks;
    }
}

class MarksComparator implements Comparator<Person> {
    @Override
    public int compare(Person person1, Person person2) {
        // Compare based on marks in descending order
        return person2.getMarks() - person1.getMarks();
    }
}

public class ObjectComparator {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Alice", 85));
        persons.add(new Person("Bob", 92));
        persons.add(new Person("Charlie", 78));

        // Sort the list of persons based on marks using the custom comparator
        Collections.sort(persons, new MarksComparator());

        // The first person in the sorted list will have the highest marks
        Person highestScorer = persons.get(0);

        System.out.println("Highest Scorer: " + highestScorer);
    }
}

