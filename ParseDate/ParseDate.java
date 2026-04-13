import java.time.*;
import java.time.format.*;
import java.util.*;

public class ParseDate {

    public static LocalDateTime parseIsoFormat(String stringDate) {
        return LocalDateTime.parse(stringDate);
    }

    public static LocalDate parseFullTextFormat(String stringDate) {
        DateTimeFormatter Formatter = DateTimeFormatter.ofPattern("EEEE d MMMM yyyy", Locale.FRENCH);
        return LocalDate.parse(stringDate, Formatter);

    }

    public static LocalTime parseTimeFormat(String stringDate) {
        String[] parts = stringDate.split("\\D+");

        int heure = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        int seconde = Integer.parseInt(parts[2]);

        if (stringDate.contains("du soir")) {
            heure += 12;
        } else if (stringDate.contains("du matin") && heure == 12) {
            heure = 0;
        }
        LocalTime time = LocalTime.of(heure, minute, seconde);
        return time;
    }
}