package Zoho.Round2.Strings;

class ReplaceConsonantsWithNextConsonants {
    // Function to replace consonants with next immediate consonant alphabetically
    static String replaceConsonants(String str) {
        char[] s = str.toCharArray();
        for (int i = 0; i < s.length; i++) {
            if (!isVowel(s[i])) {
                s[i] = (s[i] == 'z') ? 'b' : (char) (s[i] + 1);
                
                if (isVowel(s[i])) { // If the next immediate alphabet is a vowel, move to the next one
                    s[i]++;
                }
            }
        }
        return String.valueOf(s);
    }

    static boolean isVowel(char ch) {
        return "aeiouAEIOU".indexOf(ch) != -1;
    }

    public static void main(String[] args) {
        String s = "ashish";
        System.out.println(replaceConsonants(s));
    }
}


// static String replaceConsonants(char[] s)
//     {
//         for (int i = 0; i < s.length; i++) {
//             if (!isVowel(s[i])) {
 
//                 if (s[i] == 'z') {
//                     s[i] = 'b';
//                 }

//                 else {
 
//                     s[i] = (char)(s[i] + 1);
 
//                     if (isVowel(s[i])) {
//                         s[i] = (char)(s[i] + 1);
//                     }
//                 }
//             }
//         }
//         return String.valueOf(s);
//     }
