package Zoho.Round3.BusResv;
import java.util.*;

public class BusMain {
    public static void main(String[] args) {
        int user = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to book or 2 to Exit!");
        while(user == 1){
            user = sc.nextInt();
            if(user == 1){
                System.out.println("Booking..");
            }else{
                System.out.println("Exited");
                break;
            }
        }
        sc.close();
    }
}
