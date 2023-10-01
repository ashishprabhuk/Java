package Zoho.Round2;
import java.util.*;

public class WordFrequency {
    public static void main(String[] args) {
        String passage = "jana Gana Mana jana";
        String[] words = passage.split("\\s+");

        Map<String, List<Integer>> wordOccurrences = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            if (!wordOccurrences.containsKey(word)) {
                wordOccurrences.put(word, new ArrayList<>());
            }

            wordOccurrences.get(word).add(i);
        }

        for (Map.Entry<String, List<Integer>> entry : wordOccurrences.entrySet()) {
            String word = entry.getKey();
            List<Integer> indices = entry.getValue();

            System.out.println(word + " - " + indices.size() + " occurrences at indices: " + indices);
        }
    }
}
