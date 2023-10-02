package Zoho.Round3.Puzzles;
import java.util.Scanner;

public class MatrixGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Matrix Game!");

        // Input: Number of rows and columns
        System.out.print("Enter the number of rows: ");
        int numRows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int numCols = scanner.nextInt();

        // Input: Number of atoms and their positions
        System.out.print("Enter the number of atoms and their positions: ");
        int numAtoms = scanner.nextInt();
        int[][] atomPositions = readPositions(scanner, numAtoms);

        // Input: Number of rays and their directions
        System.out.print("Enter the number of rays and their directions: ");
        int numRays = scanner.nextInt();
        String[] rays = readRays(scanner, numRays);

        // Create and initialize the matrix
        char[][] matrix = initializeMatrix(numRows, numCols);

        // Place atoms in the matrix
        placeAtoms(matrix, atomPositions);

        // Implement rules 1, 2, 3, 4, and 5 based on the input rays
        applyRules(matrix, rays);

        // Print the final matrix
        System.out.println("\nFinal Matrix:");
        printMatrix(matrix);
    }

    // Function to read atom positions
    private static int[][] readPositions(Scanner scanner, int numAtoms) {
        int[][] atomPositions = new int[numAtoms][2];
        for (int i = 0; i < numAtoms; i++) {
            atomPositions[i][0] = scanner.nextInt();
            atomPositions[i][1] = scanner.nextInt();
        }
        return atomPositions;
    }

    // Function to read ray directions
    private static String[] readRays(Scanner scanner, int numRays) {
        String[] rays = new String[numRays];
        for (int i = 0; i < numRays; i++) {
            rays[i] = scanner.next();
        }
        return rays;
    }

    // Function to initialize the matrix with '-'
    private static char[][] initializeMatrix(int numRows, int numCols) {
        char[][] matrix = new char[numRows][numCols];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = '-';
            }
        }
        return matrix;
    }

    // Function to place atoms in the matrix
    private static void placeAtoms(char[][] matrix, int[][] atomPositions) {
        for (int[] position : atomPositions) {
            int row = position[0] - 1;
            int col = position[1] - 1;
            matrix[row][col] = 'X';
        }
    }

    // Function to apply rules based on rays (needs implementation)
    private static void applyRules(char[][] matrix, String[] rays) {
        for (String ray : rays) {
            // Implement the logic for each rule here
            // You'll need to track the path of the ray and apply the rules accordingly
        }
    }

    // Function to print the matrix
    private static void printMatrix(char[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}



/*  
 * Certainly! Let me explain the code step by step:

1. **Import Statements:**
   ```java
   import java.util.Scanner;
   ```
   This line imports the `Scanner` class from the `java.util` package, allowing us to take input from the user.

2. **Main Method:**
   ```java
   public static void main(String[] args) {
   ```
   The `public static void main(String[] args)` method is the entry point of the program.

3. **Welcome Message and Input Gathering:**
   ```java
   System.out.println("Welcome to the Matrix Game!");
   System.out.print("Enter the number of rows: ");
   int numRows = scanner.nextInt();
   System.out.print("Enter the number of columns: ");
   int numCols = scanner.nextInt();
   ```
   These lines display a welcome message and prompt the user to enter the number of rows and columns for the matrix.

4. **Reading Atom Positions:**
   ```java
   System.out.print("Enter the number of atoms and their positions: ");
   int numAtoms = scanner.nextInt();
   int[][] atomPositions = readPositions(scanner, numAtoms);
   ```
   This code prompts the user to enter the number of atoms and their positions. It then calls the `readPositions` function to read and store the atom positions.

5. **Reading Ray Directions:**
   ```java
   System.out.print("Enter the number of rays and their directions: ");
   int numRays = scanner.nextInt();
   String[] rays = readRays(scanner, numRays);
   ```
   Similar to atoms, this code prompts the user to enter the number of rays and their directions. It calls the `readRays` function to read and store the ray directions.

6. **Initializing the Matrix:**
   ```java
   char[][] matrix = initializeMatrix(numRows, numCols);
   ```
   This line initializes a 2D character array (matrix) with the given number of rows and columns. The `initializeMatrix` function is responsible for this task.

7. **Placing Atoms in the Matrix:**
   ```java
   placeAtoms(matrix, atomPositions);
   ```
   This line calls the `placeAtoms` function to place atoms in the matrix based on the user-provided positions.

8. **Applying Rules:**
   ```java
   applyRules(matrix, rays);
   ```
   This line calls the `applyRules` function, which is currently empty. You would implement the logic for the game rules inside this function.

9. **Printing the Final Matrix:**
   ```java
   System.out.println("\nFinal Matrix:");
   printMatrix(matrix);
   ```
   After applying rules, the code prints the final matrix by calling the `printMatrix` function.

10. **Helper Functions:**
    - `readPositions(Scanner scanner, int numAtoms)`: Reads and returns atom positions as a 2D array.
    - `readRays(Scanner scanner, int numRays)`: Reads and returns ray directions as an array of strings.
    - `initializeMatrix(int numRows, int numCols)`: Initializes a matrix with '-' characters and returns it.
    - `placeAtoms(char[][] matrix, int[][] atomPositions)`: Places 'X' characters in the matrix based on atom positions.
    - `applyRules(char[][] matrix, String[] rays)`: Placeholder function where the logic for applying game rules based on ray directions should be implemented.
    - `printMatrix(char[][] matrix)`: Prints the given matrix.

This program provides a basic structure for a matrix game where atoms are placed in a matrix, and rules are applied based on given rays. The specific game rules would need to be implemented inside the `applyRules` function.
 */