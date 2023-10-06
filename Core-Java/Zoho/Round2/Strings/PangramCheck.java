package Zoho.Round2.Strings;
import java.util.*;

public class PangramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        boolean isPangram = checkPangram(sentence);
        System.out.println("Is Pangram: " + isPangram);

        scanner.close();
    }

    public static boolean checkPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<Character>();
    
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(Character.toLowerCase(c));
            }
        }
    
        return alphabetSet.size() == 26; // There are 26 letters in the English alphabet
    }
}
