package JavaCore;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateFormat {
    public static void main(String[] args) {
         // SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/mm/yy");
    LocalDate ld = LocalDate.now();
    DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MMMM/uuuu");
    System.out.println(ld.format(df));  

    LocalDate date = LocalDate.of(2022, Month.APRIL, 1);

        LocalDate date2 = LocalDate.of(2022, Month.AUGUST, 23);
        date2.getDayOfWeek();
        // Custom Temporal Adjuster
        TemporalAdjuster ta = t -> t.minus(Period.ofMonths(2)); 
        System.out.println(date.with(TemporalAdjusters.next(DayOfWeek.TUESDAY)));
    }
   
}
