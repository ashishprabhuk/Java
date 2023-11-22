package Zoho.Round2.Strings;

public class ReplaceConsonantsWithNearestVowels {
    public static void main(String[] args) {
        String inputString = "saranya";
        String result = replacingConsonants(inputString);
        System.out.println(result);
    }

    static String replacingConsonants(String s){
        String str = "aaaeeeeiiiiioooooouuuuuuu";
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            int index = ch[i]-'a'; 
            ch[i] = str.charAt(index);
        }
        return new String(ch);
    }
}
