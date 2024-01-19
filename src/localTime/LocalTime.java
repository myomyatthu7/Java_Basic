package localTime;

import dateTime.DateTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class LocalTime {
    public static void main(String[] args) {
        java.time.LocalTime localTime = java.time.LocalTime.now(); // 14:43:42.312077500
        java.time.LocalTime localTime1 = java.time.LocalTime.of(2,36,50);
        java.time.LocalTime localTime2 = java.time.LocalTime.parse("02:36:20");
        java.time.LocalTime localTime3 = java.time.LocalTime.MIN;
        java.time.LocalTime localTime4 = java.time.LocalTime.MAX;
        java.time.LocalTime localTime5 = java.time.LocalTime.now().withHour(23); // 23:41:59.205553700
        java.time.LocalTime localTime6 = java.time.LocalTime.now().minusHours(10); // 04:43:42.323071100
        int localTime7 = java.time.LocalTime.now().getMinute(); // 43
        ZonedDateTime zonedDateTime = ZonedDateTime.now(); // 2023-11-01T14:45:50.877714+06:30[Asia/Rangoon]
        ZoneOffset zonedDateTime1 = zonedDateTime.getOffset(); // +06:30
        DayOfWeek  zonedDateTime2 = zonedDateTime.toOffsetDateTime().getDayOfWeek();
        ZonedDateTime zonedDateTime3 = ZonedDateTime.of(LocalDateTime.now(),ZoneId.of("Asia/Rangoon"));
        System.out.println(localTime);
        System.out.println(localTime1);
        System.out.println(localTime2);
        System.out.println(localTime3);
        System.out.println(localTime4);
        System.out.println(localTime5);
        System.out.println(localTime6);
        System.out.println(localTime7);
        System.out.println(zonedDateTime);
        System.out.println(zonedDateTime1);
        System.out.println(zonedDateTime2);
        System.out.println(zonedDateTime3);
    }
}
