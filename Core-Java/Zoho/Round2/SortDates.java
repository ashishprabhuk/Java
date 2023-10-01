package Zoho.Round2;
import java.text.*;
import java.util.*;

public class SortDates {
    public static void main(String[] args){
        String[] dates = {
            "01 Mar 2015",
            "11 Apr 1996",
            "22 Oct 2007"
        };

        // Create a custom comparator to sort dates
        Comparator<String> dateComparator = new Comparator<String>() {
            @Override
            public int compare(String date1, String date2) {
                try {
                    SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy");
                    Date d1 = sdf.parse(date1);
                    Date d2 = sdf.parse(date2);
                    return d1.compareTo(d2);
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        };

        // Sort the dates using the custom comparator
        Arrays.sort(dates, dateComparator);

        // Print the sorted dates
        for (String date : dates) {
            System.out.println(date);
        }
    }
}