// // package Zoho.Round2.Strings;

// // import java.util.Arrays;

// // public class MobileKeypadNum {
// //     public static void main(String[] args) {
// //         String[] keys = 
// //         {"2","22","222", "3", "33","333","4", "44","444",
// //         "5","55","555","6","66","666","7","77","777","7777",
// //         "8","88","888","9","99","999","9999"};
// //         char[] ch = 
// //         {'a','b','c','d','e','f','g','h','i',
// //         'j','k','l','m','n','o','p','q','r','s',
// //         't','u','v','w','x','y','z'};
// //         String str = "2777744444777744_777722244880";
// //         // String str = "999966644666_222666766677728444666660";
// //         System.out.println(mobileKeys(str, keys, ch));
// //     }
// //     static String mobileKeys(String str, String[] keys, char[] ch){
// //         String st = "";
// //         String[] strs = new String[str.length()+1];
// //         for(int i = 1; i<=str.length(); i+=strs[i].length()) {
// //             strs[i] = getNumPairs(str, i-1, i);
// //             if(strs[i] != null){
// //                 System.out.println("Arr: " + strs[i]);
// //                 int j = 0;
// //                 while(i<=str.length() && j<keys.length){
// //                     if(strs[i].equals(keys[j])){
// //                         st += ch[j];
// //                         System.out.println(st);
// //                     }
// //                     if(strs[i].equals("_")){
// //                         st += " ";
// //                         break;
// //                     }
// //                     if(strs[i].equals("0")){
// //                         st += ".";
// //                         break;
// //                     }
// //                     j++;
// //                 }
// //             }
// //         }
// //         System.out.println(Arrays.toString(strs));
// //         return st;
// //     }
// //     static String getNumPairs(String str, int start, int end){
// //         String st = ""; 
// //         while(start<str.length() && end<str.length()){
// //             if (str.charAt(start) != str.charAt(end)){
// //                 break;
// //             }
// //             end++;
// //         }
// //         st += str.substring(start,end);
// //         return st;
// //     }
// // }

// package Zoho.Round2.Strings;

// public class MobileKeypadNum {
//     public static void main(String[] args) {
//         String[] keys = 
//         {"2","22","222", "3", "33","333","4", "44","444",
//         "5","55","555","6","66","666","7","77","777","7777",
//         "8","88","888","9","99","999","9999"};
//         // String str = "2777744444777744_777722244880";
//         String str = "999966644666_222666777766677728444666660";
//         System.out.println(mobileKeys(str, keys));
//     }

//     static String mobileKeys(String str, String[] keys){
//         StringBuilder st = new StringBuilder();
//         int i = 0;
//         while (i < str.length()) {
//             String numPair = getNumPairs(str, i);
//             if (numPair != null) {
//                 i += numPair.length(); // Move the index to the next segment
//                 if (numPair.equals("_")) {
//                     st.append(" ");
//                 } else if (numPair.equals("0")) {
//                     st.append(".");
//                 } else {
//                     for (int j = 0; j < keys.length; j++) {
//                         if (numPair.equals(keys[j])) {
//                             st.append((char) ('a' + j));
//                             break;
//                         }
//                     }
//                 }
//             } else {
//                 i++; // Move to the next character if no numPair found 
//             }
//         }
//         return st.toString();
//     }

//     static String getNumPairs(String str, int start) {
//         int end = start;
//         while (end < str.length() && str.charAt(start) == str.charAt(end)) {
//             end++;
//         }
//         return str.substring(start, end);
//     }
// }
package Zoho.Round2.Strings;

public class MobileKeypadNum {
    // Mapping of numbers to characters based on mobile keypad
    static final String[] KEYPAD = {
        ".",    // 0
        " ",    // 1 -> space (assuming 1 is space based on common interpretations)
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public static void main(String[] args) {
        String input = "999966644666_222666777-766677728444666-660";
        String str = "2777744-444777744_7-7772-224488_550";
        String output = decodeMessage(input);
        System.out.println(output); // Should print "zoho corporation"
    }

    public static String decodeMessage(String str) {
        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < str.length()) {
            char currentChar = str.charAt(i);

            if (currentChar == '0') {
                result.append('.');
                i++;
                continue;
            } else if (currentChar == '_') {
                result.append(' ');
                i++;
                continue;
            }

            // Check if the current character is a digit
            if (!Character.isDigit(currentChar)) {
                i++;
                continue;
            }

            int count = 0;
            while (i + count < str.length() && str.charAt(i + count) == currentChar) {
                count++;
            }

            int digit = Character.getNumericValue(currentChar);
            int index = (count - 1) % KEYPAD[digit].length();
            result.append(KEYPAD[digit].charAt(index));

            i += count;
        }

        return result.toString();
    }
}
