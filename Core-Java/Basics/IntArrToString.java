package Basics;

import java.util.Arrays;

public class IntArrToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        String str = method1(arr); // output: "12345" as strings 
        System.out.println(str.charAt(2));
        System.out.println(str.substring(2, 4));
        System.out.println(method2(arr)); // output: [1, 2, 3, 4, 5] 
    }
    static String method1(int[] arr){
        // Concatenating elements
        StringBuilder result = new StringBuilder();
        for (int num : arr) {
            result.append(num);
        }
        return result.toString();
    }
    static String method2(int[] arr){
        // Using Arrays.toString()
        return Arrays.toString(arr);
    }
}
