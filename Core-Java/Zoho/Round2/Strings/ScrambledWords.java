package Zoho.Round2.Strings;

public class ScrambledWords {
    public static void main(String[] args) {
        String input = "hello world";
        String output = scrambleWords(input);
        System.out.println(output);
    }

    private static String scrambleWords(String input) {
        String[] words = input.split("\\s+"); //same -> input.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(scramble(word)).append(" ");
        }
        return result.toString().trim();
    }

    private static String scramble(String word) {
        if (word.length() <= 2) {
            return word;
        }
        char[] characters = word.toCharArray();
        for (int i = 1; i < characters.length - 1; i += 2) {
            char temp = characters[i];
            characters[i] = characters[i + 1];
            characters[i + 1] = temp;
        }
        return new String(characters);
    }
}
