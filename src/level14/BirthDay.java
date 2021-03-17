package level14;

import java.util.Calendar;

public class BirthDay {
    static Calendar birthDate = Calendar.getInstance();

    public static void main(String[] args) {
        birthDate.set(1993, Calendar.MAY, 25);
        System.out.println(getDayOfWeek(birthDate));
    }
    static String getDayOfWeek(Calendar calendar) {
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case (2) : return "Понедельник";
            case (3) : return "Вторник";
            case (4) : return "Среда";
            case (5) : return "Четверг";
            case (6) : return "Пятница";
            case (7) : return "Суббота";
            case (1) : return "Воскресенье";
        }
        return null;
    }
}
