package Zoho.Round2.Strings;

public class StrPermutation {
    public static void main(String[] args) {
        String str = "ABC";
        combinations("", str);
        // combinations(str.toCharArray(), 0);
    }

    public static void combinations(String current, String remaining) {
        System.out.println(current);
        for (int i = 0; i < remaining.length(); i++) {
            combinations(current + remaining.charAt(i), remaining.substring(0, i) + remaining.substring(i + 1));
        }
    }
        /*
        ''
        i = 0, j = 3
        com(''+A, 'BC')
            'A'
            i = 0, j = 2
            com('A'+B, 'C')
                'AB'
                i = 0, j = 1
                com('AB'+C, '')
                    'ABC'
                i = 1, j = 2
                com('A'+C, 'B')
                    'AC'
            i = 1, j = 3
            com(''+B, 'AC')
                'B'
                i = 0, j = 2
                com('B'+A, 'C')
                    'BA'
                    i = 0, j = 1
                    com('BA'+C, '')
                        'BAC'
                i = 1, j = 3
                com('B'+C, 'A')
                    'BC'
            i = 2, j = 3
            com(''+C, 'AB')
                'C'
                i = 0, j = 1
                com('C'+A, 'B')
                    'CA'
                    i = 0, j = 1
                    com('CA'+B, '')
                        'CAB'
                i = 1, j = 2
                com('C'+B, 'A')
                    'CB'
        */
    
}


/*
Write a program to print all permutations of a
given string. Note here you need to take all
combinations as well, say for the input ABC the
output should be as follows:
Input: ABC
Output:
A
B C
AB AC BA BC CA CB
ABC ACB BCA BAC CBA CAB
*/