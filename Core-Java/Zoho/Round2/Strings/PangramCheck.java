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
    public static boolean checkPangram1(String sentence) {
        int[] alphabetCount = new int[26];
        
        sentence = sentence.toLowerCase();
        
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i);
            if (c >= 'a' && c <= 'z') { 
                alphabetCount[c - 'a']++;
            }
        }
        for (int count : alphabetCount) {
            if (count == 0) {
                return false; 
            }
        }
        return true;
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