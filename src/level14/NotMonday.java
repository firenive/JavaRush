package level14;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NotMonday {
    static Date birthDate = new Date(93, 4, 25);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));

    }

    static String getDayOfWeek(Date date) {
        SimpleDateFormat format = new SimpleDateFormat("EEEE");
        String message = format.format(date);
        switch (message.toLowerCase()) {
            case ("monday") : return "Понедельник";
            case ("tuesday") : return "Вторник";
            case ("wednesday") :return "Среда";
            case ("thursday") : return  "Четверг";
            case ("friday") : return "Пятница";
            case ("saturday") : return "Суббота";
            case ("sunday") : return "Воскресенье";
        }
        return null;

    }
}
