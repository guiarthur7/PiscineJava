import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.*;
import java.util.*;

public class FormatDate {

    public static String formatToFullText(LocalDateTime dateTime) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM", Locale.FRANCE);

        int annee = dateTime.getYear();
        String mois = dateTime.format(formatter);
        int jour = dateTime.getDayOfMonth();
        int heures = dateTime.getHour();
        int minutes = dateTime.getMinute();
        int secondes = dateTime.getSecond();

        return String.format("Le %d %s de l'an %d à %dh%dm et %ds", jour, mois, annee, heures, minutes, secondes);
    }

    public static String formatSimple(LocalDate date) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM", Locale.ITALIAN);

        String mois = date.format(formatter);
        int jour = date.getDayOfMonth();
        String annee = String.valueOf(date.getYear());

        return String.format("%s %d %s", mois, jour, annee.substring(2));
    }

    public static String formatIso(LocalTime time) {
        return time.toString();
    }
}