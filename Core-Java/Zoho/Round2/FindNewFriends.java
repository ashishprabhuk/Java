package Zoho.Round2;
import java.util.*;

public class FindNewFriends {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of users
        System.out.println("Enter the number of users:");
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

// import java.util.*;

// public class FindNewFriends {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read the number of users
//         int numUsers = scanner.nextInt();
//         scanner.nextLine(); // Consume the newline character

//         // Create a map to store the friends' names
//         Map<String, Set<String>> friendsMap = new HashMap<>();

//         // Read the input data and populate the map
//         for (int i = 0; i < numUsers; i++) {
//             String[] userFriends = scanner.nextLine().split(" ");
//             String username = userFriends[0];
//             Set<String> userFriendSet = new HashSet<>();
//             for (int j = 1; j < userFriends.length; j++) {
//                 userFriendSet.add(userFriends[j]);
//             }
//             friendsMap.put(username, userFriendSet);
//         }

//         // Create a set to store distinct friends' names
//         Set<String> distinctFriends = new HashSet<>();

//         // Iterate through the map and add friends' names to the set
//         for (Set<String> userFriendSet : friendsMap.values()) {
//             distinctFriends.addAll(userFriendSet);
//         }

//         // Remove John's own name (assuming John is one of the users)
//         distinctFriends.remove("John"); // Replace "John" with John's username if needed

//         // Print the distinct friends' names
//         for (String friend : distinctFriends) {
//             System.out.print(friend + " ");
//         }

//         scanner.close();
//     }
// }
