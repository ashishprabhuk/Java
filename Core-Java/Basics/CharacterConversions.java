package Basics;

public class CharacterConversions {
    public static void main(String[] args) {
        char ch1 = '2';
        System.out.println(toNumChar(ch1)); // '2' -> 2
        
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
        char ch = (char)('A' + (n-1) % 26);
        return ch;
    }
    
    static int charToNum(char ch){
        int num = ch - 'A' + 1;
        return num;
    }
    
}
