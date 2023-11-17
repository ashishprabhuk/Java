package Basics;

public class CharacterConversions {
    public static void main(String[] args) {
        char ch1 = '3';
        System.out.println(toNumChar(ch1)); // '3' -> 3
        
        int n = 3;
        System.out.println(NumToChar(n));  // 3 -> 'C'
        
        char ch2 = 'C';  // 'C' -> 3
        System.out.println(charToNum(ch2));
        
    }
    static int toNumChar(char ch){
        int a = ch - '0';
        return a;
    }
    static char NumToChar(int n){
        // n--;
        char ch = (char)('A' + (n-1) % 26);
        return ch;
    }
    static int charToNum(char ch){
        int num = 0;
        num = num * 26 + (ch - 'A' + 1);
        return num;
    }
}
