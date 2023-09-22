package LOCALDATETİME;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTime {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        System.out.println(today);
        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(today.format(dtf));
        LocalTime time= LocalTime.now();
        System.out.println(time);
        System.out.println(today.getDayOfYear());
        System.out.println(today.plusDays(25).plusMonths(3).plusYears(3));
    }
}
