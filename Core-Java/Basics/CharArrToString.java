package Basics;

public class CharArrToString {
    public static void main(String args[]){
        char s[] = {'a','s','h','i','s','h'};
        System.out.println(method1(s));
        System.out.println(method2(s));
        System.out.println(method3(s));
    }
    public static String method1(char[] arr){
        return new String(arr); // Creating object of String class
    }

    public static String method2(char[] a){
        // Creating an object of String class
        String string = String.valueOf(a);
        return string;
    }

    public static String method3(char[] a){
        // Creating object of String class
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {// Creating a string using append() method
            sb.append(a[i]);
        }
        return sb.toString();
    }

}
