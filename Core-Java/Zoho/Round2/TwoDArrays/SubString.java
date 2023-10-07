package Zoho.Round2.TwoDArrays;

public class SubString {
    public static void main(String[] args) {
        char[][] twoDArray = {
            {'W', 'E', 'L', 'C', 'O'},
            {'M', 'E', 'T', 'O', 'Z'},
            {'O', 'H', 'O', 'C', 'O'},
            {'R', 'P', 'O', 'R', 'A'},
            {'T', 'I', 'O', 'N'}
        };

        String searchString = "TOO";

        int[] indices = searchSubstring(twoDArray, searchString);

        if (indices != null) {
            int startRow = indices[0];
            int startCol = indices[1];
            int endRow = indices[2];
            int endCol = indices[3];

            System.out.println("Start index: <" + startRow + ", " + startCol + ">");
            System.out.println("End index: <" + endRow + ", " + endCol + ">");
        } else {
            System.out.println("Substring not found.");
        }
    }

    public static int[] searchSubstring(char[][] twoDArray, String searchString) {
        int rowCount = twoDArray.length;
        int colCount = twoDArray[0].length;

        for (int i = 0; i < rowCount; i++) {
            for (int j = 0; j < colCount; j++) {
                if (j + searchString.length() <= colCount) {
                    boolean found = true;
                    for (int k = 0; k < searchString.length(); k++) {
                        if (twoDArray[i][j + k] != searchString.charAt(k)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        return new int[]{i, j, i, j + searchString.length() - 1};
                    }
                }
                if (i + searchString.length() <= rowCount) {
                    boolean found = true;
                    for (int k = 0; k < searchString.length(); k++) {
                        if (twoDArray[i + k][j] != searchString.charAt(k)) {
                            found = false;
                            break;
                        }
                    }
                    if (found) {
                        return new int[]{i, j, i + searchString.length() - 1, j};
                    }
                }
            }
        }
        return null;
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