package Zoho.Round3.Puzzles;

import java.util.*;

class Player {
    String name;
    double score;

    Player(String name) {
        this.name = name;
        this.score = 0;
    }
}

class Match {
    Player player1;
    Player player2;
    double result;

    Match(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    void playMatch() {
        Random rand = new Random();
        int winner = rand.nextInt(3); // 0 for player 1, 1 for player 2, 2 for a tie

        if (winner == 0) {
            player1.score += 1;
        } else if (winner == 1) {
            player2.score += 1;
        } else {
            player1.score += 0.5;
            player2.score += 0.5;
        }
    }
}

public class ChessTournament {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<>();
        players.add(new Player("Player 1"));
        players.add(new Player("Player 2"));
        // Add more players as needed

        int round = 1;
        while (players.size() > 1) {
            System.out.println("Round " + round + ":");
            List<Match> matches = createMatches(players);
            for (Match match : matches) {
                match.playMatch();
                System.out.println(match.player1.name + " vs " + match.player2.name + ": " + getResult(match));
            }
            players = getWinners(players);
            round++;
        }

        System.out.println("Chess Tournament Winner: " + players.get(0).name);
        System.out.println("Final Scores:");
        for (Player player : players) {
            System.out.println(player.name + ": " + player.score);
        }
    }

    private static List<Match> createMatches(List<Player> players) {
        List<Match> matches = new ArrayList<>();
        Collections.shuffle(players); // Shuffle players to randomize matches
        for (int i = 0; i < players.size(); i += 2) {
            if (i + 1 < players.size()) {
                matches.add(new Match(players.get(i), players.get(i + 1)));
            }
        }
        return matches;
    }

    private static List<Player> getWinners(List<Player> players) {
        List<Player> winners = new ArrayList<>();
        Collections.sort(players, (p1, p2) -> Double.compare(p2.score, p1.score)); // Sort players by score
        winners.add(players.get(0)); // Add the player with the highest score to winners
        return winners;
    }

    private static String getResult(Match match) {
        if (match.player1.score > match.player2.score) {
            return match.player1.name + " wins";
        } else if (match.player2.score > match.player1.score) {
            return match.player2.name + " wins";
        } else {
            return "Tie";
        }
    }
}
