package Zoho.Round3.Puzzles;

import java.util.LinkedList;
import java.util.Queue;

class MazeSolver {
    static int[] dx = {-1, 1, 0, 0}; // Possible moves: up, down, left, right
    static int[] dy = {0, 0, -1, 1};

    static boolean isValid(int x, int y, int[][] maze) {
        int rows = maze.length;
        int cols = maze[0].length;
        return x >= 0 && x < rows && y >= 0 && y < cols && maze[x][y] != 1;
    }

    static int shortestPathWithMonster(int[][] maze, int[] start, int[] end, int[] monster) {
        int rows = maze.length;
        int cols = maze[0].length;
        boolean[][] visited = new boolean[rows][cols];

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(start);
        visited[start[0]][start[1]] = true;

        int distance = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int x = curr[0];
                int y = curr[1];

                if (x == end[0] && y == end[1]) {
                    return distance;
                }

                for (int j = 0; j < 4; j++) {
                    int newX = x + dx[j];
                    int newY = y + dy[j];

                    if (isValid(newX, newY, maze) && !visited[newX][newY]) {
                        if (newX == monster[0] && newY == monster[1]) {
                            continue; // Avoid the monster
                        }
                        queue.offer(new int[]{newX, newY});
                        visited[newX][newY] = true;
                    }
                }
            }
            distance++;
        }

        return -1; // No path found
    }

    static void printMaze(int[][] maze) {
        for (int[] row : maze) {
            for (int cell : row) {
                if (cell == 0) {
                    System.out.print(" "); // Empty space
                } else if (cell == 1) {
                    System.out.print("#"); // Wall
                } else if (cell == 2) {
                    System.out.print("M"); // Monster
                } else if (cell == 3) {
                    System.out.print("T"); // Trigger
                } else if (cell == 4) {
                    System.out.print("H"); // Hole
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] maze = {
            {0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 1},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 0}
        };

        int[] start = {0, 0};
        int[] end = {4, 4};
        int[] monster = {2, 2};
        int[] trigger = {1, 3};
        int[] hole = {2, 4};

        int shortestDistance = shortestPathWithMonster(maze, start, end, monster);
        if (shortestDistance != -1) {
            System.out.println("Shortest Path Distance: " + shortestDistance);
        } else {
            System.out.println("No path found!");
        }

        maze[start[0]][start[1]] = 0; // Reset start position
        maze[end[0]][end[1]] = 0; // Reset end position
        maze[monster[0]][monster[1]] = 2; // Add monster
        maze[trigger[0]][trigger[1]] = 3; // Add trigger
        maze[hole[0]][hole[1]] = 4; // Add hole

        System.out.println("Maze:");
        printMaze(maze);
    }
}
