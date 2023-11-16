package Basics;

public class CharacterConversions {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(NumToChar(n));  // 3 -> 'C'
        
        char ch2 = 'C';  // 'C' -> 3
        System.out.println(charToNum(ch2));
        
        char ch1 = '3';
        System.out.println(toNumChar(ch1)); // '3' -> 3
    }
    static char NumToChar(int n){
        // n--;
        char ch = (char)('A' + (n-1) % 26);
        return ch;
    }

    static int toNumChar(char ch){
        int a = ch - '0';
        return a;
    }

    static int charToNum(char ch){
        int result = 0;
        result = result * 26 + (ch - 'A' + 1);
        return result;
    }
}
