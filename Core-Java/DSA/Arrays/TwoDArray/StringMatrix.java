package DSA.Arrays.TwoDArray;

public class StringMatrix {
    public static void main(String[] args) {
        String inputString = "Hello, World";
        printStringMatrix(inputString);
    }

    public static void printStringMatrix(String input) {
        int length = input.length();
        int rows = (int) Math.ceil(Math.sqrt(length));
        int columns = (int) Math.ceil((double) length / rows);

        char[][] matrix = new char[rows][columns];

        int index = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                if (index < length) {
                    matrix[row][col] = input.charAt(index);
                    index++;
                } else {
                    matrix[row][col] = ' '; // Pad with spaces if the string is shorter than the matrix size
                }
            }
        }

        // Print the matrix
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < columns; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }
}

/*

H e l l 
o ,   W 
o r l d 

*/
