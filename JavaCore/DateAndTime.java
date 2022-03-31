package JavaCore;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.TimeZone;
import java.util.Timer;
import java.util.TimerTask;

public class DateAndTime {
    public static void main(String[] args) {
        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        
       /* String[] tzones = TimeZone.getAvailableIDs();
        for (String s : tzones) {
             System.out.println(s);
        }*/

        Timer t = new Timer();
        System.out.println(LocalDateTime.now(ZoneId.of("Hongkong"))); 
        t.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Mr.LK");
            }
        }, 5000);
    }
}
