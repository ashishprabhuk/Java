package Zoho.Round2.Maths;

public class CharacterCount {
    public static void main(String[] args) {
        int n = 13;
        int count = countCharacters(n);
        System.out.println(count);
    }

    public static int countCharacters(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count += Integer.toString(i).length();
        }
        return count;
    }
}

/*
@ To find the number of characters written on the paper when writing numbers from 1 to n,
You’re given a number n. If write all the numbers
from 1 to n in a paper, we have to find the number
of characters written on the paper.For example if
n=13, the output should be 18 if n = 101, the
output should be 195
 */