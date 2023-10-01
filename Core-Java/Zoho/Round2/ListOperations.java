package Zoho.Round2;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Initialize list1 and list2
        list1.add(1);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(8);
        list1.add(9);

        list2.add(1);
        list2.add(5);
        list2.add(8);
        list2.add(9);
        list2.add(2);

        // Union of two lists (eliminate duplicates)
        Set<Integer> unionSet = new HashSet<>(list1);
        unionSet.addAll(list2);
        List<Integer> union = new ArrayList<>(unionSet);

        // Intersection of two lists
        Set<Integer> set1 = new HashSet<>(list1);
        Set<Integer> set2 = new HashSet<>(list2);
        set1.retainAll(set2);
        List<Integer> intersection = new ArrayList<>(set1);

        // Except operation (list1 with even elements removed and list2 with odd elements removed)
        List<Integer> except = new ArrayList<>();
        for (Integer element : list1) {
            if (element % 2 != 0) {
                except.add(element);
            }
        }
        for (Integer element : list2) {
            if (element % 2 == 0) {
                except.add(element);
            }
        }
        // Print the results
        System.out.println("Union: " + union);
        System.out.println("Intersection: " + intersection);
        System.out.println("Except: " + except);
    }
}


