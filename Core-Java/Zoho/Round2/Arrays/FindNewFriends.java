package Zoho.Round2.Arrays;
import java.util.*;

public class FindNewFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of users
        System.out.print("Enter the number of users:");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        
        // Create a set to store distinct friends' names
        Set<String> distinctFriends = new HashSet<>();
        
        System.out.println("Enter the mutual list:");
        // Read the input data and populate the set
        for (int i = 0; i < numUsers; i++) {
            String[] userFriends = scanner.nextLine().split(" ");
            for (int j = 2; j < userFriends.length; j++) {
                distinctFriends.add(userFriends[j]);
            }
        }

        // Print the distinct friends' names
        for (String friend : distinctFriends) {
            System.out.print(friend + " ");
        }

        scanner.close();
    }
}

/*
Help john to find new friends in social network
Input:
3
Mani 3 ram raj guna
Ram 2 kumar Kishore
Mughil 3 praveen Naveen Ramesh
Output:
Raj guna kumar Kishore praveen Naveen Ramesh
*/