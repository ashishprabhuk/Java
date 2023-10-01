package Zoho.Round2;

public class SubStringIndex {
    public static void main(String[] args) {
        String string1 = "ashishprabhu2143";
        String string2 = "2143";
        
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
