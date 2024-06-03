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