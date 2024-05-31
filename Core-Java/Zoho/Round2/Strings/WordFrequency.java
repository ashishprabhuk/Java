package Zoho.Round2.Strings;

public class WordFrequency {
    public static void main(String[] args) {
        String passage = "jana Gana Mana jana";
        wordFrequencies(passage);
    }

    public static void wordFrequencies(String passage) {
        String[] words = passage.split(" ");
        int[] frequencies = new int[words.length];
        int[] positions = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            int count = 1;
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (words[i].equals(words[j])) {
                    found = true;
                    count += frequencies[j];
                    frequencies[j] = 0; // Mark the previous occurrence as counted
                    break;
                }
            }
            if (!found) {
                frequencies[i] = count;
                positions[i] = i;
            } else {
                frequencies[i] = count;
                positions[i] = -1; // Mark as a duplicate occurrence
            }
        }

        for (int i = 0; i < words.length; i++) {
            if (frequencies[i] > 0) {
                System.out.print(words[i] + " - " + frequencies[i] + " occurrences at positions: ");
                
                // Inline the printPositions function
                for (int j = 0; j < words.length; j++) {
                    if (words[j].equals(words[i]) && positions[j] != -1) {
                        System.out.print(positions[j] + " ");
                    }
                }
                
                System.out.println();
            }
        }
    }
}