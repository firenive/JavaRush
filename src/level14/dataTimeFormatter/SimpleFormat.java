package level14.dataTimeFormatter;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleFormat {
    static LocalDateTime localDateTime = LocalDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy'г'. H'ч'.m'мин'");
        String time = formatter.format(localDateTime);
        System.out.println(time);
    }
}
