package level14.localTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class LocalTimeMethods {

    public static void main(String[] args) {
        LocalTime time = LocalTime.now(); // 23:07:48.553861
        System.out.println(time);

    // Получаем заданное время LocalTime time = LocalTime.of(часы, минуты, секунды, наносекунды);
        // также LocalTime time = LocalTime.of(часы, минуты, секунды);
        // также LocalTime time = LocalTime.of(часы, минуты);
        LocalTime time1 = LocalTime.of(12,15,0,100);
        System.out.println(time1); // 12:15:00.000000100

        // Получение времени по номеру секунды в сутках (количество секунд прошедшее с начала суток)
        LocalTime secondOfDay = LocalTime.ofSecondOfDay(1000);
        System.out.println(secondOfDay);

        // int getHour (возвращает часы)
        // int getMinute() (возвращает минуты)
        // int getSecond (возвращает секунды)
        // int getNano (возвращает наносекунды)
        /*
        * */

    }
}
