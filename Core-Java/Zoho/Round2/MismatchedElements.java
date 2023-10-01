package Zoho.Round2;
import java.util.ArrayList;
import java.util.HashSet;

public class MismatchedElements {
    public static void main(String[] args) {
        // Define two character arrays
        char[] arr1 = {'a','b','c','d','e','f','g','h','i'};
        char[] arr2 = {'a','b','d','e','e','g','g','i','i'};

        // Call the findMismatchedElements function to find mismatched elements
        ArrayList<Character> mismatchedElements = findMismatchedElements(arr1, arr2);

        // Print the mismatched elements
        // System.out.print("Mismatched Elements: ");
        // for (char element : mismatchedElements) {
        //     System.out.print(element);
        // }
        System.out.print("Mismatched Elements: [");
        for (int i = 0; i < mismatchedElements.size(); i++) {
            System.out.print(mismatchedElements.get(i));
            if (i < mismatchedElements.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }

    public static ArrayList<Character> findMismatchedElements(char[] arr1, char[] arr2) {
        // Initialize an ArrayList to store mismatched elements
        ArrayList<Character> mismatched = new ArrayList<>();
        
        // Initialize a HashSet to store elements from arr2 for efficient lookup
        HashSet<Character> set = new HashSet<>();

        // Add elements from arr2 to the HashSet set
        for (char c : arr2) {
            set.add(c);
        }

        // Iterate through arr1 to find mismatched elements
        for (char c : arr1) {
            // If the current character from arr1 is not in arr2 (not in the HashSet set)
            if (!set.contains(c)) {
                // Add the mismatched element to the ArrayList mismatched
                mismatched.add(c);
            }
        }

        // Return the ArrayList containing mismatched elements
        return mismatched;
    }
}
