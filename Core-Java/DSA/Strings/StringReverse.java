package DSA.Strings;

public class StringReverse {
    public static void main(String[] args) {
        String input = "Hello, World!";
        System.out.println("Normal string:   " + input);
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    
    static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        while (left < right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}

