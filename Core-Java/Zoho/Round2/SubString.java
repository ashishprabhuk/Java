package Zoho.Round2;

public class SubString {
    public static void main(String[] args) {
        // Define the input string
        // String inputString = "WELCOMETOZOHOCORPORATION";

        // Create a two-dimensional character array
        char[][] twoDArray = {
            {'W', 'E', 'L', 'C', 'O'},
            {'M', 'E', 'T', 'O', 'Z'},
            {'O', 'H', 'O', 'C', 'O'},
            {'R', 'P', 'O', 'R', 'A'},
            {'T', 'I', 'O', 'N'}
        };

        // Define the substring to search for
        String searchString = "TOO";

        // Initialize variables to store start and end indices
        int startRow = -1, startCol = -1, endRow = -1, endCol = -1;

        // Search for the substring "TOO" in all directions
        for (int i = 0; i < twoDArray.length; i++) {
            for (int j = 0; j < twoDArray[i].length; j++) {
                // Check horizontal right
                if (j + searchString.length() <= twoDArray[i].length) {
                    boolean found = true;
                    // Check each character of the substring
                    for (int k = 0; k < searchString.length(); k++) {
                        if (twoDArray[i][j + k] != searchString.charAt(k)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        // If the substring is found horizontally, store the start and end indices
                        startRow = i;
                        startCol = j;
                        endRow = i;
                        endCol = j + searchString.length() - 1;
                        break; // Break out of the loop since we found the substring
                    }
                }
                // Check vertical down
                if (i + searchString.length() <= twoDArray.length) {
                    boolean found = true;
                    // Check each character of the substring
                    for (int k = 0; k < searchString.length(); k++) {
                        if (twoDArray[i + k][j] != searchString.charAt(k)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        // If the substring is found vertically, store the start and end indices
                        startRow = i;
                        startCol = j;
                        endRow = i + searchString.length() - 1;
                        endCol = j;
                        break; // Break out of the loop since we found the substring
                    }
                }
            }
        }

        // Print the result
        if (startRow != -1 && startCol != -1) {
            System.out.println("Start index: <" + startRow + ", " + startCol + ">");
            System.out.println("End index: <" + endRow + ", " + endCol + ">");
        } else {
            System.out.println("Substring not found.");
        }
    }
}

/*  
 * The input string inputString is defined as "WELCOMETOZOHOCORPORATION."

A two-dimensional character array twoDArray is created, 
which represents the matrix of characters where the substring will be searched.

The substring to search for is defined as "TOO" using the variable searchString.

Variables startRow, startCol, endRow, and endCol are initialized to -1. 
These variables will be used to store the indices of the found substring.

The code then iterates through each element of the two-dimensional array using nested loops (for loops).

For each element, it checks if the first character of the substring (searchString.charAt(0)) 
matches the current character in the array.

If a match is found, it proceeds to check for the presence of the remaining characters of the substring, 
both horizontally to the right and vertically down. 
This is done using additional nested loops (for loops) and the found boolean variable.

If a complete match is found (i.e., all characters of the substring match in either direction), 
the startRow, startCol, endRow, and endCol variables are updated 
to store the indices of the found substring.

Finally, the code prints the result. If the startRow and startCol variables were updated 
(indicating that the substring was found), it prints the start and end indices of the substring. 
If not, it prints "Substring not found."

The code checks for the substring "TOO" in both horizontal and vertical directions and stores the indices of the found substring if it exists in the two-dimensional array.






 */