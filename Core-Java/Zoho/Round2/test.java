package Zoho.Round2;
import java.util.*;
public class test
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s = sc.next();
        int space = (s.length()-1)*2;
        char[] arr = new char[s.length()];
        
        int j = 0;
        for(int i=s.length()/2;i<s.length();i++){
            arr[j]=s.charAt(i);
            j++;
        }
        for(int i=0;i<s.length()/2;i++){
            arr[j]=s.charAt(i);
            j++;
        }
        
		
		for(int i=0;i<s.length();i++){
		    if(space>0)
		        System.out.format("%1$"+space+"s", "");
		    for(int k=0;k<i+1;k++){
		        System.out.print(arr[k]);
		    }
		    System.out.print("\n");
		    space = space-2;
		}
	}
}
