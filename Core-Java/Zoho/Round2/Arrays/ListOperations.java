package Zoho.Round2.Arrays;
import java.util.*;

public class ListOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        // Input for list1
        System.out.print("Enter the number of elements for List 1: ");
        int n1 = scanner.nextInt();
        System.out.println("Enter elements for List 1:");
        for (int i = 0; i < n1; i++) {
            int element = scanner.nextInt();
            list1.add(element);
        }

        // Input for list2
        System.out.print("Enter the number of elements for List 2: ");
        int n2 = scanner.nextInt();
        System.out.println("Enter elements for List 2:");
        for (int i = 0; i < n2; i++) {
            int element = scanner.nextInt();
            list2.add(element);
        }

        // Union of two lists (eliminate duplicates)
        Set<Integer> unionSet = new HashSet<>();
        unionSet.addAll(list1);
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

        // Close the scanner
        scanner.close();
    }
}



/*
Find the union intersection of two list and also find
except (remove even elements from list1 and odd
elements from list2)

Input
List 1: 1,3,4,5,6,8,9
List 2: 1, 5,8,9,2

Output
Union: 1, 3,4,5,6,8,9,2
Intersection: 1,5,8,9
Except: 1, 3, 5,9,8,2
*/