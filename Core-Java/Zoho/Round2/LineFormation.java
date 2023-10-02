package Zoho.Round2;

import java.util.ArrayList;
import java.util.List;

public class LineFormation {
    public static void main(String[] args) {
        int maxCharsPerLine = 10;
        char favoriteChar = 'o';
        String[] words = { "Zoho", "Eating", "Watching", "Pogo", "Loving", "Mango" };

        List<String> lines = formLines(maxCharsPerLine, favoriteChar, words);

        for (String line : lines) {
            System.out.println(line);
        }
    }

    public static List<String> formLines(int maxCharsPerLine, char favoriteChar, String[] words) {
        List<String> lines = new ArrayList<>();
        StringBuilder line = new StringBuilder();
        int lineLength = 0;

        for (String word : words) {
            int wordLength = word.length();

            if (lineLength + wordLength <= maxCharsPerLine) {
                if (lineLength > 0) {
                    line.append(" ");
                    lineLength++;
                }
                line.append(word);
                lineLength += wordLength;
            } else {
                lines.add(line.toString());
                line = new StringBuilder(word);
                lineLength = wordLength;
            }
        }

        if (lineLength > 0) {
            lines.add(line.toString());
        }

        List<String> formattedLines = new ArrayList<>();
        StringBuilder currentLine = new StringBuilder();
        for (String lineStr : lines) {
            String[] lineWords = lineStr.split(" ");
            for (String word : lineWords) {
                if (currentLine.length() + word.length() <= maxCharsPerLine) {
                    if (currentLine.length() > 0) {
                        currentLine.append(" ");
                    }
                    currentLine.append(word);
                } else {
                    formattedLines.add(currentLine.toString());
                    currentLine = new StringBuilder(word);
                }
            }
        }

        if (currentLine.length() > 0) {
            formattedLines.add(currentLine.toString());
        }

        for (int i = 0; i < formattedLines.size(); i++) {
            String currentLineStr = formattedLines.get(i);
            if (currentLineStr.toLowerCase().indexOf(Character.toLowerCase(favoriteChar)) != -1) {
                formattedLines.set(i, currentLineStr.replace(Character.toLowerCase(favoriteChar),
                        Character.toUpperCase(favoriteChar)));
            }
        }

        return formattedLines;
    }
}