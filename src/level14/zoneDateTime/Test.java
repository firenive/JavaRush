package level14.zoneDateTime;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(ZoneId.of("Asia/Shanghai"));
        System.out.println(date);
    }
}
