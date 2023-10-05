package Zoho.Round2.Arrays;
import java.text.*;
import java.util.*;

public class SortDates {
    public static void main(String[] args){
        String[] dates = {
            "21 Apr 2003",
            "02 Apr 2003",
            "29 Aug 2009",
            "05 Jan 1982",
            "14 Jan 1970"
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

/*
 * Q1. Given dates in day,month, year order sort them.
 */