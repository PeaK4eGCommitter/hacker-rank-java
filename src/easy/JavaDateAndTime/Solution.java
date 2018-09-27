package JavaDateAndTime;

import java.util.Scanner;
import java.time.LocalDate;

public class Solution {

    private static String getDay(String day, String month, String year) {
        int y = Integer.parseInt(year);
        int m = Integer.parseInt(month);
        int d = Integer.parseInt(day);
        LocalDate localDate = LocalDate.of(y, m, d);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.name();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String month = in.next();
        String day = in.next();
        String year = in.next();

        System.out.println(getDay(day, month, year));
    }
}