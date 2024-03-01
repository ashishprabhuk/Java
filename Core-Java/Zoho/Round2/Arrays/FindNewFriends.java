package Zoho.Round2.Arrays;
import java.util.*;

public class FindNewFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of users
        System.out.print("Enter the number of users:");
        int numUsers = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        // Read and display distinct friends' names
        Set<String> distinctFriends = readAndFindDistinctFriends(numUsers);

        // Print the distinct friends' names
        System.out.println("Distinct Friends:");
        for (String friend : distinctFriends) {
            System.out.print(friend + " ");
        }

        scanner.close();
    }

    // Method to read input and find distinct friends' names
    public static Set<String> readAndFindDistinctFriends(int numUsers) {
        Scanner sc = new Scanner(System.in);
        Set<String> distinctFriends = new HashSet<>();
        
        System.out.println("Enter the mutual list:");
        
        for (int i = 0; i < numUsers; i++) {
            String[] userFriends = sc.nextLine().split(" ");
            for (int j = 2; j < userFriends.length; j++) {
                distinctFriends.add(userFriends[j]);
            }
        }
        sc.close();
        return distinctFriends;
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