package Zoho.Round2.Strings;

import java.util.Scanner;

public class Deloitte {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String phone = sc.nextLine();
        String last4num = "";  
        String last4name = "";  
        if (phone.length()> 4) {
            last4num = phone.substring(phone.length() - 4);
        } else {
            last4num = phone;
        }
        if (name.length() > 4) {
            last4name = name.substring(0, 4);
        } else {
            last4name = name;
        }
        System.out.println(last4name + last4num);
        sc.close();
    }
}
