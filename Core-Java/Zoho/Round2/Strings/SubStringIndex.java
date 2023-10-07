package Zoho.Round2.Strings;

public class SubStringIndex {
    public static void main(String[] args) {
        String string1 = "test123string";
        String string2 = "123";
        
        int result = findSubstringIndex(string1, string2);
        
        if (result != -1) {
            System.out.println("Present at index : " + result);
        } else {
            System.out.println("Not Present : -1");
        }
    }
    
    public static int findSubstringIndex(String string1, String string2) {
        return string1.indexOf(string2);
    }
}


/*
Find if a String2 is substring of String1. If it is,
return the index of the first occurrence. else return
-1.
Eg 1:Input:
String 1: test123string
String 2: 123
Output: 4
Eg 2: Input:
String 1: testing12
String 2: 1234
Output: -1
*/