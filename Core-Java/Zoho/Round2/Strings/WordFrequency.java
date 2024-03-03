package Zoho.Round2.Strings;

public class WordFrequency {
    public static void main(String[] args) {
        String passage = "jana Gana Mana jana";
        wordFrequencies(passage);
    }

    public static void wordFrequencies(String passage) {
        String[] words = passage.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i] == null) {
                continue;
            }
            int count = 1; 
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    count++;
                    words[j] = null;
                }
            }
            System.out.println(words[i] + " - " + count + " occurrences");
        }
    }
}
