package Zoho.Round2.Strings;

public class ReplaceConsonantsWithNearestVowels {
    public static void main(String[] args) {
        String inputString = "saranya";
        String result = replacingConsonants(inputString);
        System.out.println(result);
    }

    static String replacingConsonants(String s){
        //an array of size 26 that stores nearest vowel for every character. 
        String str = "aaaeeeeiiiiioooooouuuuuuuu";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int index = ch[i]-'a'; 
            ch[i] = str.charAt(index);
        }
        return new String(ch);
    }
}
