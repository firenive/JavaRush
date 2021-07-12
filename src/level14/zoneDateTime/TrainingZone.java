package level14.zoneDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.TreeSet;

public class TrainingZone {
    public static void main(String[] args) {
        TreeSet<String> sortedZones = getSortedZones();
        System.out.println(sortedZones.size());
        System.out.println(sortedZones.first());
        System.out.println(sortedZones.last());

        System.out.println(getBeijingTime());
    }

    static TreeSet<String> getSortedZones() {
        TreeSet<String> result = new TreeSet<>();
        result.addAll(ZoneId.getAvailableZoneIds());
        return  result;
    }

    static ZonedDateTime getBeijingTime() {
        ZoneId beijing = ZoneId.of("Asia/Shanghai");
        ZonedDateTime time = ZonedDateTime.now(beijing);
        return time;
    }
}
