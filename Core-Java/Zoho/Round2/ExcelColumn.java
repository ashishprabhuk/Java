package Zoho.Round2;


public class ExcelColumn{
    public static void main(String[] args) {
        System.out.println(convertToTitle(1));   // Output: A
        System.out.println(convertToTitle(30));  // Output: Z
        System.out.println(convertToTitle(27));  // Output: AA
        System.out.println(convertToTitle(28));  // Output: AB
        System.out.println(convertToTitle(1000)); // Output: ALL
    }

    public static String convertToTitle(int n) {
        StringBuilder result = new StringBuilder();
        
        while (n > 0) {
            n--; // Adjust for 1-based indexing (A=1, B=2, ..., Z=26)
            char ch = (char) ('A' + n % 26);
            result.insert(0, ch);
            n /= 26;
        }
        
        return result.toString();
    }
}

