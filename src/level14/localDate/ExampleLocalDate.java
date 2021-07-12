package level14.localDate;

import java.time.LocalDate;
import java.time.Month;

public class ExampleLocalDate {
    public static void main(String[] args) {
        System.out.println(nowExample());
        System.out.println(ofExample());
        System.out.println(ofYearDayExample());
        System.out.println(ofEpochDayExample());

    }
    static LocalDate nowExample() {
        LocalDate date = LocalDate.now();
        return date;
    }
    static LocalDate ofExample() {
        LocalDate date = LocalDate.of(2020, Month.SEPTEMBER, 12);
        return date;
    }
    static LocalDate ofYearDayExample() {

        return LocalDate.ofYearDay(2020, 256);
    }
    static LocalDate ofEpochDayExample() {
        LocalDate date = LocalDate.ofEpochDay(18517);
        return date;
    }
}
