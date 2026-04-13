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
        if (stringDate == null) {
            return null;
        }

        String[] s = stringDate.split("\\D+");
        int heure = Integer.parseInt(s[0]);
        int minute = Integer.parseInt(s[1]);
        int seconde = Integer.parseInt(s[2]);

        String lowerDate = stringDate.toLowerCase();

        if (lowerDate.contains("soir") || lowerDate.contains("après-midi")) {
            if (heure != 12) {
                heure += 12;
            }
        } else if (lowerDate.contains("matin")) {
            if (heure == 12) {
                heure = 0;
            }
        }

        return LocalTime.of(heure, minute, seconde);
    }
}