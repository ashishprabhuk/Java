package Zoho.Round2.Maths; 
import java.util.*;

public class SecondMostFreqNumber{
    public static void main (String[] args) {
        int num = 1122222333;
        int secFreq = secOcc(num);
        if(secFreq != 0) 
            System.out.println(secFreq);
        else 
            System.out.println("No second freq number");
    }

    static int secOcc(int num){
        String str = Integer.toString(num);
        char[] ch = str.toCharArray();
        int[] count = new int[10];
        for(char c: ch){
            int n = c - '0';
            count[n]++;
        }

        int first = 0, second = 0;
        for(int i = 0; i<10; i++){
            if(count[i] > count[first]){
                second = first;
                first = i;
            } else if(count[i] > count[second] && count[i] != count[first]){
                second = i;
            }
        }
        return second;
    }
}
