package DSA.Hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        Map<Character, Integer> charCountMap = new HashMap<>();
        
        // Convert the string to lowercase and iterate through each character
        for (char c : input.toLowerCase().toCharArray()) {
            // Check if the character is a lowercase letter
            if (Character.isLowerCase(c)) {
                // Update the count in the map
                charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
            }
        }
        
        // Print the character counts
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        sc.close();
    }
}

/*
 * We create a HashMap called charCountMap to store the counts of lowercase characters.
 * We convert the input string to lowercase using toLowerCase() to ensure that 
 * we count lowercase characters regardless of the case in the original string.
 * We iterate through each character in the lowercase version of the string.
 * For each lowercase character, we check if it's already in the map. 
 * If it is, we increment its count by 1; otherwise, we add it to the map with a count of 1.
 * Finally, we print the character counts stored in the charCountMap.
 */
