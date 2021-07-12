package level14.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.*;

public class SynthesisLocalDateTime {
    public static void main(String[] args) {
        Map<LocalDate, List<LocalTime>> dateMap = DateTimeGenerator.generateDateMap();
        printCollection(dateMap.entrySet());
        Set<LocalDateTime> dataSet = convert(dateMap);
        printCollection(dataSet);
    }

    static Set<LocalDateTime> convert(Map<LocalDate, List<LocalTime>> sourceMap) {
        Set<LocalDateTime> dataSet = new HashSet<>();
        LocalDateTime dateTime;
        for (Map.Entry<LocalDate, List<LocalTime>> entry: sourceMap.entrySet()) {
            for (LocalTime time : entry.getValue()) {
                dateTime = LocalDateTime.of(entry.getKey(),time);
                dataSet.add(dateTime);
            }
        }
        return dataSet;
    }

    static void printCollection(Collection<?> collection) {
        System.out.println("-----------------------------------------------------");
        collection.forEach(System.out::println);
    }
}
