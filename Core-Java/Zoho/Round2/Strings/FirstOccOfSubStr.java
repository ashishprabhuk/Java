package Zoho.Round2.Strings;

public class FirstOccOfSubStr {
    public static void main(String[] args) {
        String str = "SadButSad";
        String sub = "Sad";
        System.out.println("First Occurred at: " + FirstOccurrenceOfSubStr(str, sub));
    }
    static int FirstOccurrenceOfSubStr(String str, String sub){
        if(str.contains(sub)){
            return str.indexOf(sub);
        }
        return -1;
    }
}
