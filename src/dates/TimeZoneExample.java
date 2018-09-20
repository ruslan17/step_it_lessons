package dates;

import java.util.Locale;
import java.util.TimeZone;

public class TimeZoneExample {

    public static void main(String[] args) {
        TimeZone timeZone = TimeZone.getTimeZone("Europe/Moscow");
        System.out.println(timeZone.getDisplayName(false, TimeZone.LONG, Locale.FRENCH));
        System.out.println(timeZone.getDisplayName(true, TimeZone.LONG, Locale.ENGLISH));
        System.out.println(timeZone.getDisplayName());
    }


}
