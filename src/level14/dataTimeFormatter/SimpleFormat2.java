package level14.dataTimeFormatter;

import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class SimpleFormat2 {

    static ZonedDateTime zonedDateTime = ZonedDateTime.now();

    public static void main(String[] args) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("e d.M.yy HH:mm:ss.n VV");
        System.out.println(formatter.format(zonedDateTime));

    }
}
