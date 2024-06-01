package Zoho.Round2.Strings;

public class WordFreqLength {
    public static void main(String[] args) {
        String sentence = "The red fox ,jumps over the lazy dog.";
        System.out.println("Input sentence: " + sentence);

        String[] result = findWordFrequencyAndMaxLength(sentence);
        System.out.println("Most frequent word: " + result[0]);
        System.out.println("Maximum length word: " + result[1]);
    }

    static String[] findWordFrequencyAndMaxLength(String sentence) {
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
        int maxFrequency = 0;
        int maxLength = 0;
        String mostFrequentWord = "";
        String maxLengthWord = "";
        for (String word : words) {
            int i = 0;
            int frequency = 0;
            while (i < words.length) {
                if (word.equals(words[i])) {
                    frequency++;
                }
                i++;
            }
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
            if (word.length() > maxLength) {
                maxLength = word.length();
                maxLengthWord = word;
            }
        }
        return new String[]{mostFrequentWord, maxLengthWord};
    }
}