package Basics;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {
        // length()
        String str = "Hello, World!";
        int length = str.length();
        System.out.println("Length of the string: " + length); // Output: Length of the string: 13

        // charAt(int index)
        char character = str.charAt(2);
        System.out.println("Character at index 2: " + character); // Output: Character at index 2: l

        // concat(String str)
        String str1 = "Hello";
        String str2 = "World";
        String result = str1.concat(str2);
        System.out.println("Concatenated string: " + result); // Output: Concatenated string: HelloWorld

        // toUpperCase() and toLowerCase()
        String upperCase = str.toUpperCase();
        String lowerCase = str.toLowerCase();
        System.out.println("Uppercase: " + upperCase); // Output: Uppercase: HELLO, WORLD!
        System.out.println("Lowercase: " + lowerCase); // Output: Lowercase: hello, world!

        // indexOf(String str)
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index); // Output: Index of 'World': 7

        // substring(int beginIndex, int endIndex)
        String substring = str.substring(7, 12);
        System.out.println("Substring: " + substring); // Output: Substring: World

        // startsWith(String prefix) and endsWith(String suffix)
        boolean startsWithHello = str.startsWith("Hello");
        boolean endsWithWorld = str.endsWith("World");
        System.out.println("Starts with 'Hello': " + startsWithHello); // Output: Starts with 'Hello': true
        System.out.println("Ends with 'World': " + endsWithWorld); // Output: Ends with 'World': true

        // replace(char oldChar, char newChar) and replace(CharSequence target, CharSequence replacement)
        String st1 = "ashishprabhu";
        String st2 = "ashishprabhu";
        String replaced1 = st1.replace('a', 'x');
        String replaced2 = st2.replace("ashish", "apk");
        System.out.println("After replace (char): " + replaced1); // Output: After replace (char): Hello, World!
        System.out.println("After replace (String): " + replaced2); // Output: After replace (String): Hello, World!


        String strs = "   Trim me   ";
        String trimmed = strs.trim();
        System.out.println("Trimmed string: " + trimmed);
        // Output: Trimmed string: Trim me

        String s = "";
        boolean isEmpty = s.isEmpty();
        System.out.println("Is the string empty? " + isEmpty);
        // Output: Is the string empty? true


        String s10 = "hello";
        String s20 = "HELLO";
        boolean isEqualIgnoreCase = s10.equalsIgnoreCase(s20);
        System.out.println("Are the strings equal (ignore case)? " + isEqualIgnoreCase);
        // Output: Are the strings equal (ignore case)? true


        String strc = "Java Programming";
        boolean containsJava = strc.contains("Java");
        System.out.println("Does the string contain 'Java'? " + containsJava);
        // Output: Does the string contain 'Java'? true


        String s1="hello";  
        String s2="hello";  
        String s3="meklo";  
        String s4="hemlo";  
        String s5="flag";  
        System.out.println(s1.compareTo(s2));//0 because both are equal  
        System.out.println(s1.compareTo(s3));//-5 because "h" is 5 times lower than "m"  
        System.out.println(s1.compareTo(s4));//-1 because "l" is 1 times lower than "m"  
        System.out.println(s1.compareTo(s5));//2 because "h" is 2 times greater than "f"  
        // Output: Comparison result: -1 (lexicographically earlier)


        String strSplit = "apple,orange,banana";
        String[] fruits = strSplit.split(",");
        System.out.println("Split string: " + Arrays.toString(fruits));
        // Output: Split string: [apple, orange, banana]

        String strJoin = String.join("","ashish", "prabhu", "k"); 
        System.out.println(strJoin); //ashishprabhuk
        String strJoin1 = String.join(" ", "Wake up", "Eat", "Sleep", "Wake up"); 
        System.out.println(strJoin1); //Wake up Eat Sleep Wake up
        String strJoin2 = String.join("-> ", "Wake up", "Eat", "Sleep", "Wake up"); 
        System.out.println(strJoin2); //Wake up-> Eat-> Sleep-> Wake up

        int number = 21;
        String strNumber = String.valueOf(number);
        System.out.println("String representation of the number: " + strNumber);
        // Output: String representation of the number: 21
    }
}
