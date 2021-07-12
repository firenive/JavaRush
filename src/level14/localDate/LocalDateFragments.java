package level14.localDate;

import java.time.LocalDate;
import java.time.Month;

public class LocalDateFragments {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today.getYear()); // год 2021
        System.out.println(today.getMonth()); // месяц  MARCH
        System.out.println(today.getMonthValue()); // порядковый номер месяца  3
        System.out.println(today.getDayOfMonth()); // день месяца  18
        System.out.println(today.getDayOfWeek()); // день недели  THURSDAY

        // Изменение даты в объекте LocalDate. Объект класса является immutable. Каждый раз возвращается новый объект класса
        LocalDate change = LocalDate.of(1969, Month.MAY, 13);
        System.out.println(change.plusDays(2)); // 1969-05-15
        System.out.println(change.plusWeeks(-2)); // 1969-04-29
        System.out.println(change.plusMonths(1)); //1969-06-13
        System.out.println(change.plusYears(10)); // 1979-05-13

        System.out.println(change.minusDays(1)); // 1969-05-12
        System.out.println(change.minusWeeks(7)); // 1969-03-25
        System.out.println(change.minusMonths(3)); // 1969-02-13
        System.out.println(change.minusYears(10)); // 1959-05-13
    }
}
