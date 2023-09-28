package DSA.Strings;

public class ToCharArray {
    public static void main(String[] args) {
        String myString = "Hello, world!";
        char[] charArray = myString.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}

/*
The toCharArray() method in Java is used to convert a string to a character array. 
The length of the output array is equal to the length of the string, and 
the characters in the array are in the same order as the characters in the string.
*/ 
