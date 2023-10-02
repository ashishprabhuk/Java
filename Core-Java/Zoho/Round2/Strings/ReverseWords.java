package Zoho.Round2.Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String input1 = "one two three";
        String input2 = "I love india";

        System.out.println("Before : " + input1);
        String reversed1 = reverseString(input1);
        System.out.println("Output : " + reversed1);
        
        System.out.println("Before : " + input2);
        String reversed2 = reverseString(input2);
        System.out.println("Output : " + reversed2);
    }
    
    public static String reverseString(String input) {
        // Split the input string into words using space as a delimiter
        String[] words = input.split(" ");
        return reverseWords(words, words.length - 1);
    }
    
    public static String reverseWords(String[] words, int index) {
        if (index < 0) {
            return ""; // Base case: no more words to reverse
        }
        
        // Recursively reverse the words and concatenate them
        return words[index] + " " + reverseWords(words, index - 1);
    }
}

