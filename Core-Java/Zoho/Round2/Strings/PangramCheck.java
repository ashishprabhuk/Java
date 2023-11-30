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
        Set<Character> alphabet = new HashSet<Character>();
    
        for (char c : sentence.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabet.add(Character.toLowerCase(c));
            }
        }
        return alphabet.size() == 26;
    }
}

/*
Pangram Checking
Check whether all english alphabets are present in
the given sentence or not
I/P: abc defGhi JklmnOP QRStuv wxyz
O/P: True

I/P: abc defGhi JklmnOP QRStuv
O/P: False
 */