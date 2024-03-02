package Zoho.Round2.Arrays;

public class TotalDayBetDates {
    public static void main(String[] args) {
        int[] dt1 = {10, 2, 2014};
        int[] dt2 = {10, 3, 2015};

        int totalDays = getTotalDays(dt1, dt2);
        System.out.println(totalDays);
    }

    public static int getTotalDays(int[] dt1, int[] dt2) {
        int day1 = dt1[0];
        int month1 = dt1[1];
        int year1 = dt1[2];

        int day2 = dt2[0];
        int month2 = dt2[1];
        int year2 = dt2[2];

        int totalDays = 0;

        // Calculate the total number of days for each year between the two dates
        for (int year = year1; year <= year2; year++) {
            if (isLeapYear(year)) {
                totalDays += 366;
            } else {
                totalDays += 365;
            }
        }
        // Calculate the total number of days for each month between the two dates
        for (int month = 1; month < month1; month++) {
            totalDays -= getDaysInMonth(month, year1);
        }
        totalDays -= day1;

        for (int month = 1; month < month2; month++) {
            totalDays += getDaysInMonth(month, year2);
        }
        totalDays += day2;

        return totalDays;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static int getDaysInMonth(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        } else {
            return 31;
        }
    }
}

/*
Given two dates, find total number of days
between them.

Input: dt1 = {10, 2, 2014} dt2 = {10, 3, 2015}
Output: 393

dt1 represents “10-Feb-2014” and dt2 represents
“10-Mar-2015” The difference is 365 + 28

Input: dt1 = {10, 2, 2000} dt2 = {10, 3, 2000}
Output: 29
Note that 2000 is a leap year

Input: dt1 = {10, 2, 2000} dt2 = {10, 2, 2000}
Output: 0
Both dates are same

Input: dt1 = {1, 2, 2000}; dt2 = {1, 2, 2004};
Output: 1461
Number of days is 365*4 + 1
*/