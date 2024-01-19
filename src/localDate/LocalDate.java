package localDate;

import java.time.Clock;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDate {
    public static void main(String[] args) {

        //ZoneId zone = ZoneId.systemDefault();
        ZoneId zone = ZoneId.of("Africa/Harare");
        System.out.println(zone);
        //Clock clock = Clock.systemDefaultZone();
        //Clock clock1 = Clock.system(zone);
        Clock clock = Clock.system(zone);
        java.time.LocalDate localDate = java.time.LocalDate.now(clock);
    
        System.out.println(localDate);
        System.out.println("============================");
        System.out.println(clock);
        java.time.LocalDate localDate1 = java.time.LocalDate.of(2023,10,30);
        java.time.LocalDate localDate2 = java.time.LocalDate
                .parse("2023-10-30")
                .with(TemporalAdjusters.lastDayOfYear());
        System.out.println(localDate1);
        System.out.println(localDate2);

        int localDate3 = java.time.LocalDate.now().getDayOfMonth(); //31
        DayOfWeek localDate4 = java.time.LocalDate.now().getDayOfWeek(); // TUESDAY
        int localDate5 = java.time.LocalDate.now().getDayOfYear(); //304
        int localDate6 = java.time.LocalDate.now().getYear(); // 2023 getMonth
        boolean localDate7 = java.time.LocalDate.now().isLeapYear(); // false
        boolean bol1 = localDate1.isEqual(localDate.minus(1, ChronoUnit.DAYS)); // true // isAfter
        boolean bol2 = localDate1.isBefore(localDate); // true // isAfter
        System.out.println(localDate3);
        System.out.println(localDate4);
        System.out.println(localDate5);
        System.out.println(localDate6);
        System.out.println(localDate7);
        System.out.println(bol1);
        System.out.println(bol2);
    }
}
