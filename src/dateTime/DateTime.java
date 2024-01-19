package dateTime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String []args) {
        LocalDateTime localDateTime0 = LocalDateTime.of(2023,10,26,5,2,20); // 2023 October 26 05 02 20
        //System.out.println(localDateTime);
        System.out.printf("LocalDateTime : %tY %<tB %<td %<tI %<tM %<tS \n",localDateTime0);  // 10/26/23
        System.out.printf("LocalDateTime : %tD \n",localDateTime0);

        LocalDateTime localDateTime1 = LocalDateTime.now(); // End of Week2023-11-01T23:59:59.999999999
        LocalDateTime localDateTime2 = LocalDateTime.now().minusWeeks(1); // Start of Week2023-10-25T00:00
        LocalDateTime localDateTime3 = localDateTime2.plusWeeks(1);
        System.out.println("Start of Week"+localDateTime2.with(LocalTime.MIN));
        System.out.println("End of Week"+localDateTime1.with(LocalTime.MAX));
        //System.out.println(" of Day"+localDateTime3);
        System.out.println("===============================");
        LocalDateTime localDateTime4 = LocalDate.now().atStartOfDay(); // 2023-11-01T00:00
        LocalDate localDate = LocalDateTime.now().toLocalDate(); //2023-11-01

        int localDateTime5 = LocalDateTime.now().getDayOfYear(); // 305 days month
        int localDateTime6 = LocalDateTime.now().getYear(); // year month
        System.out.println(localDateTime4);
        System.out.println(localDate);
        System.out.println(localDateTime5);
        System.out.println(localDateTime6);
        //System.out.println(localDateTime);



    }
}
