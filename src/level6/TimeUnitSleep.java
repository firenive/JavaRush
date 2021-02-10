package level6;

import java.util.concurrent.TimeUnit;

public class TimeUnitSleep {
    public static void setTimer(int days, int hours, int minutes, int seconds, int millis) throws InterruptedException {
        System.out.println("Таймер запущен!");
        //напишите тут ваш код
        TimeUnit.DAYS.sleep(days);
        TimeUnit.HOURS.sleep(hours);
        TimeUnit.MINUTES.sleep(minutes);
        TimeUnit.SECONDS.sleep(seconds);
        TimeUnit.MILLISECONDS.sleep(millis);

        System.out.println("♬ ♪ ♬♬♬♬ ♪♪♪♪");
    }
}
