package DSA.Arrays.TwoDArray;

public class FindPathMaze {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 0, 1, 1},
            {1, 1, 1, 1, 0},
            {1, 0, 1, 1, 1}
        };
    
        boolean foundPath = findPathInMaze(maze, 0, 0);
    
        if (foundPath) {
            System.out.println("Path exists in the maze.");
        } else {
            System.out.println("No path exists in the maze.");
        }
    }

    public static boolean findPathInMaze(int[][] maze, int x, int y) {
        int numRows = maze.length;
        int numCols = maze[0].length;
    
        // Base cases
        if (x < 0 || x >= numRows || y < 0 || y >= numCols || maze[x][y] == 0) {
            return false; // Hit a wall or out of bounds
        }
        if (x == numRows - 1 && y == numCols - 1) {
            return true; // Reached the destination
        }
    
        // Mark the current cell as visited
        maze[x][y] = 0;
    
        // Try moving in all possible directions using recursions
        if (findPathInMaze(maze, x + 1, y) || findPathInMaze(maze, x - 1, y)
            || findPathInMaze(maze, x, y + 1) || findPathInMaze(maze, x, y - 1)) {
            return true;
        }
    
        // If none of the directions lead to the destination, backtrack
        maze[x][y] = 1;
        return false;
    }
}

/*  
 * The given Java code is an implementation of a maze-solving algorithm using recursion 
 * to find a path from the top-left corner of a 2D maze to the bottom-right corner. 
 * The maze is represented as a 2D array where 1s represent open paths, and 0s represent walls or obstacles.

Here's an explanation of the code:

1. The `main` method is the entry point of the program. It initializes a 2D maze and then calls the `findPathInMaze` method to check if a path exists from the top-left corner to the bottom-right corner of the maze.

2. The `findPathInMaze` method is a recursive function that explores possible paths in the maze. It takes three parameters:
    - `maze`: The 2D array representing the maze.
    - `x`: The current row.
    - `y`: The current column.

3. It first checks some base cases:
    - If `x` and `y` are out of bounds or if the current cell in the maze is a 0 (a wall), the function returns `false`, indicating that this path is not valid.
    - If `x` and `y` are at the bottom-right corner of the maze (destination), the function returns `true`, indicating that a valid path has been found.

4. If none of the base cases are met, the current cell is marked as visited by setting it to 0 in the maze (`maze[x][y] = 0`).

5. The function then recursively explores all four possible directions (up, down, left, and right) from the current cell by making recursive calls:
    - `findPathInMaze(maze, x + 1, y)`: Move down.
    - `findPathInMaze(maze, x - 1, y)`: Move up.
    - `findPathInMaze(maze, x, y + 1)`: Move right.
    - `findPathInMaze(maze, x, y - 1)`: Move left.

6. If any of the recursive calls return `true`, it means a valid path has been found, 
so the function returns `true` to indicate that a path exists.

7. If none of the directions lead to the destination (all recursive calls return `false`), 
the function backtracks by setting the current cell back to 1 in the maze (`maze[x][y] = 1`) and returns `false`.

8. The `main` method prints either "Path exists in the maze." or "No path exists in the maze." 
based on the result of the `findPathInMaze` function.

This code uses a depth-first search (DFS) approach to explore the maze while backtracking 
when necessary. If a path exists, it will find it and return `true`; otherwise, it will return `false`.

*/
