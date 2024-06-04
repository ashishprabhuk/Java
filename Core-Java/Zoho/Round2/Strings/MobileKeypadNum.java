package Zoho.Round2.Strings;

import java.util.Arrays;

public class MobileKeypadNum {
    public static void main(String[] args) {
        String[] keys = 
        {"2","22","222", "3", "33","333","4", "44","444",
        "5","55","555","6","66","666","7","77","777","7777",
        "8","88","888","9","99","999","9999"};
        char[] ch = 
        {'a','b','c','d','e','f','g','h','i',
        'j','k','l','m','n','o','p','q','r','s',
        't','u','v','w','x','y','z'};
        String str = "999966644666_2226667666777028444666_660";
        System.out.println(mobileKeys(str, keys, ch));
    }
    static String mobileKeys(String str, String[] keys, char[] ch){
        String st = "";
        String[] strs = new String[str.length()];
        for(int i = 1; i<=str.length(); i+=strs[i].length()) {
            strs[i] = getNumPairs(str, i-1, i);
            if(strs[i] != null){
                System.out.println("Arr: " + strs[i]);
                int j = 0;
                while(i<=str.length() && j<keys.length){
                    if(strs[i].equals(keys[j])){
                        st += ch[j];
                        System.out.println(st);
                    }
                    if(strs[i].equals("_")){
                        st += " ";
                        break;
                    }
                    if(strs[i].equals("0")){
                        st += ".";
                        break;
                    }
                    j++;
                }
            }
        }
        System.out.println(Arrays.toString(strs));
        return st;
    }
    static String getNumPairs(String str, int start, int end){
        String st = ""; 
        while(start<=str.length() && end<=str.length()){
            if (str.charAt(start) != str.charAt(end)){
                break;
            }
            end++;
        }
        st += str.substring(start,end);
        return st;
    }
}
