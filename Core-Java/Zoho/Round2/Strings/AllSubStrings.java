package Zoho.Round2.Strings;

public class AllSubStrings {
    public static void main(String[] args) {
        // String input = "abc";
        String input = "ashish";
        fun1(input);
        fun(input);
    }
    static void fun1(String str){
        int len = str.length();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j <= len; j++) {
                String substring = str.substring(i, j);
                System.out.println(substring);
            } 
        }
    }
    static void fun(String str){
        int i = 0;
        while(i<str.length() ){
            int j = i;
            while(j<str.length()){
                String sub = str.substring(i,j+1);
                System.out.println(sub);
                j++;
            }
            i++;
        }
	}
}
