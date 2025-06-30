import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;

public class Java8FeaturesDateTime {
    public static void main(String[] args) {
        //LocalDate d=LocalDate.now();
        LocalDate d=LocalDate.now();
        System.out.println(d);
        LocalTime t= LocalTime.now(ZoneId.of("America/Cuiaba"));
        System.out.println(t);

        for(String i : ZoneId.getAvailableZoneIds()){
            System.out.println(i);
        }
    }
}
