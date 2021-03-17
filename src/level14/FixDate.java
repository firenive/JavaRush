package level14;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class FixDate {
    public static void main(String[] args) {
        List<Date> dateList = new ArrayList<>();
        dateList.add(new Date(2015,12,25,20,40));
        dateList.add(new Date("July 20, 1969"));
        dateList.add(new Date(1989, 11, 9));
        dateList.add(new Date("January 1, 2000"));
        System.out.println("before fixes:");
        dateList.forEach(System.out::println);
        fixDate(dateList);
        System.out.println("after fixes");
        dateList.forEach(System.out::println);
    }

    static void fixDate(List<Date> brokenDates) {
        Date current = new Date();
        int year;
        int month;
        for (Date d : brokenDates) {
            if (d.after(current)) {
                year = d.getYear() - 1900;
                month = d.getMonth() -1;
                d.setYear(year);
                d.setMonth(month);
            }
        }


    }
}
