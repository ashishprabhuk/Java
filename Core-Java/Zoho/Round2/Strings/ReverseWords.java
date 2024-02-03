package Zoho.Round2.Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String input1 = "one two three";
        String input2 = "I love india";

        String reversed1 = reverseString(input1);
        System.out.println("Output : " + reversed1); //three two one 
        
        String reversed2 = revWords(input2);
        System.out.println("Output : " + reversed2); //india love I
    }
    
    static String reverseString(String str) {
        String[] words = str.split(" ");
        return reverseWords(words, words.length - 1);
    }
    public static String reverseWords(String[] words, int index) {
        if (index < 0) return ""; // Base case: no more words to reverse
        return words[index] + " " + reverseWords(words, index - 1);
    }

//-----------------------------------------------------------------

    static String revWords(String str){
        String[] ch = str.split(" ");
        int s = 0;
        int e = ch.length - 1;
        while(s<e){
            String t = ch[s];
            ch[s] = ch[e];
            ch[e]=t;
            s++;
            e--;
        }
        return String.join(" ", ch);
	}
}

