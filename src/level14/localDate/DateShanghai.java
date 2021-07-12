package level14.localDate;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;

public class DateShanghai {
    public static void main(String[] args) {
        // Получаем дату, в часовом поясе Шанхая
        ZoneId timezone = ZoneId.of("Asia/Shanghai");
        LocalDate today = LocalDate.now(timezone);
        System.out.println("Сейчас в Шанхае = " + today);

        // Получение конкретной даты
        LocalDate date = LocalDate.of(2019, Month.FEBRUARY, 22);
        LocalDate date2 = LocalDate.of(1993, 5, 25); // Месяцы нумеруются с единицы

        // Получаем дату с помощью метода ofYearDay. В качестве передается номер года и номер дня года

        LocalDate date1 = LocalDate.ofYearDay(2021, 150);
        System.out.println(date1); // 2021-05-30

        // Unix Time (Дата с 1 января 1970
        LocalDate unix = LocalDate.ofEpochDay(1200); // В качества параметра передаем количество дней прошеших с 1 января 1970
        System.out.println(unix); // 1973-04-15




    }
}
