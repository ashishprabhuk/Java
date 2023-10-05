package DSA.Arrays.OneDArray;
import java.util.*;

public class CustomSortExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Charlie");

        // Sort the list based on the length of the names
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return Integer.compare(name1.length(), name2.length());
            }
        });

        // Print the sorted list
        for (String name : names) {
            System.out.println(name);
        }
    }
}
