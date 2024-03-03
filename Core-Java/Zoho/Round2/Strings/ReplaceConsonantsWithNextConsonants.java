package Zoho.Round2.Strings;

class ReplaceConsonantsWithNextConsonants {
    // Function to replace consonants with next immediate consonant alphabetically
    static String replaceConsonants(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i])) {
                s[i] = (s[i] == 'z') ? 'b' : (char) (s[i] + 1);
                if (isVowel(s[i])) { 
                    s[i]++;
                }
            }
        }
        return new String(s);
    }
    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String s = "ashish";
        System.out.println(replaceConsonants(s));
    }
}