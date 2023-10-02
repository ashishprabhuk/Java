package Zoho.Round3.Puzzles;

import java.util.Random;
import java.util.Scanner;

class DungeonGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the dungeon with size
        Dungeon dungeon = new Dungeon(5, 5);

        // Create an adventurer, monster, treasure, and pits
        Adventurer adventurer = new Adventurer(dungeon);
        Monster monster = new Monster(dungeon);
        Treasure treasure = new Treasure(dungeon);
        Pits pits = new Pits(dungeon);

        // Main game loop
        while (true) {
            // Display the current state of the dungeon
            dungeon.display();

            // Get adventurer's move from the user
            System.out.println("Enter your move (w/a/s/d): ");
            char move = scanner.next().charAt(0);

            // Update the game state
            adventurer.move(move);
            monster.move();
            treasure.checkDistance();
            pits.checkFall();

            // Check for game over conditions
            if (adventurer.isDead()) {
                System.out.println("Game Over! Adventurer has been caught by the monster.");
                break;
            } else if (adventurer.hasReachedTreasure()) {
                System.out.println("Congratulations! Adventurer has found the treasure.");
                break;
            }
        }

        scanner.close();
    }
}

class Dungeon {
    char[][] grid; // Representing the dungeon layout
    int rows;
    int cols;
    int adventurerX;
    int adventurerY;

    // Constructor to initialize the dungeon size
    public Dungeon(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        grid = new char[rows][cols];
        initializeDungeon();
    }

    private void initializeDungeon() {
        // Initialize the grid with walls and empty spaces
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                grid[i][j] = ' ';
            }
        }
    }

    public void setElement(int x, int y, char element) {
        grid[x][y] = element;
    }

    public void display() {
    System.out.println("-------");
    // Display the current state of the dungeon with square brackets
    for (int i = 0; i < rows; i++) {
        System.out.print("|");
        for (int j = 0; j < cols; j++) {
            System.out.print(grid[i][j]);
        }
        System.out.println("|");
    }
    System.out.println("-------");
}


    public int getAdventurerX() {
        return adventurerX;
    }

    public int getAdventurerY() {
        return adventurerY;
    }

    // Add methods to get and set grid elements, check boundaries, etc.
}

class Adventurer {
    private int x, y; // Current position
    private Dungeon dungeon;

    public Adventurer(Dungeon dungeon) {
        this.dungeon = dungeon;
        x = 0; // Starting position
        y = 0;
        dungeon.setElement(x, y, 'A'); // Place adventurer on the grid
        dungeon.adventurerX = x;
        dungeon.adventurerY = y;
    }

    public void move(char direction) {
        // Implement adventurer's movement logic
        int newX = x;
        int newY = y;

        switch (direction) {
            case 'w':
                newX--;
                break;
            case 's':
                newX++;
                break;
            case 'a':
                newY--;
                break;
            case 'd':
                newY++;
                break;
        }

        // Check if the new position is valid (within boundaries)
        if (isValidMove(newX, newY)) {
            // Update the grid and position
            dungeon.setElement(x, y, ' ');
            x = newX;
            y = newY;
            dungeon.setElement(x, y, 'A');
            dungeon.adventurerX = x;
            dungeon.adventurerY = y;
        }
    }

    private boolean isValidMove(int newX, int newY) {
        // Check if the new position is within the dungeon boundaries
        return newX >= 0 && newX < dungeon.rows && newY >= 0 && newY < dungeon.cols;
    }

    public boolean isDead() {
        // Check if adventurer is caught by the monster
        return dungeon.grid[x][y] == 'M';
    }

    public boolean hasReachedTreasure() {
        // Check if adventurer has reached the treasure
        return dungeon.grid[x][y] == 'T';
    }

    // Add other methods as needed
}

class Monster {
    private int x, y; // Current position
    private Dungeon dungeon;

    public Monster(Dungeon dungeon) {
        this.dungeon = dungeon;
        x = dungeon.rows - 1; // Starting position (bottom-left corner)
        y = dungeon.cols - 1;
        dungeon.setElement(x, y, 'M'); // Place monster on the grid
    }

    public void move() {
        // Implement monster's movement logic
        int newX, newY;

        // Generate random movement for the monster
        Random random = new Random();
        int move = random.nextInt(4); // 0: up, 1: down, 2: left, 3: right

        switch (move) {
            case 0:
                newX = x - 1;
                newY = y;
                break;
            case 1:
                newX = x + 1;
                newY = y;
                break;
            case 2:
                newX = x;
                newY = y - 1;
                break;
            case 3:
                newX = x;
                newY = y + 1;
                break;
            default:
                newX = x;
                newY = y;
        }

        // Check if the new position is valid (within boundaries)
        if (isValidMove(newX, newY)) {
            // Update the grid and position
            dungeon.setElement(x, y, ' ');
            x = newX;
            y = newY;
            dungeon.setElement(x, y, 'M');
        }
    }

    private boolean isValidMove(int newX, int newY) {
        // Check if the new position is within the dungeon boundaries
        return newX >= 0 && newX < dungeon.rows && newY >= 0 && newY < dungeon.cols;
    }
}

class Treasure {
    private int x, y; // Current position
    private Dungeon dungeon;

    public Treasure(Dungeon dungeon) {
        this.dungeon = dungeon;
        // Generate a random position for the treasure
        Random random = new Random();
        x = random.nextInt(dungeon.rows);
        y = random.nextInt(dungeon.cols);
        dungeon.setElement(x, y, 'T'); // Place treasure on the grid
    }

    public void checkDistance() {
        // Implement logic to check distance between adventurer and treasure
        int distance = Math.abs(x - dungeon.getAdventurerX()) + Math.abs(y - dungeon.getAdventurerY());
        if (distance < 2) {
            System.out.println("You are close to the treasure!");
        }
    }
}

class Pits {
    private int x, y; // Current position
    private Dungeon dungeon;

    public Pits(Dungeon dungeon) {
        this.dungeon = dungeon;
        // Generate a random position for the pits
        Random random = new Random();
        x = random.nextInt(dungeon.rows);
        y = random.nextInt(dungeon.cols);
        dungeon.setElement(x, y, 'P'); // Place pits on the grid
    }

    public void checkFall() {
        // Implement logic to check if adventurer falls into pits
        if (x == dungeon.getAdventurerX() && y == dungeon.getAdventurerY()) {
            System.out.println("You fell into a pit! Game Over.");
            System.exit(0);
        }
    }
}
