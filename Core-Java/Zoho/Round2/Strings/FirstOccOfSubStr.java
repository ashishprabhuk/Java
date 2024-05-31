package Zoho.Round2.Strings;

public class FirstOccOfSubStr {
    public static void main(String[] args) {
        String str = "SadButSad";
        String sub = "Sad";
        System.out.println("First Occurred at: " + FirstOccurrenceOfSubStrBF(str, sub));
        System.out.println("First Occurred at: " + firstOccurrenceOfSubStr(str, sub));
    }
    static int FirstOccurrenceOfSubStrBF(String str, String sub){
        if(str.contains(sub)){
            return str.indexOf(sub);
        }
        return -1;
    }
    
    static int firstOccurrenceOfSubStr(String str, String sub) {
        int strLength = str.length();
        int subLength = sub.length();
        for (int i = 0; i <= strLength - subLength; i++) {
            int j;
            for (j = 0; j < subLength; j++) {
                if (str.charAt(i + j) != sub.charAt(j)) {
                    break;
                }
            }
            if (j == subLength) {
                return i;
            }
        }
        return -1;
    }

    static int firstOccurrenceOfSubStr2(String str, String sub) {
        int[] lps = computeLPSArray(sub);
        int strIndex = 0; 
        int subIndex = 0;
        while (strIndex < str.length()) {
            if (str.charAt(strIndex) == sub.charAt(subIndex)) {
                strIndex++;
                subIndex++;
                if (subIndex == sub.length()) {
                    return strIndex - subIndex;
                }
            } else {
                if (subIndex != 0) {
                    subIndex = lps[subIndex - 1];
                } else {
                    strIndex++;
                }
            }
        }
        return -1;
    }
    static int[] computeLPSArray(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0;
        int i = 1;
        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len != 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }
        return lps;
    }
}
