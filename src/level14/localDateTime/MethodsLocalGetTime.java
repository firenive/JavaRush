package level14.localDateTime;

import java.time.LocalDateTime;
import java.time.Month;

public class MethodsLocalGetTime {
    public static void main(String[] args) {
        /* LocalDateTime time = LocalDateTime.now();
            System.out.println("Сейчас = " + time);

        of (int year, int month, int day, int hour, int minute)
        of (int year, int month, int day, int hour, int minute, int second)
        of (int year, int month, int day, int hour, int minute, int second, int nano)
        of (int year, Month month, int day, int hour, int minute)
        of (int year, Month month, int day, int hour, int minute, int second)
        of (int year, Month month, int day, int hour, int minute, int second, int nano)
        of (LocalDate date, LocalTime time)
            */
        LocalDateTime dateTime = LocalDateTime.of(1999, Month.APRIL, 24, 15,17,16);
        System.out.println(dateTime); // 1999-04-24T15:17:16

    }
}
