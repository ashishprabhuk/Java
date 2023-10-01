package DSA.Strings;

public class StringMethods {
    public static void main(String[] args) {
        // Declare a string
        String str = "Hello, World!";

        // 1. length() method
        int length = str.length();
        System.out.println("Length of the string: " + length);

        // 2. charAt(int index) method
        char ch = str.charAt(7);
        System.out.println("Character at index 7: " + ch);

        // 3. substring(int beginIndex, int endIndex) method
        String subStr = str.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + subStr);

        // 4. equals(Object obj) method
        String compareStr = "Hello, World!";
        boolean isEqual = str.equals(compareStr);
        System.out.println("Strings are equal: " + isEqual);

        // 5. compareTo(String anotherString) method
        String str1 = "apple";
        String str2 = "banana";
        int result = str1.compareTo(str2);
        System.out.println("Comparison result: " + result);

        // 6. indexOf(String str) method
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);

        // 7. replace(CharSequence target, CharSequence replacement) method
        String newStr = str.replace("World", "Universe");
        System.out.println("Updated string: " + newStr);
    }
}
